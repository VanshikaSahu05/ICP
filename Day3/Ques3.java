class Solution {
    int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public  void dfs(char[][] grid , int r , int c){
        grid[r][c] = '0';
        for(int[] d:dirs){
            int row = r + d[0];
            int col = c + d[1];
            if(row>=0 && row<grid.length && col>=0 && col<grid[0].length && grid[row][col]=='1'){
                dfs(grid,row,col);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
}