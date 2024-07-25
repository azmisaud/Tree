class MaxAndMinElementInBinaryTree {
    
    public static int findMax(Node root){
        //code here
        int max=Integer.MIN_VALUE;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            Node current=queue.poll();
            
            max=Math.max(max,current.data);
            
            if(current.left!=null)
                queue.add(current.left);
                
            if(current.right!=null)
                queue.add(current.right);
        }
        
        return max;
    }
    public static int findMin(Node root){
        //code here
        int min=Integer.MAX_VALUE;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            Node current=queue.poll();
            
            min=Math.min(min,current.data);
            
            if(current.left!=null)
                queue.add(current.left);
                
            if(current.right!=null)
                queue.add(current.right);
        }
        
        return min;
    }
}
