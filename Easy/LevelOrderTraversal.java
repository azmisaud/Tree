/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class LevelOrderTraversal {

 static ArrayList<Integer> levelOrder(Node root) {
    if(root==null) return null;

    Queue<Node> queue=new LinkedList<>();
    ArrayList<Integer> result=new ArrayList<>();

    queue.add(root);

    while(!queue.isEmpty()){
      result.add(queue.peek().data);

      if(queue.peek().left!=null) 
        queue.add(queue.peek().left);

      if(queue.peek().right!=null)
        queue.add(queue.peek().right);

      queue.poll();
    }
 }
}
  
   
