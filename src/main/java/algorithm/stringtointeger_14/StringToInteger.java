package algorithm.stringtointeger_14;

public class StringToInteger {

    public static int solution(String s) {
        if(Character.isDigit(s.charAt(0))) {
            return Integer.parseInt(s);
        }
        if(s.charAt(0) == '-') {
            return Integer.parseInt(s.split("-")[1]) * -1;
        }
        return Integer.parseInt(s.substring(1));
    }
}
