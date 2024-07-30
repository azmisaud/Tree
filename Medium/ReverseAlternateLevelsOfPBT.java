/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


*/
class ReverseAlternateLevelsOfPBT
{
    static void help(Node root1, Node root2, int level){
        if(root1==null && root2==null)
            return;
            
        if(level%2==0 && root1==null){
            root1=new Node(root2.data);
            root2=null;
        }
        
        if(level%2==0 && root2==null){
            root2=new Node(root1.data);
            root1=null;
        }
        
        if(level%2==0){
            int k=root1.data;
            root1.data=root2.data;
            root2.data=k;
        }
        
        help(root1.left,root2.right,level+1);
        help(root1.right,root2.left,level+1);
    }
	static void reverseAlternate( Node root)  
    {  
       // code here.
       if(root==null)
        return;
        
        help(root.left,root.right,2);
    }  
}
