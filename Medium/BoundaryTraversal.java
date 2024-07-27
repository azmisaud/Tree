// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class BoundaryTraversal
{
    //This is an anti clock wise boundary traversal.
    
    boolean isLeaf(Node root){
        if(root==null)
            return false;
            
        if(root.left==null && root.right==null)
            return true;
            
        return false;
    }
    
    void addLeftBoundary(Node root,ArrayList<Integer> result){
        Node current=root.left;
        
        while(current!=null){
            if(!isLeaf(current))
                result.add(current.data);
                
            if(current.left!=null)
                current=current.left;
                
            else
                current=current.right;
        }
    }
    
    void addLeaves(Node root, ArrayList<Integer> result){
        
        if(isLeaf(root)){
            result.add(root.data);
            return;
        }
        
        if(root.left!=null)
            addLeaves(root.left,result);
            
        if(root.right!=null)
            addLeaves(root.right,result);
    }
    
    void addRightBoundary(Node root,ArrayList<Integer> result){
        Node current=root.right;
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        while(current!=null){
            if(!isLeaf(current))
                temp.add(current.data);
                
            if(current.right!=null)
                current=current.right;
                
            else
                current=current.left;
        }
        
        Collections.reverse(temp);
        result.addAll(temp);
    }
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer> result=new ArrayList<>();
	    
	    if(!isLeaf(node)) result.add(node.data);
	    
	    addLeftBoundary(node,result);
	    addLeaves(node,result);
	    addRightBoundary(node,result);
	    
	    return result;
	}
}
