package yo;

import java.util.HashMap;
import java.util.Map;

public class TT1 {

    private static final int SPAM_ALERT = 1;
    private static final int NON_ALERT  = 0;

    public static int[] solution(String[] approved, String[] spams, String[] calls, int k) {
        // approved = 연락처 목록
        // spams = 스팸 목록
        // calls  = 걸려온 전화 목록
        // k = 연락처 목록에 없는 전화 중, k번째 이전까지 걸려온 전화에 대해서는 스팸 처리를 한다
        // answer = Collection 형태로, calls 들어온 순서로 스팸이면 1, 스팸이 아니면 0 값을 추가한다

        // 전화번호는 중복될 수 없다. HashMap으로 처리한다
        // 해시맵의 값은 <전화번호,call 갯수> 로 표현한다
        // call이 스팸인지에 대한 체크는
        // 1. spams에 존재하는지
        // 2. approved에 존재하는지
        // 3. 이미 걸려온 전화 목록에 존재하는지
        // 4. 3번이 존재한다면 해당 번호로 몇 번이나 전화가 왔는지

        // 전화번호부 : ["123-4567", "451-2314", "015-1643"]
        // 스팸 번호 : ["111-1111"],
        // call :    ["123-4567", "000-0022", "015-1643", "000-0022", "111-1111", "000-0022", "111-1111", "111-1111"]
        //  2

        int[] answer = new int[calls.length];
        Map<String, Integer> calledMap = new HashMap<String, Integer>();

        // 걸려 온 전화 목록은 순회한다
        for (int i = 0; i < calls.length; i++) {

            String calledNum = calls[i];
            boolean isSpam = false;
            boolean isRegistered = false;
            // 스팸 목록 순회
            for (int j = 0; j < spams.length; j++) {
                // 스팸 목록에 존재하는 번호라면
                if (spams[j] == calledNum) {
                    // 해당 번호는 스팸 표시
                    answer[i] = SPAM_ALERT;
                    isSpam = true;
                    break;
                }
            }
            // 연락처 목록 순회
            for (int j = 0; j < approved.length; j++) {
                // 등록 된 연락처라면
                if (approved[j] == calledNum) {
                    answer[i] = NON_ALERT;
                    isRegistered = true;
                    break;
                }
            }
            if (isSpam || isRegistered) {
                continue;
            }

            // 3. 이미 걸려온 전화 목록에 존재하는지
            if (calledMap.containsKey(calledNum)) {
                // 걸려온 횟수가 k보다 작으면 = 경고 표시 해야함
                if (calledMap.get(calledNum) < k) {
                    answer[i] = SPAM_ALERT;
                    calledMap.put(calledNum, calledMap.get(calledNum) + 1);
                    // 걸려온 회수가 k보다 크면 스팸 경고 X
                } else {
                    answer[i] = NON_ALERT;
                }
                // 이미 걸려온 전화 목록에 존재하지 않는다면?
            } else {
                // 이미 걸려온 전화 목록에 추가하고 스팸 표시
                calledMap.put(calledNum, 1);
                answer[i] = SPAM_ALERT;
            }
        }
        return answer;
    }

}
