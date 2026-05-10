class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] != color)
            dfs(image, sr, sc, color, image[sr][sc]);
        
        return image;
    }

    public void dfs(int[][] image, int i, int j, int color, int origin) {
        if(i< 0 || i>=image.length || j<0 
            || j>=image[i].length || image[i][j] != origin)
            return;
        
        image[i][j] = color;
        dfs(image, i+1, j, color, origin);
        dfs(image, i-1, j, color, origin);
        dfs(image, i, j+1, color, origin);
        dfs(image, i, j-1, color, origin);
    }
}