class Iterative {
  ArrayList<Integer> postorder(Node root) {
    if(root==null) return null;

    Stack<Node> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    ArrayList<Integer> result=new ArrayList<>();

    stack1.add(root);

    while(!stack1.isEmpty()) {
      Node current=stack1.pop();

      stack2.add(current.data);

      if(current.left!=null)
          stack1.add(current.left);

      if(current.rightt!=null)
          stack1.add(current.right);
    }
  }
}
