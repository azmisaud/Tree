/*
node class of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}
*/
class FoldableBinaryTree
{
    //Function to check whether a binary tree is foldable or not.
    boolean isMirror(Node a, Node b){
        if(a==null || b==null)
            return a==b;
            
        return (isMirror(a.left,b.right) && isMirror(a.right,b.left));
    }
    boolean IsFoldable(Node node) 
	{ 
		// your code 
		if(node==null)
		    return true;
		    
	    return isMirror(node.left,node.right);
	} 
}
