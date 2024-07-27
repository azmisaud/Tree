class CheckIfSubTree {
  private static boolean isIdentical(Node root1,Node root2) {
    if(root1==null || root2==null)
      return root1==root2;

    return root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
  }

  public static boolean isSubtree(Node T, Node S) {
    if(S==null)
      return true;

    if(T==null)
      return false;

    if(isIdentical(T,S))
      return true;

    return (isSubtree(T.left,S) || isSubtree(T.right,S));
  }
}
