class Solution {
    public int solution(String myString, String pat) {

        StringBuilder s = new StringBuilder();

        for (char c : myString.toCharArray()) {
            s.append(c == 'A' ? 'B' : 'A');
        }

        return s.toString().contains(pat) ? 1 : 0;
    }
}