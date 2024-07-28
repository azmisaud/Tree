/*class Node
{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
         left = right = null;
    }
}*/

class usingRecursion {
    // Function to return list containing elements of right view of binary tree.
    
    void help(Node root, ArrayList<Integer> result, int level){
        if(root==null)
            return;
            
        if(level==result.size())
            result.add(root.data);
            
        help(root.right,result,level+1);
        help(root.left,result,level+1);
    }
    ArrayList<Integer> rightView(Node root) {
        // add code here.
        ArrayList<Integer> result=new ArrayList<>();
        
        help(root,result,0);
        
        return result;
    }
}
