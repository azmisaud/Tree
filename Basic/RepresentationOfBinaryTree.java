class Node {
  int data;
  Node left;
  Node right'

  public Node(int data) {
    this.data=data;
  }
}

class Main {
  public static void main(String[] args){
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.left.right.left=new Node(8);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        node.right.right.left=new Node(9);
        node.right.right.right=new Node(10);
  }
}
