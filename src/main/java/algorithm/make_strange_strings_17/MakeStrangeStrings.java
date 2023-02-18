package algorithm.make_strange_strings_17;

public class MakeStrangeStrings {
    private static final int INDEX = 32;

    public static String solution(String s) {
        // a = 65
        // A = 97
        // 홀수 : 소문자 1,3,5
        // 짝수 : 대문자 0,2,4...
        final StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(char c : s.toCharArray()) {
            if(c == ' ') {
                sb.append(c);
                cnt = 0;
                continue;
            }
            if(cnt % 2 == 1) { // 홀수 - 소문자(97)
                if(c >= 97) {
                    sb.append(c);
                } else {
                    sb.append((char)(c + INDEX));
                }
            } else { //짝수 - 대문자 (65)
                if (c < 97) {
                    sb.append(c);
                } else {
                    sb.append((char)(c - INDEX));
                }
            }
            cnt++;
        }
        return sb.toString();
    }
}
