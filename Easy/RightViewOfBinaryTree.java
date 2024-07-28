/*class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class RightViewOfBinaryTree {
    // Function to return list containing elements of right view of binary tree.
    ArrayList<Integer> rightView(Node root) {
        // add code here.
        if(root==null)
            return new ArrayList<>();
            
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        ArrayList<Integer> result=new ArrayList<>();
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(i==size-1)
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
