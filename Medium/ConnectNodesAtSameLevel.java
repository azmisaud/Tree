 /*
    Node class is Defined as follows:
    class Node{
        int data;
        Node left;
        Node right;
        Node nextRight;
        Node(int data){
            this.data = data;
            left=null;
            right=null;
            nextRight = null;
        }
    }
    */
    
class ConnectNodesAtSameLevel
{
    //Function to connect nodes at same level.
    public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(i==size-1)
                    current.nextRight=null;
                    
                else
                    current.nextRight=queue.peek();
                    
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
        }
    }
}
