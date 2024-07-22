// class Node {
//   int data;
//   Node left;
//   Node right;

//   public Node(int data){
//     this.data=data;
//   }
// }

class SizeOfBinaryTree {
  public static int getSize(Node node){
    if(node==null) return 0;
    if(node.right==null && node.left==null) return 1;

    int a=getSize(node.left);
    int b=getSize(node.right);

    return a+b+1;
  }
}
