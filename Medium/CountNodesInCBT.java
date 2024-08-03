class CountNodesInCBT {

  private static int getLeftHeight(Node root) {
    int count=0;
    Node temp=root;

    while(temp.left!=null){
      count++;
      temp=temp.left;
    }

    return count;
  }

  private static int getRightHeight(Node root){
    int count=0;
    Node temp=root;

    while(temp.right!=null){
      count++;
      temp=temp.right;
    }

    return count;
  }

  public static int countNodes(Node root){
    if(root==null)
      return 0;

    int left=getLeftHeight(root.left);
    int right=getRightHeight(root.right);

    if(left==right)
      return ((2<<(left))-1);

    else
      return countNodes(root.left)+countNodes(root.right)+1;
  }

  // TC : O((log N)^2)
}
