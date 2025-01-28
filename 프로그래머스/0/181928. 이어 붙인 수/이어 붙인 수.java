class Solution {
    public int solution(int[] num_list) {
        
        String even = "", odd = "";
        
        for (int num : num_list) {
            if (num % 2 == 1) {
                odd += num;
            } else if (num % 2 == 0) {
                even += num;
            }
        }
        
        return Integer.parseInt(even) + Integer.parseInt(odd);
    }
}