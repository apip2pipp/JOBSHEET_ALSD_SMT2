package graphArr14;

public class graphArr14 {
    private final int vertices;
    private final int[][] adjacencyMatrix;

    public graphArr14(int vertices) {
        this.vertices = vertices;
        adjacencyMatrix = new int[vertices + 1][vertices + 1];
    }

    public void makeEdge(int source, int destination, int edge) {
        try {
            adjacencyMatrix[source][destination] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("The vertices does not exists");
        }
    }

    public int getEdge(int source, int destination) {
        try {
            return adjacencyMatrix[source][destination];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("The vertices does not exists");
        }
        return -1;
    }
}
