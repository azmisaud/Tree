class Pair {
    int vertical;
    Node node;
    
    public Pair(int vertical, Node node){
        this.vertical=vertical;
        this.node=node;
    }
}
class BottomViewOfBinaryTree
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,root));
        
        TreeMap<Integer,Node> map=new TreeMap<>();
        
        while(!queue.isEmpty()){
            Node current=queue.peek().node;
            int vertical=queue.peek().vertical;
            
            queue.poll();
            
            map.put(vertical,current);
            
            if(current.left!=null)
                queue.add(new Pair(vertical-1,current.left));
                
            if(current.right!=null)
                queue.add(new Pair(vertical+1,current.right));
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        for(Node node : map.values())
            result.add(node.data);
            
        return result;
    }
}
