public class Ques1 {
    
}
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int s=0;
        int e=col-1;
        while(s<row && e>=0){
            int ele = matrix[s][e];
            if(ele==target){
                return true;
            }
            else if(ele>target){
                e--;
            }
            else{
                s++;
            }
        }
        return false;
    }
}