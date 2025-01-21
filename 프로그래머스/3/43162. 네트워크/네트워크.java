import java.util.Arrays;
import java.util.Stack;

class Solution {
    public boolean[] dfs(int startNode, int[][] computers, boolean[] visited) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(startNode);
        while (!stack.isEmpty()) {
            int vertex = stack.pop();
            if (!visited[vertex]) {
                visited[vertex] = true;
            }

            for (int i = computers[vertex].length - 1; i >= 0; i--) {
                if (computers[vertex][i] == 1 && !visited[i]) {
                    stack.push(i);
                }
            }

        }
        return visited;
    }

    public int solution(int n, int[][] computers) {
        int answer = 1;
        boolean[] visited = new boolean[n];
        while (true) {
            int startNode = 0;
            visited = dfs(startNode, computers, visited);
            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]) {
                    startNode = i;
                }
            }
            if (startNode != 0) {
                visited = dfs(startNode, computers, visited);
                answer += 1;
            } else {
                break;
            }
        }
        return answer;

    }
}