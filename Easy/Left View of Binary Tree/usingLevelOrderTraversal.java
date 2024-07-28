/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class usingLevelOrderTraversal
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      
      if(root==null)
        return new ArrayList<>();
        
      Queue<Node> queue=new LinkedList<>();
      
      queue.add(root);
      
      ArrayList<Integer> result=new ArrayList<>();
      
     while(!queue.isEmpty()){
         int size=queue.size();
         
         for(int i=0;i<size;i++){
             Node current=queue.poll();
             
             if(i==0)
                result.add(current.data);
                
            if(current.left!=null)
                queue.add(current.left);
                
            if(current.right!=null)
                queue.add(current.right);
         }
     }
     
     return result;
    }
}
