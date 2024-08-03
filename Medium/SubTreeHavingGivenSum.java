/*class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}*/


class SubTreeHavingGivenSum
{
    //Function to count number of subtrees having sum equal to given sum.
    
    private int helper(Node root, int X, int[] count){
        if(root==null)
            return 0;
            
        int left=helper(root.left,X,count);
        int right=helper(root.right,X,count);
        
        if((root.data+left+right)==X)
            count[0]++;
            
        return root.data+left+right;
    }
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	    int[] count=new int[1];
	    
	    helper(root,X,count);
	    
	    return count[0];
    }
}

