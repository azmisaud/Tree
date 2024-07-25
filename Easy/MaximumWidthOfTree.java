class MaximumWidthOfTree {
    // Function to get the maximum width of a binary tree.
    int getMaxWidth(Node root) {
        // Your code here
        Queue<Node>  queue=new LinkedList<>();
        queue.add(root);
        
        int maxWidth=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            maxWidth=Math.max(size,maxWidth);
            
            for(int i=0;i<size;i++){
                Node current=queue.peek();
                
                queue.poll();
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
        }
        
        return maxWidth;
    }
}
