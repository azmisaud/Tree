/* Tree node structure  used in the program
class Node{
    public int data;
    public Node left,right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
 */
 class ImageMultiplication {
     
     long mod=1000000007;
     
    private void multiply(Node a, Node b, long[] result){
        if(a==null || b==null)
            return;
        
        
        result[0]=(result[0]+((a.data%mod)*(b.data%mod))%mod)%mod;
        
        multiply(a.left,b.right,result);
        multiply(a.right,b.left,result);
    }
    public long imgMultiply(Node root)
    {
        // code here
        
        long[] result=new long[1];
        
        result[0]=((root.data%mod)*(root.data%mod))%mod;
        
        multiply(root.left,root.right,result);
        
        return result[0];
    }
}
