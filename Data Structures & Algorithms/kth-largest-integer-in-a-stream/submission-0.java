class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : nums) pq.offer(i);
        this.k = k;
    }
    
    public int add(int val) {
        pq.offer(val);
        int num[] = new int[k-1];
        int i = 0;

        while(i < k-1){
            num[i] = pq.poll();
            i++;
        }
        int val2 = pq.peek();

        for(int n : num) pq.offer(n);
        return val2;
    }
}
