package nsus.code;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class TestTest4 {

    @Test
    void name() {

        Stopwatch stopwatch = new Stopwatch();
        String input = "A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1,A:1";
        Bank bank = new Bank();
        stopwatch.start();
        bank.open(Arrays.stream(input.split(","))
                .map(TransactionRequest::new)
                .collect(Collectors.toList()));
        bank.open(Arrays.stream(input.split(","))
                .map(TransactionRequest::new)
                .collect(Collectors.toList()));
        bank.open(Arrays.stream(input.split(","))
                .map(TransactionRequest::new)
                .collect(Collectors.toList()));
        stopwatch.stop();
        if (bank.peakRequests <= 1) {
            System.err.println(
                    "WARN: Only one thread is used for processing. It can be a reason of low performance issues.");
        }
        System.out.println("Elapsed time: " + stopwatch.getElapsedTime() + " milliseconds");

        assertThat(bank.getCurrentAccountReport()).isEqualTo("A:300");
    }

    static class TransactionRequest {

        String  accountId;
        Integer amount;

        TransactionRequest(String order) {

            String[] tokens = order.split(":", 2);
            this.accountId = tokens[0].trim();
            this.amount = Integer.valueOf(tokens[1].trim());
        }
    }


    static class Account {

        Integer balance = 0;
        private Lock lock = new ReentrantLock();

        //        Integer transact(Integer amount) {
        //            balance = balance + amount;
        //            return balance;
        //        }

        Integer transact(Integer amount) {

            lock.lock();
            try {
                balance = balance + amount;
            } finally {
                lock.unlock();
            }
            return balance;
        }
    }


    public static class Bank {

        Map<String, Account> accounts;
        int                  peakRequests = 0;

        public Bank() {

            accounts = new HashMap<>();
        }

        //        synchronized Integer request(TransactionRequest request) {
        //            Account account = accounts.get(request.accountId);
        //            if (account == null) {
        //                account = new Account();
        //                accounts.put(request.accountId, account);
        //            }
        //
        //            Integer remain = account.transact(request.amount);
        //
        //            return remain;
        //        }

        Integer request(TransactionRequest request) {

            Account account = getOrMake(request);

            Integer remain = account.transact(request.amount);

            return remain;
        }

        private Account getOrMake(TransactionRequest request) {

            final Account account = accounts.get(request.accountId);
            if (account == null) {
                accounts.put(request.accountId, new Account());
                return accounts.get(request.accountId);
            }
            return account;
        }

        void open(List<TransactionRequest> requests) {
            /* Parallel processing is intended. It's not a reason of the problem. */
            requests.parallelStream().forEach(this::request);
        }

        String getCurrentAccountReport() {

            return accounts.entrySet().stream()
                    .map(e -> String.format("%s:%d", e.getKey(), e.getValue().balance))
                    .collect(Collectors.joining("\n"));
        }
    }


    public static class Stopwatch {

        private long startTime;
        private long endTime;

        public void start() {

            startTime = System.currentTimeMillis();
        }

        public void stop() {

            endTime = System.currentTimeMillis();
        }

        public long getElapsedTime() {

            return endTime - startTime;
        }

        public void reset() {

            startTime = 0;
            endTime = 0;
        }
    }
}
