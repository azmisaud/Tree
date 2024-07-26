/*
 class Node{
    int data;
    Node left,right;
    
    Node(int d)
     {
      data=d;
      left=null;
      right=null;
    }
}*/
class ExtremeNodesInAlternateOrder
{
    public  ArrayList<Integer> ExtremeNode(Node root)
      {
        //add code here.
        ArrayList<Integer> result=new ArrayList<>();
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        int level=1;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                
                Node current=queue.poll();
                
                if((level%2==0 && i==0) || (level%2!=0 && i==size-1))
                    result.add(current.data);
                    
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            level++;
        }
        
        return result;
      }
}
