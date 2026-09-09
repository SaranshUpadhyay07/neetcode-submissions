class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int answer[] = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(new int[]{entry.getKey(),entry.getValue()});
        }
        
        for(int i = 0; i < k; i++){
            answer[i] = pq.poll()[0];
        }
        return answer;

        
    }
}
