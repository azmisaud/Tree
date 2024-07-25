class usingLevelOrderTraversal {
  int getLevel(Node node, int data) {
    int level=1;

    Queue<Node> queue=new LinkedList<>();
    queue.add(node);

    while(!queue.isEmpty()){
      int size=queue.size();

      for(int i=0;i<size;i++){
        Node current=queue.poll();

        if(current.data==data)
            return level;

        if(current.left!=null)
          queue.add(current.left);

        if(current.right!=null)
          queue.add(current.right);
      }
      level++;
    }
    return 0;
  }
}
