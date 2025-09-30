class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> ls = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ls.contains(s.charAt(i))) {
                while (ls.contains(s.charAt(i))) {
                    ls.remove(0);
                }
            }
            ls.add(s.charAt(i));
            length = Math.max(length, ls.size());
        }
        return length;
    }
}
