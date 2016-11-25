private void reheapUp(T elem) {
  int hole = lastIndex;
  int parent = (hole-1) / 2;
  while ((hole > 0) && elem.compareTo(heap[parent]) > 0) {
    heap[hole] = heap[parent];
    hole = parent;
    parent = (parent-1) / 2;
  }
  heap[hole] = elem;
}
