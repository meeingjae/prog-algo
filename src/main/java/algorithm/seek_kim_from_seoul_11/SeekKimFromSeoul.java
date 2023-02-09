package algorithm.seek_kim_from_seoul_11;

public class SeekKimFromSeoul {

    private static final String KIM = "Kim";
    public static String solution(String[] seoul) {
        final StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");
        for(int i = 0; i< seoul.length; i++) {
            if (seoul[i].equals(KIM)) {
                sb.append(i);
            }
        }
        sb.append("에 있다");
        return sb.toString();
    }
}
