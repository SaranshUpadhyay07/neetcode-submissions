class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int n = s1.length();
        String s = arrange(s1);
        if(s.equals(arrange(s2.substring(0,n)))) return true;

        for(int i = n; i < s2.length(); i++){
            if(s.equals(arrange(s2.substring(i-n+1,i+1)))) return true;
        }
        return false;
    }
    String arrange(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
