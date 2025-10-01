class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int sum = 0;
        for(int i:people){
            sum+=i;
        }
        if(sum<=limit){
            return 1;
        }
        int i=0;
        int j = people.length-1;
        int count =0;
        while(i<=j){
            if(people[i]+people[j]<=limit){
                count++;
                i++;
                j--;
            }
            else{
                count++;
                j--;
            }
        }
        return count;
    }
}