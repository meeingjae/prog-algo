package algorithm.sooback_13;

public class SooBack {

    public static String solution(int n) {

        if(n == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String result = "수";
        for(int i = 0; i<n; i++) {
            if(result.equals("수")) {
                sb.append(result);
                result = "박";
            } else {
                sb.append(result);
                result = "수";
            }
        }
        return sb.toString();
    }
}
