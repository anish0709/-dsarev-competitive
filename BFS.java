public class BFS
{



    public void bfs(int s)
    {

        boolean[] visited = new boolean[vertices];
        Queue<Integer>q = new LinkedList<>();

        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty())
        {
            int u = q.poll();
            System.out.println(u+" ");
            for(int v: adj[u])
            {
                if(!visited[v])
                {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }
}