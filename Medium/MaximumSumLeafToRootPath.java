class MaximumSumLeafToRootPath {
  public static int maxPathSum(Node root){
    if(root==null)
      return 0;

    if(root.right==null)
      return root.data+maxPathSum(root.left);

    if(root.left==null)
      return root.data+maxPathSum(root.right);

    int left=maxPathSum(root.left);
    int right=maxPathSum(root.right);

    return root.data+Math.max(left,right);
  }
}
