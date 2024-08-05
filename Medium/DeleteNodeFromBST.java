class DeleteNodeFromBST {

  private static Node findLastRightNode(Node current){
    if(current.right==null)
        return current;

    return findLastRightNode(current.right);
  }

  private static Node helper(Node root){
    if(root.left==null)
      return root.right;

    else if (root.right==null)
      return root.left;

    Node right=root.right;
    Node last=findLastRightNode(root.left);
    last.right=right;
    return root.left;
  }

  public static Node deleteNode(Node root, int X){
    if(root==null) 
      return null;

    if(root.data==X)
      return helper(root);

    Node current=root;

    while(current!=null){
      if(current.data>X){
        if(current.left!=null && current.left.data==X){
          current.left=helper(current.left);
          break;
        }
        current=current.left;
      }
      else {
        if(current.right!=null && current.right.data==X){
          current.right=helper(current.right);
          break;
        }
        current=current.right;
      }
    }
    return root;
  }
}
