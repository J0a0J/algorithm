import java.util.Arrays;
class Solution {
    public String solution(String rsp) {
        String answer = "";
        String[] arr = rsp.split("");
        
        for (int i = 0; i < rsp.length(); i++) {
            switch(arr[i]) {
                case "0":
                    answer += "5";
                    break;
                case "2":
                    answer += "0";
                    break;
                case "5":
                    answer += "2";
                    break;
            }
        }
        return answer;
    }
}