public void bubbleSort() {
  int out, in;
  for (out=nElems-1; out>0; out--)  // outer loop
    for (in=0; in<out; in++)        // inner loop
      if (a[in].compareTo(a[in+1]) > 0)
        swap(in, in+1);
}

public void swap(int i, int j) {
  T temp = a[i];
  a[i] = a[j];
  a[j] = temp;
}
  
