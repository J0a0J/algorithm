class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int len = p.length();
        Long ex = Long.parseLong(p);
        
        // t의 전체 길이에서 p의 길이만큼 뺀 후, 
        // p의 길이만큼의 t의 수와 비교하려고 함
        for (int i = 0; i < t.length() - len + 1; i++) {
            Long sub = Long.parseLong(t.substring(i, i + len));
            // t의 수가 p보다 작거나 같다면
            if (sub <= ex) answer++;
        }
        return answer;
    }
}