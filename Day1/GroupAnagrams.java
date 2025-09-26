import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hs = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            if (!hs.containsKey(s)) {
                hs.put(s, new ArrayList<>());
            }
            hs.get(s).add(strs[i]);
        }
        List<List<String>> ans = new ArrayList<>();
        ans.addAll(hs.values());
        return ans;

    }
}