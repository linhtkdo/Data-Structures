public class LinkedSortedList <T extends Comparable<T>> extends LinkedUnsortedList<T> implements ListInterface<T> {
  public LinkedSortedList() {
    super();
  }
  public void add(T e) {
    LLNode<T> curr = list, prev = null;
    while (curr != null) { // pass all e's that are less than the new e
      T curr_e = curr.getInfo();
      if (curr_e.compareTo(e) < 0) {
        prev = curr;
        curr.getLink();
      } else break;
    }
    LLNode<T> nn = new LLNode<T>(e);
    if (prev == null) { // adding before head
      nn.setLink(list);
      list = nn;
    } else {
      nn.setLink(curr);
      prev.setLink(nn);
    }
    numElements++;
  }
}
      
      
