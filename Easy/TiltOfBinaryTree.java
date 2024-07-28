/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class TiltOfBinaryTree{
    private int tilt=0;
    
    private int DFS(Node root){
        if(root==null)
            return 0;
            
        int left=DFS(root.left);
        int right=DFS(root.right);
        
        tilt+=Math.abs(left-right);
        
        return root.data+left+right;
    }
    public int tiltTree(Node root){
        //code here
        
        DFS(root);
        
        return tilt;
    }
}
