class Iterative2 {
  ArrayList<Integer> postorder(Node node) {
    if(node==null) return null;

    Node current=node;
    Node temp;

    Stack<Node> stack=new Stack<>();
    ArrayList<Integer> result=new ArrayList<>();

    while(current!=null || !stack.isEmpty()) {
      if(current!=null) {
        stack.add(current);
        current=current.left;
      } else {
        temp=stack.peek().right;
        if(temp==null) {
          temp=stack.pop();
          result.add(temp.data);

          while(!stack.isEmpty() && temp==stack.peek().right) {
            temp=stack.pop();
            result.add(temp.data);
          }
        } else {
          current=temp;
        }
      }
    }
    return result;
  }
}
