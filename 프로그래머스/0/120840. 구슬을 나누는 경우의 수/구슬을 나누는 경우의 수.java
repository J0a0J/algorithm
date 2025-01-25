import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        
        return factorial(balls)
            .divide(factorial(balls-share).multiply(factorial(share)));
    }
    
    public BigInteger factorial(int num) {
        if (num <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(num).multiply(factorial(num - 1));
    }
}