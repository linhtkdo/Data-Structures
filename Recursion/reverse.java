/* Reverse a Linked List */
public void reverse(LLNode<T> curr) {
  if (curr == null)
    return;
  if (curr.getLink() == null) {
    head = curr;
    return;
  }
  reverse(curr.getLink());
  curr.getLink().setLink(curr);
  curr.setLink(null);
}
  
