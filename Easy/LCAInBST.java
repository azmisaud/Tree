class LCAInBST
{   
    //Function to find the lowest common ancestor in a BST. 
	Node LCA(Node root, int n1, int n2)
	{
        // code here. 
        int min=Math.min(n1,n2);
        int max=Math.max(n1,n2);
        
        Node current=root;
        
        while(current!=null){
            if(min<=current.data && max>=current.data)
                return current;
                
            else if(max<current.data)
                current=current.left;
                
            else 
                current=current.right;
        }
        
        return null;
    }
    
}
