class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        int prev = numLog[0];
        
        for (int i = 1; i < numLog.length; i++) {
            int n = numLog[i] - prev;
            
            switch(n) {
                case 1: answer.append('w'); break;
                case -1: answer.append('s'); break;
                case 10: answer.append('d'); break;
                case -10: answer.append('a'); break;
            }
            prev = numLog[i];
        }
        return answer.toString();
    }
}