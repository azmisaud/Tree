class NextRightNode {
  Node nextRight(Node root, int key) {
    
    Queue<Node> queue=new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()) {
      int size=queue.size();

      for(int i=0;i<size;i++) {
        Node current=queue.poll();

        if(current.data==key) {
          return (i!=size-1) ? queue.peek() : new Node(-1);
        }

        if(current.left!=null)
          queue.add(current.left);

        if(current.right!=null)
            queue.add(current.right);
      }
    }
    return new Node(-1);
  }
}
