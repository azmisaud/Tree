/* Node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class LeftMostAndRightMostNodes
{
    public static void printCorner(Node node)
    {
        
        // add your code here  
        if(node==null)
            return;
            
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(i==0 || i==size-1)
                    System.out.print(current.data+" ");
                    
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
        }
    }
    
}
