class KthLargest {

    PriorityQueue<Integer> pq;
    int k ;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        for(int i : nums) pq.offer(i);
        this.k = k;
        while(pq.size() > k) pq.poll();
    }
    
    public int add(int val) {
        pq.offer(val);
        while(pq.size()>k)pq.poll();
        return pq.peek();
    }
}
