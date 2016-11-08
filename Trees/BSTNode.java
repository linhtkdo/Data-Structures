public class BSTNode<T extends Comparable<T>> {
  protected T info;
  protected BSTNode<T> left;
  protected BSTNode<T> right;
  
  public BSTNode(T info) {
    this.info = info;
  }
  
  /* getters and setters for info, left, and right */
}
