package graph;

public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();
        Vertex v1 = new Vertex("first");
        Vertex v2 = new Vertex("second");
        Vertex v3 = new Vertex("third");
        Vertex v4 = new Vertex("fourth");
        
        Vertex v6 = new Vertex("Six");

        g.addEdge(v1, v2, true);
        g.addEdge(v1, v4, true);
        g.addEdge(v1, v4, true);
        g.addEdge(v3, v2, true);
        g.addEdge(v3, v1, true);
        g.addEdge(v3, v4, true);

        g.countVertex();

        g.countEdges(true);

        g.addVertex(v1);
        g.addVertex(v2);
        g.addVertex(v3);

        g.containsVertex(v2);
        g.containsVertex(v3);
        g.containsVertex(v6);  //Not Exist

        System.out.println(g.toString());

    }
}
