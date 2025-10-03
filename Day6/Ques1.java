class Solution {
    public static boolean dfs(int row,int col,char[][] mat,String word,int[][] visited,int index){
        if(index==word.length()){
            return true;
        }
        if(!isvalid(row,col,mat,visited,index,word)){
            return false;
        }
        visited[row][col]=1;
        // r,d,l,u
        int[] dr ={1,0,-1,0};
        int[] dc ={0,1,0,-1};
        for(int i=0;i<4;i++){
            if(dfs(row+dr[i],col+dc[i],mat,word,visited,index+1)){
                return true;
            }
        }
        visited[row][col]=0;
        return false;
    }
    public static boolean isvalid(int row,int col,char[][] mat,int[][] visited,int index,String word){
        return row>=0 && row<mat.length && col>=0 && col<mat[0].length && visited[row][col]==0 && mat[row][col]==word.charAt(index);
    }
    public boolean exist(char[][] mat, String word) {
        // Code here
        int row=mat.length;
        int col=mat[0].length;
        int[][] visited=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==word.charAt(0)){
                    if(dfs(i,j,mat,word,visited,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}