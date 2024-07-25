class LevelOrderTraversalLineByLine
{
    //Function to return the level order traversal line by line of a tree.
    static ArrayList<ArrayList<Integer>> levelOrder(Node node) 
    {
        // Your code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            
            ArrayList<Integer> sub=new ArrayList<>();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                sub.add(current.data);
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            result.add(new ArrayList<>(sub));
        }
        
        return result;
    }
}
