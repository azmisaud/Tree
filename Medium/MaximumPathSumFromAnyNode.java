class MaximumPathSumFromAnyNode {
  int max=Integer.MIN_VALUE;

  int help(Node node) {
    if(node==null)
      return 0;

    int left=Math.max(0,help(node.left));
    int right=Math.max(0,help(node.right));

    max=Math.max(max,node.data+left+right);

    return node.data+Math.max(left,right);
  }

  int findMaxSum(Node root) {
    help(root);
    return max;
  }
}
