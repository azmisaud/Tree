class LowestCommonAncestor {
  Node lca(Node root, int n1, int n2) {
    if(root==null || root.data==n1 || root.data==n2)
      return root;

    Node left=lca(root.left,n1,n2);
    Node right=lca(root.right,n1,n2);

    if(left==null)
      return right;

    else if (right==null)
      return left;

    else return root;
  }
}
