/*

class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/


class IdenticalTrees
{
    //Function to check if two trees are identical.
    //It can be done by using any Traversal Technique, be it PreOrder, InOrder, PostOrder or Level Order Traversal.
    
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    
	    // If the left sub tree, right sub tree and the value is same, the trees are identical.
	    
	    if(root1==null || root2==null)
	        return root1==root2;
	        
        return root1.data==root2.data && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
	}
	
}
