class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] arr = new int[k][2];

        PriorityQueue<Item> pq = new PriorityQueue<>((a,b)-> Double.compare(a.dist, b.dist));

        for(int i = 0; i < points.length; i++){
            pq.offer(new Item(i,(Math.pow(points[i][0],2)+Math.pow(points[i][1],2))));
        }
        int i = 0;
        while(i < k){
            arr[i] = points[pq.peek().i];
            pq.poll();
            i++;
        }
        return arr;
    }
}
class Item{
    int i;
    double dist;

    public Item(int i, double dist){
        this.i = i;
        this.dist = dist;
    } 
}
