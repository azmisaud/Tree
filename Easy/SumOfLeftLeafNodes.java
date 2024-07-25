class SumOfLeftLeafNodes{

    public int leftLeavesSum(Node root) 
    { 
        // Write your code here
        
        if(root.left==null && root.right==null)
            return 0;
            
        int sum=0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.right!=null)
                    queue.add(current.right);
                    
                if(current.left!=null && current.left.right==null && current.left.left==null){
                    sum+=current.left.data;
                    continue;
                }
                
                if(current.left!=null)
                    queue.add(current.left);
            }
        }
        return sum;
    } 

}
