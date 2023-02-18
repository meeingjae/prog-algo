package nsus.code;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static String solution(String input) {

        final List<Integer> integerList = new ArrayList<>();
        for (String c : input.split(" ")) {
            integerList.add(Integer.parseInt(c));
        }

        int maxArea = 0;
        for (int i = 0; i < integerList.size(); i++) {
            maxArea = getMaxSize(integerList, maxArea, 0, 1);
        }
        System.out.println(maxArea);

        return String.valueOf(maxArea);
    }

    private static int getMaxSize(List<Integer> integerList, int max, int curIndex, int curNum) {

        if (integerList.size() <= curIndex) {
            return curNum;
        }
        final int cur = integerList.get(curIndex);
        if (cur == 0) {
            return max;
        }
        for (int i = 0; i < cur; i++) {
            if(curNum >= i){
                max = Math.max(max, getMaxSize(integerList, max, ++curIndex, curNum++));
            } else {
                max = Math.max(max, getMaxSize(integerList, max, ++curIndex, i));
            }
        }
        return max;
    }
}
