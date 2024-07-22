// class Node {
//   int data;
//   Node left;
//   Node right;

//   public Node(int data){
//     this.data=data;
//   }
// }

class SumOfBinaryTree {
  static int sumBT(Node head) {
    if(head==null) return 0;

    return head.data+sumBT(head.left)+sumBT(head.right);
  }
}
