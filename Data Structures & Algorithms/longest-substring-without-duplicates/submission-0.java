class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashSet<Character> set = new HashSet<>();
        int max = 0;

        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
            }
            else{
                max = Math.max(max,set.size());
                while(s.charAt(i) != s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        max = Math.max(max,set.size());
        return max;
    }
}
