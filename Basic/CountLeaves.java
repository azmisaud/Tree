/*
  class Node {
    int data;
    Node left;
    Node right;

    public Node(int data){
      this.data=data;
    }
  }
*/

class CountLeaves {
  int countLeaves(Node node) {
    if(node==null) return 0;
    if(node.left==null && node.right==null) return 1;

    return countLeaves(node.left)+countLeaves(node.right);
  }
}
