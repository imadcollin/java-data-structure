package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Vertex, List<Vertex>> adjsVerts;

    public Graph() {
        adjsVerts = new HashMap<>();
    }

    public void addVertex(Vertex v) {
        adjsVerts.put(v, new LinkedList<Vertex>());
    }

    public void addEdge(Vertex source, Vertex Des, boolean bi) {
        if (!adjsVerts.containsKey(source)) {
            addVertex(source);
        }
        if (!adjsVerts.containsKey(Des)) {
            addVertex(Des);
        }
        adjsVerts.get(source).add(Des);
        if (bi == true) {
            adjsVerts.get(Des).add(source);
        }
    }

    public void countVertex() {
        System.out.println(adjsVerts.keySet().size());
    }

    public void countEdges(boolean bi) {

        int count = 0;
        for (Vertex vertex : adjsVerts.keySet()) {
            count += adjsVerts.get(vertex).size();
        }
        if (bi == true) {
            count = count / 2;
        }
        System.out.println("Edges: " + count);
    }

    public void containsVertex(Vertex v) {
        if (adjsVerts.containsKey(v)) {

            System.out.println("Vertex is Not exsits... ");
        } else
            System.out.println("Vertex is exsits... ");

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Vertex vertex : adjsVerts.keySet()) {
            stringBuilder.append(vertex.label.toString() + ": ");

            for (Vertex vertex2 : adjsVerts.get(vertex)) {
                stringBuilder.append(vertex.label.toString());
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();

    }
}
