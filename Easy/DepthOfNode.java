/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class DepthOfNode{
    public static int depthOfOddLeaf(Node root)
    {
        //code here
        int level=1;
        int maxDepth=0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()) {
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left==null && current.right==null && level%2!=0)
                    maxDepth=level;
                    
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            level++;
        }
        
        return maxDepth;
    }
}
