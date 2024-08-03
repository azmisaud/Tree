// class Node  
// { 
//     int data; 
//     Node left, right;
// }

class NodesAtGivenDistance
{
    static Node targetNode;
    
    static void findTheTargetNode(Node root, int target){
        if(root==null)
            return;
            
        if(root.data==target){
            targetNode=root;
            return;
        }
        
        findTheTargetNode(root.left,target);
        findTheTargetNode(root.right,target);
    }
    
    static void findParents(Node root, Map<Node, Node> parent){
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
    
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        findTheTargetNode(root,target);
        
        Node targetN=targetNode;
        
        Map<Node,Node> parent=new HashMap<>();
        findParents(root,parent);
        
        Set<Node> visited=new HashSet<>();
        visited.add(targetN);
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(targetN);
        
        int level=0;
        
        while(!queue.isEmpty()){
            
            if(level==k)
                break;
                
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left!=null && !visited.contains(current.left)){
                    queue.add(current.left);
                    visited.add(current.left);
                }
                
                if(current.right!=null && !visited.contains(current.right)){
                    queue.add(current.right);
                    visited.add(current.right);
                }
                
                if(parent.get(current)!=null && !visited.contains(parent.get(current))){
                    queue.add(parent.get(current));
                    visited.add(parent.get(current));
                }
            }
            
            level++;
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        while(!queue.isEmpty()){
            Node current=queue.poll();
            result.add(current.data);
        }
        
        Collections.sort(result);
        
        return result;
    }
};
