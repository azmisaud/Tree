class BurningTree
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    static Node targetNode;
    
    static void findTheTargetNode(Node root,int target){
        if(root==null)
            return;
            
        if(root.data==target){
            targetNode=root;
            return;
        }
        
        findTheTargetNode(root.left,target);
        findTheTargetNode(root.right,target);
    }
    
    static void markParents(Node root,Map<Node,Node> parent){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        parent.put(root,null);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left!=null){
                    queue.add(current.left);
                    parent.put(current.left,current);
                }
                
                if(current.right!=null){
                    queue.add(current.right);
                    parent.put(current.right,current);
                }
            }
        }
    }
    
    public static int minTime(Node root, int target) 
    {
        // Your code goes here
        
        findTheTargetNode(root,target);
        
        
        Map<Node,Node> parent=new HashMap<>();
        markParents(root,parent);
        
        Set<Node> visited=new HashSet<>();
        
        Node targetN=targetNode;
        
        visited.add(targetN);
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(targetN);
        
        int time=0;
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            boolean burned=false;
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left!=null && !visited.contains(current.left)){
                    queue.add(current.left);
                    visited.add(current.left);
                    burned=true;
                }
                if(current.right!=null && !visited.contains(current.right)){
                    queue.add(current.right);
                    visited.add(current.right);
                    burned=true;
                }
                
                if(parent.get(current)!=null && !visited.contains(parent.get(current))){
                    queue.add(parent.get(current));
                    visited.add(parent.get(current));
                    burned=true;
                }
            }
            
            if(burned)
                time++;
        }
        
        return time;
    }
}
