class Solution {
    public boolean solution(int x) {
        // 정수를 문자열로 변환
        String numberStr = String.valueOf(x);
        // x의 자릿수 합 저장할 변수
        int sum = 0;
        // 문자열의 각 자릿수를 합산
        for (int i = 0; i < numberStr.length(); i++) {
            sum += numberStr.charAt(i) - '0';
        }
        // 각 자릿수의 합으로 주어진 정수가 나누어지지 않으면 false
        if (x % sum != 0) {
            return false;
        }
        return true;
    }
}