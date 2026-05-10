class Solution {
    // 1 - started
    // 2 - finished
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numCourses; i++) {
            list.add(new ArrayList<>());
        }
        for(int edge[] : prerequisites) {
            list.get(edge[0]).add(edge[1]);
        }

        int[] isFinished = new int[numCourses];
        
        for(int i=0; i<numCourses; i++) {
            dfs(list, i, isFinished);
        }

        for(int i=0; i<isFinished.length; i++) {
            if(isFinished[i] == 1) return false;
        }

        return true;
    }

    void dfs(List<List<Integer>> list, int start, int[] isFinished) {
        isFinished[start] = 1;
        for(int neighbour : list.get(start)) {
            if(isFinished[neighbour] == 1) return;
            if(isFinished[neighbour] == 0) {
                dfs(list, neighbour, isFinished);
            }
        }
        int count = 0;
        for(int neighbour : list.get(start)) {
            if(isFinished[neighbour] == 2) {
                count++;
            }
        }
        if(list.get(start).size() == count) isFinished[start] = 2;
        // if(list.get(start).size() == 0) isFinished[start] = 2;
    }
}
