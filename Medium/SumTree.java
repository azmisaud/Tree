/* A Binary Tree node
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
class SumTree
{
    
    private boolean result=true;
    
    int sum(Node root){
        if(root==null)
            return 0;
            
        int left=sum(root.left);
        int right=sum(root.right);
        
        if(root.data!=left+right){
            if(!(root.left==null && root.right==null))
                result=false;
        }
            
        return root.data+left+right;
    }
	boolean isSumTree(Node root)
	{
             // Your code here
             sum(root);
             return result;
	}
}
