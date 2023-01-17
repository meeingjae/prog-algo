package algorithm.phoncatmon;

import java.util.HashSet;
import java.util.Set;

public class Phoncatmon {

    // n 마리의 포켓몬이 있다
    public int solution(int[] nums) {

        int answer = 0;
        // n 마리의 포켓몬 중 최대 절반의 포켓몬을 가져갈 수 있다
        int availableCnt = nums.length / 2;
        // n 마리의 포켓몬 중 같은 종류의 포켓몬은 가져갈 수 없다
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        if (numSet.size() > availableCnt) {
            answer = availableCnt;
        } else {
            answer = numSet.size();
        }
        return answer;
    }
}
