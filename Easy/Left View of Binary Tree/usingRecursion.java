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
}*/
class usingRecursion
{
    //Function to return list containing elements of left view of binary tree.
    void help(Node root, ArrayList<Integer> result, int level){
        if(root==null)
            return;
            
        if(level==result.size())
            result.add(root.data);
            
        help(root.left,result,level+1);
        help(root.right,result,level+1);
    }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> result=new ArrayList<>();
      
      help(root,result,0);
      
      return result;
    }
}
