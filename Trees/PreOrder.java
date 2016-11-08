public void preOrder(TreeNode x) {
  if (x != null) {
    System.out.println(x.getInfo());
    preOrder(x.getLeft());
    preOrder(x.getRight());
  }
}
