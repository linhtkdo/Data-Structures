public class LinkedUnsortedList<T> implements ListInterface<T> {
  protected int numElements;
  protected LLNode<T> list;
  
  private class findVal<T> {
    public LLNode<T> curr, prev;
    public findVal(LLNode<T> c, LLNode<T> p) {
      curr = c; prev = p;
    }
  }
  protected findVal<T> find (T target) {
    LLNode<T> curr = list, prev = null;
    while (curr != null) {
      if (curr.getInfo().equals(target))
        break;
      else {
        prev = curr;
        curr = curr.getLink();
      }
    }
    return new findVal(curr, prev);
  }
  public boolean remove(T e) {
    findVal<T> fval = find(e);
    if (fval.curr != null) {
      if (fval.curr == list) 
        list = list.getLink();
      else 
        fval.prev.setLink(fval.curr.getLink());
      numElements--;
    }
    return (fval.curr != null); 
  }
}
      
