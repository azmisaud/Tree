/*
// A Binary Tree node
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class RootToLeafPathSum {
    /*you are required to complete this function */
    boolean DFS(Node root,int sum,int target){
        if(root==null)
            return false;
          
         sum+=root.data;  
         
        if(root.left==null && root.right==null && sum==target)
            return true;
        
        return(DFS(root.left,sum,target) || DFS(root.right,sum,target));
    }
    boolean hasPathSum(Node root, int target) {
        // Your code here
        if(DFS(root,0,target))
            return true;
            
        return false;
    }
}
