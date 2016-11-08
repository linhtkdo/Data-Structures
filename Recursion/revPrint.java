/* Printing a List Backwards */
public void revPrint() {
  revPrint(head);
}

private void revPrint (LLNode<T> listRef) {
  if (listRef != null) {
    revPrint(listRef.getLink());
    System.out.println(listRef.getInfo());
  }
}
