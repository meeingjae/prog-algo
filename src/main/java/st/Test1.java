package st;

public class Test1 {

    public static int solution(int n) {

        String a = "";
        for (int i = 0; i < 10000000; i++) {
            a = a.concat(String.valueOf(i));
        }
        return Integer.parseInt(String.valueOf(a.charAt(n)));
    }
}
