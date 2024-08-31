package graphArr14;

import java.util.Scanner;

public class graphArrMain14 {
    public static void main(String[] args) {
    int v,e, count = 1, to = 0, from = 0;
    Scanner sc = new Scanner(System.in);
    graphArr14 graph;

    try {
        System.out.println("Enter the number of vertices: ");
        v = sc.nextInt();
        System.out.println("Enter the number of edges: ");
        e = sc.nextInt();

        graph = new graphArr14(v);

        System.out.println("Enter the edges: <to> <from>");
        while (count <= e) {
            to = sc.nextInt();
            from = sc.nextInt();

            graph.makeEdge(to, from, 1);
            count++;
        }

        System.out.println("The adjacency matrix for the given graph is: ");
        System.out.print("  ");
        for (int i = 1; i <= v; i++)
            System.out.print(i + " ");
        System.out.println();

        for (int i = 1; i <= v; i++) {
            System.out.print(i + " ");
            for (int j = 1; j <= v; j++)
                System.out.print(graph.getEdge(i, j) + " ");
            System.out.println();
        }
    } catch (Exception E) {
        System.out.println("Somthing went wrong: "+ E.getMessage());
    }
    sc.close();
}
}
