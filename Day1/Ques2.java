import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int l = nums.length;
        int res[] = new int[l-k+1];
        
        int idx=0;
        Deque<Integer> max = new ArrayDeque<>();
        for(int i=0;i<l;i++){
            if(!max.isEmpty() && max.peekFirst()<=i-k)
            max.pollFirst();
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[i])
            max.pollLast();
            max.offerLast(i);

            if(i>=k-1){
                res[idx] = nums[max.peekFirst()];
                idx++;
            }
        }
        return res;
    }
}