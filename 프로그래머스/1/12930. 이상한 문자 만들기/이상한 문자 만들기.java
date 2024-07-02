class Solution {
    public String solution(String s) {
        
        String[] str = s.split(" ", -1);
        
        for (int i = 0; i < str.length; i++) {
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < str[i].length(); j++) {
                if (j % 2 == 0) {
                    tmp.append(Character.toUpperCase(str[i].charAt(j)));
                } else {
                    tmp.append(Character.toLowerCase(str[i].charAt(j)));
                }
            }
            str[i] = tmp.toString();
        }
        return String.join(" ", str);
    }
}