class CeilInABST {
    // Function to return the ceil of given number in BST.
    int findCeil(Node root, int key) {
        
        Node temp=root;
        
        int ceil=-1;
        
        while(temp!=null){
            if(temp.data==key)
                return key;
                
            if(key<temp.data){
                ceil=temp.data;
                temp=temp.left;
            }
            
            else {
                temp=temp.right;
            }
        }
        
        return ceil;
    }
}
