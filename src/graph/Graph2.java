package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
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

    public void removeEdge(String l1, String l2) {
        Vertex v1 = new Vertex(l1);
        Vertex v2 = new Vertex(l2);

        if (adjsVerts.get(v1).size() != 0) {
            adjsVerts.remove(v1);
        }
        if (adjsVerts.get(v2).size() != 0) {
            adjsVerts.remove(v2);

        }

    }

    public List<Vertex> gVertexs(String l) {
        return adjsVerts.get(new Vertex(l));
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

    public void traversel(Graph2 graph2, String root) {
        Stack<String> stack = new Stack<>();
        Set<String> visited = new LinkedHashSet<String>();
        stack.push(root);
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            if (!visited.contains(temp)) {
                visited.add(temp);

                for (Vertex v : graph2.gVertexs(temp)) {
                    stack.push(v.label);

                }
            }
        }
        visited.stream().forEach(x -> System.out.print(x + " "));
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

        getGraph2().removeEdge("1", "2");
        System.out.println("--------Remove Edge------");
        getGraph2().printGraph();

        System.out.println("--------Vertex 1 ------");
        getGraph2().gVertexs("1").stream().forEach(x -> System.out.print(x + " "));

        System.out.println();
        System.out.println("--------Traversal ------");
        getGraph2().traversel(getGraph2(), "1");

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
