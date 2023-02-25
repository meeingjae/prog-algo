package st;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class TestTest2 {

    public static int solution(int[] stats) {
        // stats는 입장 순서. 순서대로 돌아야한다
        // 팀명 : int teamIndex
        // 팀이 없으면? 일단 생성해
        // 기존 team 가져와서 훑음 -> 들어갈 수 있는 곳이 있다면 추가 -> continue
        // 기존 team 가져와서 훑음 -> 들어갈 수 있는 곳디 없다면 신규 T 추가 후 ad -> continue
        // return team number
        Map<UUID, List<Integer>> map = new LinkedHashMap<>();

        for (int stat : stats) {
            if (map.isEmpty()) {
                UUID id = UUID.randomUUID();
                map.put(id, new ArrayList<>());
                map.get(id).add(stat);
                continue;
            }
            boolean correctFlag = false;
            for (List<Integer> value : map.values()) {
                if (value.stream().allMatch(it -> it < stat) && !correctFlag) {
                    value.add(stat);
                    correctFlag = true;

                }
            }
            if (!correctFlag) {
                UUID id = UUID.randomUUID();
                map.put(id, new ArrayList<>());
                map.get(id).add(stat);
            }
        }
        return map.keySet().size();
    }
}
