package algorithm.caesar_cipher_15;

public class CaesarCipher {

    private static final int ALPHA_INDEX = 26;

    public static String solution(String s, int n) {

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(c);
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                result.append((char) ('a' + (c + n - 'a') % ALPHA_INDEX));
                continue;
            }
            result.append((char) ('A' + (c + n - 'A') % ALPHA_INDEX));
        }
        return result.toString();
    }
}
