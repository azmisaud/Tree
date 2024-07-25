class LeavesAtSameLevel
{
    void traversal(Node root,int level,Set<Integer> leafLevels){
        if(root==null)
            return;
            
        if(root.left==null && root.right==null)
            leafLevels.add(level);
            
        traversal(root.left,level+1,leafLevels);
        traversal(root.right,level+1,leafLevels);
    }
    boolean check(Node root)
    {
	// Your code here	
	    Set<Integer> leafLevels=new HashSet<>();
	    
	    traversal(root,1,leafLevels);
	    
	    return leafLevels.size()==1;
	    
    }
    
}
