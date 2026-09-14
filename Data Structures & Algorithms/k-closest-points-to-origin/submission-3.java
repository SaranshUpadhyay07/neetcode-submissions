class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<Item> pq =
            new PriorityQueue<>((a, b) -> b.dist - a.dist);

        for (int i = 0; i < points.length; i++) {

            int dist =
                points[i][0] * points[i][0]
              + points[i][1] * points[i][1];

            pq.offer(new Item(i, dist));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        int idx = 0;
        while (!pq.isEmpty()) {
            ans[idx++] = points[pq.poll().index];
        }

        return ans;
    }
}

class Item {
    int index;
    int dist;

    Item(int index, int dist) {
        this.index = index;
        this.dist = dist;
    }
}