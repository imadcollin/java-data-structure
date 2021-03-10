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

    public void containsVertex(String label){
        List<Vertex> find = adjsVerts.keySet().stream().filter(x -> x.label == label).collect(Collectors.toList());
        if( find.size()>0){

            System.out.println(label+ " is exist") ;
        } 
        else 
        System.out.println(label+ " not exist") ;

    }

}

class MainGraph2 {
    public static void main(String[] args) {
        Graph2 graph2 = new Graph2();

        graph2.addVertex("first");
        graph2.addVertex("second");

        graph2.containsVertex("first");
        graph2.containsVertex("four");

    }
}
