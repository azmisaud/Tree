//first approach
/* class Node {
      int data;
      Node left;
      Node right;

      public Node(int data) {
        this.data=data;
      }
}
*/
class LevelOrderTraversalSpiralForm {

  ArrayList<Integer> findSpiral(Node root){
      if(root==null) return null;

      Queue<Node> queue=new LinkedList<>();
      ArrayList<Integer> result=new ArrayList<>();

      queue.add(root);

      int level=0;

      while(!queue.isEmpty()){
        int size=queue.size();

        ArrayList<Integer> sub=new ArrayList<>();

        for(int i=0;i<size;i++) {
          if(queue.peek().left!=null)
            queue.add(queue.peek().left);

          if(queue.peek().right!=null)
            queue.add(queue.peek().right);

          sub.add(queue.peek().data);
          queue.poll();
        }

        if(level%2==0)
          Collections.reverse(sub);

        result.addAll(sub);

        level++;
      }
    return result;
  }
}
  
