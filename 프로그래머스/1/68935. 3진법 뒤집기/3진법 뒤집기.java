import java.lang.Math;
import java.util.Arrays;

class Solution {
    public int solution(int nn) {
        long n = nn;
        int answer = 0;
        int num = 0;
        // 새로 만들 배열의 자릿수 구하는 과정
        for (int i = 0; i < 30; i++) {
            if (n >= Math.pow(3,i)) {
                num = i;
            } else break;
        }
        // 3진법으로 만들기 위한 배열
        int[] result = new int[num + 1];
        int[] reverse = new int[num + 1];
        // 3진법으로 만드는 과정
        for (int i = 0; i < num + 1; i++) {
            if (n >= Math.pow(3, num - i)) {
                if (n >= Math.pow(3, num - i) * 2) {
                    result[i] = 2;
                    n -= Math.pow(3, num - i) * 2;
                } else {
                    result[i] = 1;
                    n -= Math.pow(3, num - i);
                }
            } else {
                result[i] = 0;
            }
        }
        
        // 10진법 변환
        for (int i = num; i > -1; i--) {
            answer += Math.pow(3, num) * result[i];
            num--;
            System.out.println(answer);
        }
        
        System.out.println(Arrays.toString(result));
        System.out.println(n);
        
        return answer;
    }
}