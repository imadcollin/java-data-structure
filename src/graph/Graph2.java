package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph2 {
    private Map<Vertex, List<Vertex>> adjsVerts;

    public Graph2() {
        adjsVerts = new HashMap<>();

    }

    public void addVertex(String label) {
        adjsVerts.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        Vertex vertex = new Vertex(label);
        adjsVerts.values().stream().forEach(x -> x.remove(vertex));
    }

    public void addEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        adjsVerts.get(v1).add(v2);
        adjsVerts.get(v2).add(v1);
    }

    public void countVertex() {
        System.out.println(adjsVerts.keySet().size());
    }

}

class MainGraph2 {
    public static void main(String[] args) {
        Graph2 graph2 = new Graph2();

        graph2.addVertex("first");
        graph2.addVertex("second");

        graph2.containsVertex("first");

    }
}
