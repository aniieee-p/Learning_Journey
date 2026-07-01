class Solution {

    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};

    public int maximumSafenessFactor(List<List<Integer>> grid) {

        int n = grid.size();

        // Distance from nearest thief
        int[][] dist = new int[n][n];

        for(int i = 0; i < n; i++) {
            Arrays.fill(dist[i], -1);
        }

        Queue<int[]> q = new LinkedList<>();

        // Add all thieves to queue
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(grid.get(i).get(j) == 1) {
                    q.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }

        // Multi-source BFS
        while(!q.isEmpty()) {

            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];

            for(int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < n &&
                   dist[nr][nc] == -1) {

                    dist[nr][nc] = dist[r][c] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        int low = 0;
        int high = 2 * n;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(canReach(dist, mid)) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return high;
    }

    private boolean canReach(int[][] dist, int safe) {

        int n = dist.length;

        if(dist[0][0] < safe)
            return false;

        boolean[][] visited = new boolean[n][n];

        Queue<int[]> q = new LinkedList<>();

        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        while(!q.isEmpty()) {

            int[] curr = q.poll();

            int r = curr[0];
            int c = curr[1];

            if(r == n - 1 && c == n - 1)
                return true;

            for(int[] d : dir) {

                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nr < n &&
                   nc >= 0 && nc < n &&
                   !visited[nr][nc] &&
                   dist[nr][nc] >= safe) {

                    visited[nr][nc] = true;
                    q.offer(new int[]{nr, nc});
                }
            }
        }

        return false;
    }
}