package Graphs;
//common class for making a vertex in graph structure
public class Vertex {
    public char label;
    public boolean wasVisited;
    public Vertex(char label)
    {
        this.label=label;
        wasVisited=false;
    }
}
