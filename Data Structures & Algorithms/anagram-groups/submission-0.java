class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            String s = arranger(strs[i]);
            if(map.containsKey(s)) map.get(s).add(strs[i]);
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(s,l);
            }
        }
        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            answer.add(entry.getValue());
        }
        return answer;
    }
    String arranger(String s){
        char ch[] = s.toCharArray();
        Arrays.sort(ch);
        return new String(ch);
    }
}
