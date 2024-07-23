class Iterative {

  ArrayList<Integer> inorder(Node root) {

    ArrayList<Integer> result=new ArrayList<>();
    Stack<Node> stack=new Stack<>();

    Node node=root;

    while(true) {
      if(node!=null) {
        stack.add(node);
        node=node.left;
      }
      else {
        if(stack.isEmpty())
          break;

        node=stack.pop();
        result.add(node.data);
        node=node.right;
      }
    }
  }
}
