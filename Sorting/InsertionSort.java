public void insertionSort() {
  int out, in;
  for (out=1; out<nElems; out++) { // dividing line
    T temp = a[out];
    in = out; // start shifts at out
    while (in>0 && a[in-1].compareTo(temp)>0) {
      a[in] = a[in-1];  // shift right until the 
      in--;             // element that's no longer larger
    }
    a[in] = temp; // copy
  }
}
