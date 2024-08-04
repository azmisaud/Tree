class usingRecursion
{
    private static void flatten(Node root,Node[] previous){
        if(root==null)
            return;
            
        flatten(root.right,previous);
        flatten(root.left,previous);
        
        root.right=previous[0];
        root.left=null;
        previous[0]=root;
    }
    public static void flatten(Node root)
    {
        //code here
        Node[] previous=new Node[1];
        previous[0]=null;
        
        flatten(root,previous);
    }
}
