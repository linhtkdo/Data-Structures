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
  
  // dfs from start vertex (0 by default) 
  // visit all vertices connected to start
  public void dfs (int start) {
    vertexList[start].wasVisited = true; // mark it
    print(start); stack.push(start);
    while (!stack.isEmpty()) {
      int b = getNextUnvisitedNeighbor(stack.peek());
      if (b==-1) stack.pop(); // no unvisited neighbor;
      else {
        vertexList[b].wasVisited = true;
        print(b); stack.push(b);
      }
    }
    // clear wasVisited marks
  }
  
  // finding a path
  public boolean hasPath (int start, int end) {
    vertexList[start].wasVisited = true; // mark it
    stack.push(start);
    int b = -1;
    while (!stack.isEmpty()) {
      b = getNextUnvisitedNeighbor(stack.peek());
      if (b==end) break;
      if (b==-1) stack.pop(); // no unvisited neighbor
      else {
        vertexList[b].wasVisited=true; 
        stack.push(b);
      }
    }
    if (b==end) return true;  // So how do I print out the path?? 
    return false;             // Vertices on the path are all stored in the stack!
  }
}
