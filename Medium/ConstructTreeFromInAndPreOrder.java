class ConstructTreeFromInAndPreOrder{

  private static Node getTree(int[] inOrder, int[] preOrder, int root, int left, int right){
    if(left>right || root>=preOrder.length){
      return null;
    }

    int rootPosition=0;

    for(int i=left;i<=right;i++){
      if(inOrder[i]==preOrder[root]){
        rootPosition=i;
        break;
      }
    }

    Node result=new Node(inOrder[rootPosition]);
    result.left=getTree(inOrder,preOrder,root+1,left,rootPosition-1);
    result.right=getTree(inOrder,preOrder,root+rootPosition-left+1,rootPosition+1,right);

    return result;
  }

  public static Node buildTree(int inorder[], int preorder[], int n)
    {
        // code here 
        return getTree(inorder,preorder,0,0,n-1);
    }
}
