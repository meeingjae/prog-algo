package yo;

import java.util.Arrays;
import java.util.List;

public class TT2 {

    private static final int MAX_DAYS = 30;
    private static final int RELAX    = 1;

    public static int solution(int leave, String day, int[] holidays) {
        // 주말과 공휴일은 겹칠 수 있다
        // 휴가 가능 날자 = 1일 ~ 30일

        // 연차 갯수 = leave
        // 달의 첫번째 요일 = day , String (MON, TUE ...)
        // 공휴일 목록 =  holidays , 오름차순
        // 반환 값 = 공휴일 + 연차 갯수를 포함한 총 쉬는 날 수
        List<String> days = Arrays.asList("MON", "TUE", "WED", "TUE", "FRI", "SAT", "SUN");
        int startIndex = 0;

        for (int i = 0; i < days.size(); i++) {
            if (days.contains(day)) {
                startIndex = i;
            }
        }

        // 쉴 수 있는 날, 가능 = 1, 불가능 = 0
        int[][] vacation = new int[MAX_DAYS][1];

        // 토요일, 일요일
        for (int i = 0; i < MAX_DAYS; i++) {
            if (days.get(startIndex) == "SAT" || days.get(startIndex) == "SUN") {
                vacation[i][0] = RELAX;
            }
            startIndex = (startIndex + 1) % 7;
        }
        // 공휴일
        for (int i = 0; i < holidays.length; i++) {
            vacation[holidays[i] - 1][0] = RELAX;
        }

        // 연차는 무조껀 이어서 사용해야 한다
        // 점수
        int[] scoreBoard = new int[MAX_DAYS];
        // 점수 초기화
        for (int i = 0; i < scoreBoard.length; i++) {
            if (vacation[i][0] == RELAX) {
                scoreBoard[i] += 1;
            }
        }

        int leaveableDay = leave;

        for (int j = 0; j < scoreBoard.length - leave; j++) {
            int[] score = scoreBoard.clone();
            for (int i = j; i < score.length; i++) {
                if (leaveableDay == 0) {
                    break;
                }
                if (score[i] != RELAX) {
                    score[i] = RELAX;
                    leaveableDay -= 1;
                }
            }
            int tmpLength = 0;
            for (int k = 1; k < score.length; k++) {
                if (score[k - 1] == 1 && score[k] == 1) {
                    tmpLength += 1;
                } else {
                    leaveableDay = Math.max(leaveableDay, tmpLength);
                }
            }
        }
        return leaveableDay;
    }
}
