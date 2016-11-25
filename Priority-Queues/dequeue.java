public T dequeue() throws PriQUnderflowException {
  T hold, toMove;
  if (lastIndex == -1)
    throw new PriQUnderflowException("underflow");
  else {
    hold = heap[0];
    toMove = heap[lastIndex];
    lastIndex--;
    if (lastIndex != -1) reheapDown(toMove);
    return hold;
  }
}

private void reheapDown(T elem) {
  int largerChild, hole=0, left=1, right=2;
  while (left <= lastIndex) { // at least 1 child
    if (right <= lastIndex && // right child exists
        heap[left].compareTo(heap[right]) < 0)
      largerChild = right;
    else
      largerChild = left;
    if (elem.compareTo(heap[largerChild]) >= 0) break;
    heap[hole] = heap[largerChild];
    hole = largerChild;
    left = (hole*2) + 1, right = (hole*2) + 2;
  }
  heap[hole] = elem;
}
