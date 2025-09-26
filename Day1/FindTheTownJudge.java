class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustIn = new int[n+1];
        int[] trustOut = new int[n+1];

        for(int i=0;i<trust.length;i++){
            int in = trust[i][0];
            int out = trust[i][1];
            trustIn[in] +=1;
            trustOut[out] +=1;
        }
        for(int i=1;i<=n;i++){
            if(trustIn[i] == 0 && trustOut[i] == n-1) return i;
        }
        return -1;
    }
}