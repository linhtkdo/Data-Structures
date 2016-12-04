class Graph {
  private Vertex vertexList[];
  private int adjMat[][];
  private int nVerts;
  
  // returns the next unvisited neighbor of v
  public int getNextUnvisitedNeighbor (int v){
    for (int j=0; j<nVerts; j++) {
      if (adjMat[v][j] == 1 && vertextList[j].wasVisited == false) 
        return j
      return -1; // none found
    }
  }
  
  // bfs from start vertex (0 by default)
  public void bfs (int start) {
    vertexList[start].wasVisited = true; // mark it
    print(start); 
    queue.enqueue(start);
    int b;
    while (!queue.isEmpty()) {
      int v = queue.dequeue();
      while ((b=getNextUnvisitedNeighbor(v)) != -1) {
        vertexList[b].wasVisisted = true;
        print(b);
        queue.enqueue(b);
      }
    }
    // clear wasVisited marks
  }
}
