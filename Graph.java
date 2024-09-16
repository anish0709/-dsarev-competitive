public class Graph{

    private LinkedList<Integer>[]adj;
    private int v;
    private int e;

    public graph(int nodes)
    {
        this.v = nodes;
        this.e = 0;
        this.adj = new LinkedList<Integer>[nodes];
        for(int i=0; i<v; i++)
        {
            this.adj[i] = new LinkedList<>();
        }
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<v; i++)
        {
            sb.append(i + " -> ");
            for(int node: adj[i])
            {
                sb.append(node + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source); // for undirected graph
        e++;
    }

    public static void main(String[] args)
    {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        System.out.println(g);
    }
}