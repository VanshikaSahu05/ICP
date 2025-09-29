class Solution {
    public static void helper(char[][] grid,int r,int c){
        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length || grid[r][c]=='0'){
            return ;
        }
        grid[r][c] = '0';
        int[][] dir ={{0,1},{1,0},{0,-1},{-1,0}};
        for(int i=0;i<4;i++){
            helper(grid,r+dir[i][0],c+dir[i][1]);
        }
    }
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count=0;
        for(int i =0 ;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    helper(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
}