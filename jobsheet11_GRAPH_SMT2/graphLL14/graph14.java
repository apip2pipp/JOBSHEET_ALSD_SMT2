package graphLL14;

import java.util.LinkedList;

public class graph14 {
    int vertex;
    LinkedList<Integer> list[];

    public graph14(int vertex) {
        this.vertex = vertex;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);
        
        // add back edge ((for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        // degree undirected graph
        System.out.println("Degree of " + source + " is " + list[source].size());

        // degree directed graph
        int k, totalIn = 0, totalOut = 0;
        for(int i = 0; i < vertex; i++){
            for(int j = 0; j < list[i].size(); j++){
                if(list[i].get(j) == source)
                    ++totalIn;
            }
            for(k = 0; k < list[source].size(); k++){
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree of " + source + " is " + totalIn);
        System.out.println("Outdegree of " + source + " is " + totalOut);
        System.out.println("Degree of " + source + " is " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph is cleared");
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " is connected to: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    
}