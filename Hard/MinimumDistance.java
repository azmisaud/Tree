/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class MinimumDistance {
    
    private int findDistance(Node a, int b){
        
        if(a.data==b)
            return 0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(a);
        
        int level=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left!=null){
                    if(current.left.data==b)
                        return level+1;
                        
                    queue.add(current.left);
                }
                
                if(current.right!=null){
                    if(current.right.data==b)
                        return level+1;
                        
                    queue.add(current.right);
                }
            }
            
            level++;
        }
        
        return -1;
    }
    
    private Node lca(Node node, int n1, int n2){
        if(node==null || node.data==n1 || node.data==n2)
            return node;
            
        Node left=lca(node.left,n1,n2);
        Node right=lca(node.right,n1,n2);
        
        if(left==null)
            return right;
        else if(right==null)
            return left;
            
        else return node;
    }
    
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca=lca(root,a,b);
        
        int d1=findDistance(lca,a);
        int d2=findDistance(lca,b);
        
        return d1+d2;
    }
}
