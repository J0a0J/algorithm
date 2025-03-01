class Solution {
    public String solution(String myString, String pat) {
        
        int mLen = myString.length(), pLen = pat.length();
        
        for (int i = mLen; i >= pLen; i--) {
            if (myString.substring(i - pLen, i).equals(pat)) {
                return myString.substring(0, i);
            }
        }
        
        return "";
    }
}