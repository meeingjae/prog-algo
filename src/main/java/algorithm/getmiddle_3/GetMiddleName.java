package algorithm.getmiddle_3;

public class GetMiddleName {

    public static String solution(String s) {
        if(s == null || s.length() == 0) {
            return "";
        }
        final boolean isEven = s.length() % 2 == 0 ? true : false;
        if (isEven) {
            final int middleIndex = s.length() / 2;
            return String.valueOf(s.charAt(middleIndex-1)) + String.valueOf(s.charAt(middleIndex));
        }
        return String.valueOf(s.charAt(s.length() / 2));
    }
}
