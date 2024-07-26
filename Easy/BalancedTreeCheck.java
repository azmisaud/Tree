class BalancedTreeCheck {

  private int check(Node node) {
    if(node==null)
      return 0;

    int left=check(node.left);
    int right=check(node.right);

    if(left==-1 || right==-1)
      return -1;

    if(Math.abs(left-right)>1)
      return -1;

    return 1+Math.max(left,right);
  }

  boolean isBalanced(Node root){
    return check(root)!=-1;
  }
}
