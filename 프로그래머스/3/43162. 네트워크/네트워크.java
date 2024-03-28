class Solution {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n+1];
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                dfs(i, computers, n);
                answer++;
            }
        }
        return answer;
    }
    public void dfs(int i, int[][] computers, int n){
        visited[i] = true;
        
        for(int j = 0; j < n; j++){
            if(visited[j] == false && computers[i][j] == 1)
                dfs(j, computers, n);
        }
    }
}