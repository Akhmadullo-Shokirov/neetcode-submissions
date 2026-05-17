class Solution {
    private int count = 0;
    public int islandPerimeter(int[][] grid) {
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    dfs(grid, i, j);
                    return count;
                }
                    
            }
        }
        
        return count;
    }

    public void dfs(int[][] grid, int i, int j) {

        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
            || grid[i][j] != 1) return;

        grid[i][j] = -1;
        count += 4;
        if (i > 0 && grid[i - 1][j] != 0) count -= 2;
        if (j > 0 && grid[i][j - 1] != 0) count -= 2;
        
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        
    }


}