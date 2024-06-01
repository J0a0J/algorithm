class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            // 두 배열을 이진수 단위로 변환 후 비트 단위 OR 연산 
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            binary = String.format("%" + n + "s", binary).replace(' ', '0'); // 0을 채워서 n자리로 맞추기
            answer[i] = binary.replace('0', ' ').replace('1', '#');
        }
        return answer;
    }
}