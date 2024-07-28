class TransformToSumTree{
    
    private int DFS(Node root){
        if(root==null)
            return 0;
            
        int left=DFS(root.left);
        int right=DFS(root.right);
        
        int data=root.data;
        
        root.data=left+right;
        
        return data+left+right;
    }
    public void toSumTree(Node root){
         //add code here.
         DFS(root);
    }
}
