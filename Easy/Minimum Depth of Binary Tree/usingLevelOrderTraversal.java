class Pair {
    Node node;
    int depth;
    
    public Pair(Node node, int depth){
        this.node=node;
        this.depth=depth;
    }
}
class usingLevelOrderTraversal
{
	int minDepth(Node root)
	{
	    //code here
	    Queue<Pair> queue=new LinkedList<>();
	    queue.add(new Pair(root,1));
	    
	    while(!queue.isEmpty()){
	        int size=queue.size();
	        
	        for(int i=0;i<size;i++){
	            Pair current=queue.poll();
	            
	            if(current.node.left==null && current.node.right==null)
	                return current.depth;
	                
                if(current.node.left!=null)
                    queue.add(new Pair(current.node.left,current.depth+1));
                    
                if(current.node.right!=null)
                    queue.add(new Pair(current.node.right,current.depth+1));
	        }
	    }
	    
	    return 0;
	}
}
