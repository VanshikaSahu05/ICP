class Solution {
    public static boolean visited(int sr,int sc,int dr,int dc,int[][] visited){
        return (sr>=0 && sr<=dr && sc>=0 && sc<=dc && visited[sr][sc]==0);
    }
    public static void uniquePath(int sr,int sc,int dr,int dc,int[][] visited,int[] ans){
        if(sr==dr && sc==dc){
            ans[0]=ans[0]+1;
            return;
        }
        int[] row = {0,1};
        int[] col = {1,0};
        if(visited(sr,sc,dr,dc,visited)){
            visited[sr][sc]=1;
            for(int i=0;i<2;i++){
                uniquePath(sr+row[i],sc+col[i],dr,dc,visited,ans);
            }
            visited[sr][sc]=0;
        }
    }
    public int uniquePaths(int m, int n) {
        int[][] visited = new int[m][n];
        int[] ans = new int[1];
        uniquePath(0,0,m-1,n-1,visited,ans);
        return ans[0];
    }
}