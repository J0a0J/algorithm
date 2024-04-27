import java.util.*;

class Solution {
    public int[] solution(String[] wallpaper) {
        
        int lux = 0;
        int luy = 0;
        int rdx = 0;
        int rdy = 0;
        boolean check = false; // 파일이 있었는지 여부 확인
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    if (check == false) { // 이전에 파일이 없었다면 값을 다 저장해줘야 함.
                        check = true;
                        lux = i; 
                        luy = j;
                        rdx = i;
                        rdy = j;
                    }
                    if (lux > i) { lux = i; }
                    if (luy > j) { luy = j; }
                    if (rdx < i) { rdx = i;}
                    if (rdy < j) { rdy = j; }
                }
            }
        }
        // 드래그 마무리 할 때 1을 더해줘야 함.
        int[] answer = {lux, luy, rdx + 1, rdy + 1};
        return answer;
    }
}