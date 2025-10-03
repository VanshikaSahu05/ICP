class Solution {
    public static void Helper(int[] nums,int target,List<List<Integer>> ans ,List<Integer> ls,int index){
        if(target==0){
            ans.add(new ArrayList(ls));
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>target){
                break;
            }
            ls.add(nums[i]);
            Helper(nums,target-nums[i],ans,ls,i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        Arrays.sort(candidates);
        Helper(candidates,target,ans,ls,0);
        return ans;
    }
}