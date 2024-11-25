class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int one = 0;
        int two = 0;
        if (arr1.length != arr2.length){
            if (arr1.length > arr2.length) {
                return 1;
            } else { return -1; }
        } else {
            for (int i = 0; i < arr1.length; i++) {
                one += arr1[i];
                two += arr2[i];
            }
            if (one > two) {return 1;}
            else if (one == two) {return 0;}
            else {return -1;}
        }
    }
}