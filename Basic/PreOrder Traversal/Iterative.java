class Iterative {

  /* Take a stack
     If root is not null, add root to the stack
     First take the right node  and put it in the stack and then the left node
  */
  
  static ArrayList<Integer> preorder(Node root) {
    if(root==null) return null;

    ArrayList<Integer> result=new ArrayList<>();
    Stack<Node> stack=new Stack<>();

    stack.add(root);

    while(!stack.isEmpty()){
      Node current=stack.pop();

      result.add(current.data);

      if(current.right!=null)
          stack.add(current.right);

      if(current.left!=null)
          stack.add(current.left);
    }
    return result;
  }
}
