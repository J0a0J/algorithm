class Solution {
    public int solution(String binomial) {

        String[] parts = binomial.split(" ");
        
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[2]);
        
        char op = parts[1].charAt(0);
        
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
        }
        return 0;
    }
}