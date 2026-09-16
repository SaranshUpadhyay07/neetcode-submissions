class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                   max = Math.max(max,dfs(grid,i,j,new int[]{1}));
                }
            }
        }
        return max;
    }
    int dfs(int[][]grid,int i, int j,int[] length){
        grid[i][j] = 2;

        if(i+1 < grid.length && grid[i+1][j] == 1){
            length[0]++;
            dfs(grid,i+1,j,length);
        }
        if(j-1 >= 0 && grid[i][j-1] == 1){
            length[0]++;
            dfs(grid,i,j-1,length);
        }
        if(j+1 < grid[0].length && grid[i][j+1] == 1){
            length[0]++;
            dfs(grid,i,j+1,length);
        }
        if(i-1 >= 0 && grid[i-1][j] == 1){
            length[0]++;
            dfs(grid,i-1,j,length);
        }
        return length[0];
    }
}
