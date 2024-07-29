class SymmetricTree {
  private static boolean help(Node left,Node right) {
    if(left==null || right==null)
      return left==right;

    if(left.data!=right.data)
      return false;

    return (help(left.left,right.right) && help(left.right,right.left));
  }

  public static boolean isSymmetric(Node root) {
    if(root==null)
      return true;

    return help(root.left,root.right);
  }
}
