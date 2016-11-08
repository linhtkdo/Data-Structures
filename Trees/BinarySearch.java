protected int find (T target) {
  int lower = 0, upper = numElements-1;
  while (lower <= upper) {
    int curr = (lower + upper) / 2;
    int result = (Comparable)target.compareTo(list[curr]);
    if (result == 0)
      return curr;
    else if (result < 0)
      upper = curr - 1;
    else lower = curr + 1;
  }
  return -1;
}

protected int recFind (Comparable target, int lower, int upper) {
  if (lower > upper) return -1;
  int curr = (lower + upper) / 2;
  int result = target.compareTo(list[curr]);
  if (result == 0) return curr;
  else if (result < 0) return recFind (target, lower, curr - 1);
  else return recFind (target, curr + 1, upper);
}
protected int find (T target) {
  Comparable tar = (Comparable) target;
  return recFind (tar, 0, numElements - 1);
}
