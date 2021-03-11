package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Graph2 {
    private Map<Vertex, List<Vertex>> adjsVerts;

    public Graph2() {
        adjsVerts = new HashMap<>();

    }

    public void addVertex(String label) {
        adjsVerts.putIfAbsent(new Vertex(label), new ArrayList<>());
    }

    public void removeVertex(String label) {
        List<Vertex> find = adjsVerts.keySet().stream().filter(x -> x.label == label).collect(Collectors.toList());
        adjsVerts.values().stream().forEach(e -> e.remove(find.get(0)));
        adjsVerts.remove(new Vertex(label));
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

    public void containsVertex(String label) {
        List<Vertex> find = adjsVerts.keySet().stream().filter(x -> x.label == label).collect(Collectors.toList());
        if (find.size() > 0) {

            System.out.println(label + " is exist");
        } else
            System.out.println(label + " not exist");

    }

    public void printGraph() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Vertex vertex : adjsVerts.keySet()) {
            stringBuilder.append(vertex.label.toString() + ": ");

            for (Vertex vertex2 : adjsVerts.get(vertex)) {
                stringBuilder.append(vertex2.label.toString() + " ");
            }
            stringBuilder.append("\n");
        }
        System.out.println(stringBuilder.toString());

    }

}

class MainGraph2 {
    public static void main(String[] args) {

        System.out.println("--------Create------");
        getGraph2().printGraph();

        getGraph2().countVertex();
        getGraph2().removeVertex("1");

        System.out.println("--------Remove------");
        getGraph2().printGraph(); // Without vertex "1"

        System.out.println("--------Contains------");
        getGraph2().containsVertex("1");
    }

    public static Graph2 getGraph2() {
        Graph2 graph2 = new Graph2();

        graph2.addVertex("1");
        graph2.addVertex("2");
        graph2.addVertex("3");
        graph2.addVertex("4");

        graph2.addEdge("1", "2");
        graph2.addEdge("1", "3");
        graph2.addEdge("1", "4");
        graph2.addEdge("2", "3");
        graph2.addEdge("2", "4");

        return graph2;
    }
}
