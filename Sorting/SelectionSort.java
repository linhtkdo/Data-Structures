public void selectionSort() {
  int out, in, min;
  for (out=0; out<nElems-1; out++) { // outer loop
    min = out;
    for (in=out+1; in<nElems; in++)  // inner loop
      if (a[in].compareTo(a[min]) < 0) min = in;
    swap(out, min);
  }
}
      
