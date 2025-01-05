class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 최소 공배수 계산
        int max = 1; // 최대 공약수
        for (int i = 1; i <= denom1 && i <= denom2; i++) {
            if (denom1 % i == 0 && denom2 % i == 0) {
                max = i;
            }
        }
        int min = (denom1 * denom2) / max; // 최소 공배수

        // 2. 분자 계산 (공통 분모로 맞춘 후 더하기)
        int numer = numer1 * (min / denom1) + numer2 * (min / denom2);

        // 3. 결과를 기약 분수로 만들기 위해 최대 공약수 계산
        max = 1; // 최대 공약수 초기화
        for (int i = 1; i <= Math.abs(numer) && i <= min; i++) {
            if (numer % i == 0 && min % i == 0) {
                max = i;
            }
        }
        numer /= max;
        min /= max;

        // 4. 결과 반환
        return new int[] {numer, min};
    }
}
