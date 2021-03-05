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

    public void countEdges() {
        System.out.println(adjsVerts.keySet().size());
    }

    public void containsVertex(Vertex v) {
        if (adjsVerts.containsKey(v)) {

            System.out.println("Vertex is Not exsits... ");
        } else
            System.out.println("Vertex is exsits... ");

    }
}
