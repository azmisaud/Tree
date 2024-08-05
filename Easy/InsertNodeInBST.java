class InsertNodeInBST {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
        // your code here
        if(root==null)
            return null;
            
        Node current=root;
        
        while(current!=null){
            if(current.data==Key){
                return root;
            }
            if(current.data<Key){
                if(current.right==null){
                    current.right=new Node(Key);
                    break;
                }
                current=current.right;
            }
            else {
                if(current.left==null){
                    current.left=new Node(Key);
                    break;
                }
                current=current.left;
            }
        }
        
        return root;
    }
}
