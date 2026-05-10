class Solution {
    private int count = 0;
    public int countComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for(int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        boolean[] visited = new boolean[n];
        for(int i=0; i<n; i++) {
            if(!visited[i]) {
                dfs(graph, i, visited);
                count++;
            }
            
        }
        
        return count;
    }

    public void dfs(Map<Integer, List<Integer>> graph, int node, boolean[] visited) {
        visited[node] = true;
        for(int neighbor : graph.get(node)) {
            if(!visited[neighbor]) {
                dfs(graph, neighbor, visited);
            }
        }
    }

}
