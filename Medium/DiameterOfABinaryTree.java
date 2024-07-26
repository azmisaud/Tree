class DiameterOfABinaryTree {
  int max=0;

  int check(Node node) {
    if(node==null)
      return 0;

    int left=check(node.left);
    int right=check(node.right);

    max=Math.max(max,1+left+right);

    return 1+Math.max(left,right);
  }

  int diameter(Node root) {
    check(root);
    return max;
  }
}
