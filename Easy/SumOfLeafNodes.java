class SumOfLeafNodes {
  public int SumofLeafNodes(Node root) {
    if(root==null)
      return 0;

    if(root.right==null && root.left==null)
      return root.data;

    return SumofLeafNodes(root.left)+SumofLeafNodes(root.right);
  }
}
