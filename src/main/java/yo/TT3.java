package yo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TT3 {

    public static int[] solution(int[] balance, int[][] transaction, int[] abnormal) {

        List<Stack<Money>> stackList = new ArrayList<Stack<Money>>();
        for (int i = 0; i < balance.length; i++) {
            stackList.add(new Stack<Money>());
        }
        // user별 balance 초기화
        for (int i = 0; i < balance.length; i++) {
            final int index = i;
            Stack<Money> stack = stackList.get(i);
            boolean isAbnormal = Arrays.stream(abnormal).anyMatch(it -> it - 1 == index);
            for (int j = 0; j < balance[i]; j++) {
                if (isAbnormal) {
                    stack.push(Money.NORMAL_MONEY);
                } else {
                    stack.push(Money.ABNORMAL_MONEY);
                }
            }
        }

        for (int i = 0; i < transaction.length; i++) {
            Stack<Money> source = stackList.get(transaction[i][0] -1);
            Stack<Money> target = stackList.get(transaction[i][1] -1);
            for (int j = 0; j < transaction[i][2]; j++) {
                target.push(source.pop());
            }
        }

        int[] answer = new int[balance.length];
        int moneyCnt = 0;
        for (int i = 0; i < answer.length; i++) {
            Stack<Money> source = stackList.get(i);
            while(source.isEmpty()) {
                if (!source.pop().isAbnormal()) {
                    ++moneyCnt;
                }
            }
            answer[i] = moneyCnt;
            moneyCnt = 0;
        }

        return answer;
    }

    static class Money {

        public static final Money ABNORMAL_MONEY = fromAbNormal(true);
        public static final Money NORMAL_MONEY = fromAbNormal(false);
        private final boolean abnormal;

        private Money(boolean abnormal) {

            this.abnormal = abnormal;
        }

        public static Money fromAbNormal(boolean abnormal) {

            return new Money(abnormal);
        }

        public boolean isAbnormal() {

            return this.abnormal;
        }
    }
}
