/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class MirrorOfAGivenNode
{
    
    void mirror(Node a, Node b, int target, int[] result){
        if(a==null || b==null)
            return;
            
        if(a.data==target)
            result[0]=b.data;
            
        if(b.data==target)
            result[0]=a.data;
            
        mirror(a.left,b.right,target,result);
        mirror(a.right,b.left,target,result);
    }
   
    public int findMirror(Node root,int target)
    {
       //code here
       if(target==root.data)
            return target;
            
        int[] result=new int[1];
        result[0]=-1;
        
        mirror(root.left,root.right,target,result);
        
        return result[0];
    }
}
