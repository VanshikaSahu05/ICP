import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[i-m];
        }
        int l = nums1.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if (nums1[i]>nums1[j]){
                    int temp=nums1[i];
                    nums1[i]=nums1[j];
                    nums1[j]=temp;
                }
            }
        }
        
    }
}