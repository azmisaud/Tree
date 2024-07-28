class MaxLevelSum {
    public int maxLevelSum(Node root) {
        // add code here.
        int max=Integer.MIN_VALUE;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            int sum=0;
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                sum+=current.data;
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            max=Math.max(max,sum);
        }
        
        return max;
    }
}
