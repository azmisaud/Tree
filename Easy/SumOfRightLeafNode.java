class SumOfRightLeafNode
{
    int rightLeafSum(Node root)
    {
        // code here
        if(root.left==null && root.right==null)
            return 0;
            
        int sum=0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
            Node current=queue.poll();
            
            if(current.left!=null)
                queue.add(current.left);
                
            if(current.right!=null && current.right.left==null && current.right.right==null){
                sum+=current.right.data;
                continue;
            }
            
                
            if(current.right!=null)
                queue.add(current.right);
            }
        }
        
        return sum;
    }
}
