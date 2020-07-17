package Graphs;

public class BFSMain {
    public static void main(String[] args)
    {
        BFS b=new BFS();
        b.addVertex('A');
        b.addVertex('B');
        b.addVertex('C');
        b.addVertex('D');
        b.addVertex('E');
        b.addVertex('F');

        b.addEdge(0,1);
        b.addEdge(1,2);
        b.addEdge(0,3);
        System.out.println("BFS VISITS THESE VERTEX: ");
        b.bfs();
        System.out.println();


    }
}
