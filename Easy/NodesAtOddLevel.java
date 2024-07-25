
/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class NodesAtOddLevel{
    public ArrayList<Node> nodesAtOddLevels(Node root)
    {
        //code here
        int level=1;
        
        ArrayList<Node> result=new ArrayList<>();
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(level%2!=0)
                    result.add(current);
                    
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
