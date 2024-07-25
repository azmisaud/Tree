class LargestValueInEachLevel
{
    public ArrayList<Integer> largestValues(Node root)
    {
        //code here
        ArrayList<Integer> result=new ArrayList<>();
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                max=Math.max(max,current.data);
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            result.add(max);
        }
        
        return result;
    }
}
