import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int rank = 1;
        int max = emergency[0];
        int idx = 0;
        while (true) {
            for (int i = 0; i < emergency.length; i++) {
                if (max <= emergency[i]) {
                    max = emergency[i];
                    idx = i;
                }
                if (i == emergency.length - 1) {
                    emergency[idx] = 0;
                    answer[idx] = rank;
                    rank++;
                    max = 0;
                }
            }
            if (rank > emergency.length) {
                break;
            }
        }
        return answer;
    }
}