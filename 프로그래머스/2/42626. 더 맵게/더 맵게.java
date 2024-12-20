import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
       
        for (int sc : scoville) {
            heap.add(sc);
        }
        
        while (heap.peek() < K && heap.size() > 1){
            int a = heap.poll();
            int b = heap.poll();
            heap.add(a + b * 2);
            
            answer++;
        }
        return (heap.peek() >= K) ? answer : -1;
    }
}