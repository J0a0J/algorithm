import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        // 참가자 저장(값 증가)
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        // 완주자 제거(값 감소)
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 완주하지 못한 참가자 반환 (값이 0이 아닌 경우)
        for (String key : map.keySet()) {
            if (map.get(key) > 0) {
                return key;
            }
        }

        return answer;
    }
}