package algorithm.reverse_to_array_19;

public class ReverseToArray {

    public static int[] solution(long n) {

        int[] answer = new int[String.valueOf(n).length()];
        long cur = n;
        for (int i = 0; i < answer.length; i++) {
            int val = (int) (cur % 10);
            cur = cur / 10;
            answer[i] = val;
        }
        return answer;
    }
}
