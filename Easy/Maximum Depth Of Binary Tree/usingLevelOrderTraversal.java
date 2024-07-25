class usingLevelOrderTraversal {
  public static int maxDepth(Node root) {
    // code here
    //Level Order Traversal
    
    Queue<Pair> queue=new LinkedList<>();
    queue.add(new Pair(root,1));
    
    int maxDepth=1;
    
    while(!queue.isEmpty()){
        int size=queue.size();
        
        for(int i=0;i<queue.size();i++){
            Node current=queue.peek().node;
            int currentDepth=queue.peek().depth;
            
            queue.poll();
            
            if(current.left!=null)
                queue.add(new Pair(current.left, currentDepth+1));
                
            if(current.right!=null)
                queue.add(new Pair(current.right, currentDepth+1));
                
            maxDepth=currentDepth;
        }
        
    }
    return maxDepth;
  }
}
