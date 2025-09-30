class Solution {
    public static boolean check(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr = new int[26];
        for(int i=0;i<p.length();i++){
            char C = p.charAt(i);
            arr[C-'a'] = arr[C-'a']+1;
        }
        int i=0;
        int j=0;
        ArrayList<Integer> ls = new ArrayList<>();
        while(j<s.length()){
            char chr = s.charAt(j);
            arr[chr-'a'] = arr[chr-'a']-1;
            if(j-i+1 == p.length()){
                if(check(arr)){
                    ls.add(i);
                }
                char pchr = s.charAt(i);
                arr[pchr -'a'] = arr[pchr-'a']+1;
                i++;
            }
            j++;
        }
        return ls;
    }
}