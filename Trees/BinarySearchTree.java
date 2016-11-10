public class BinarySearchTree<T extends Comparable<T>> implements BSTInterface<T> {
  protected BSTNode<T> root;
  
  public void add(T e);
  public boolean remove(T e);
  
  public boolean contains (T e) {
    return recContains(e, root);
  }
  private boolean recContains(T e, BSTNode<T> tree) {
    if (tree == null) 
      return false;
    else if (e.compareTo(tree.getInfo()) < 0)
      return recContains(e, tree.getLeft());
    else if (e.compareTo(tree.getInfo()) > 0)
      return recContains(e, tree.getRight());
    else
      return true;
  }

  public T get(T e) {
    return recGet(e, root);
  }
  private T recGet(T e, BSTNode<T> tree) {
    if (tree == null)
      return null;
    else if (e.compareTo(tree.getInfo()) < 0)
      return recGet(e, tree.getLeft());
    else if (e.compareTo(tree.getInfo()) > 0)
      return recGet(e, tree.getRight());
    else 
      return tree.getInfo();
  }
  
  public int size() {
    return recSize(root);
  }
  private int recSize(BSTNode<T> tree) {
    if (tree == null) return 0;
    else return 1 + recSize(tree.getLeft()) + recSizse(tree.getRight());
  }
  
  /* balance(): 
  1. In-order traversal to save all nodes into an array
  2. Calls the recursive sortedArray2BST: tree.root = sortedArray2BST(0, nodes.length-1);
  */
  BSTNode<T> sortedArray2BST (int lower, int upper) {
    if (lower > upper) return null;
    int mid = (lower + upper) / 2;
    BSTNode<T> nn = new BSTNode<T>(nodes[mid]);
    nn.setLeft(sortedArray2BST(lower, mid - 1));
    nn.setRight(sortedArray2BST(mid + 1, upper));
    return nn;
  }
}

  
    
