public class DFS
{
    public void dfs(int s)
    {
        boolean[] visited = new boolean[vertices];
        Stack<Integer>stack = new Stack<>();
        stack.push(s);
        while(!stack.isEmpty())
        {
            int u = stack.pop();
            if(!visited[u])
            {
                visited[u] = true;
                System.out.println(u+" ");
                for(int v : adj[u])
                {
                    if(!visited[v])
                    {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public void dfs(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.println(v+" ");

        for(int neighbour : adj[v])
        {
            if(!visited[neighbour])
            dfs(neighbour, visited);
        }
    }

    public static void main(String args[])
    {
        
    }
}