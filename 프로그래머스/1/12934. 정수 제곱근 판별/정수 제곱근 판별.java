class Solution {
    public long solution(long n) {
        // 제곱근
        double sqrtValue = Math.sqrt(n);
        // 제곱근이 정수인지 확인. 정수라면 그 다음 정수의 제곱을 계산
        double answer = sqrtValue % 1 == 0 ? (sqrtValue + 1) * (sqrtValue + 1) : -1;
        return (long) answer;
    }
}