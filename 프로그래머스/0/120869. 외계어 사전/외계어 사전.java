import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for(int i = 0; i < dic.length; i++) {
            int check = 0; // 알파벳이 사전에 있을 때 +1
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j]) == true) {
                    check++;
                }
                if (check == spell.length) {
                    return 1;
                }
            }
        }
        return 2;
    }
}