class SearchANodeInABST {
    // Function to search a node in BST.
    boolean search(Node root, int x) {
        // Your code here
        while(root!=null && root.data!=x)
            root=x<root.data ? root.left : root.right;
            
        if(root==null)
            return false;
            
        return true;
    }
}
