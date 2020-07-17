package Graphs;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private final int graphSize=20;
    private Vertex vertexList[];
    private int adjMatrix[][];
    private int nVerts;
    private Queue<Integer> q;

    public BFS()
    {
        vertexList=new Vertex[graphSize];
        adjMatrix=new int[graphSize][graphSize];
        nVerts=0;
        q=new LinkedList<Integer>();
    }
    public void addVertex(char lab)
    {
        vertexList[nVerts++]=new Vertex(lab);
    }
    public void addEdge(int start,int end)
    {
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }
    public void displayVertex(int v)
    {
        System.out.println(vertexList[v].label);
    }
    public int getAdjUnvisitedVertex(int v)
    {
        for(int j=0;j<nVerts;j++)
        {
            if(adjMatrix[v][j]==1 && vertexList[j].wasVisited==false)
            {
                return j;
            }
        }
        return -1;
    }
    public void bfs()
    {
        vertexList[0].wasVisited=true;
        displayVertex(0);
        q.add(0);
        int v2;

        while(!q.isEmpty())
        {
            int v1=q.remove();
            while((v2=getAdjUnvisitedVertex(v1))!=-1)
            {
                vertexList[v2].wasVisited=true;
                displayVertex(v2);
                q.add(v2);
            }
        }
    }
}
