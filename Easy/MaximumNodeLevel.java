class MaximumNodeLevel
{
    // Return the level (0-indexed) with maximum number of nodes.
    public static int maxNodeLevel(Node root)
    {
        // add your code here
        int result=0;
        int level=0;
        int maxSize=0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            
            if(size>maxSize){
                maxSize=size;
                result=level;
            }
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
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
