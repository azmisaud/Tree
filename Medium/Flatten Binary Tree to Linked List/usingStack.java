class usingStack
{
    public static void flatten(Node root)
    {
        //code here
        Stack<Node> stack=new Stack<>(); //LIFO
        stack.push(root);
        
        while(!stack.isEmpty()){
            Node current=stack.pop();
            
            if(current.right!=null)
                stack.push(current.right);
                
            if(current.left!=null)
                stack.push(current.left);
                
            if(!stack.isEmpty())
                current.right=stack.peek();
                
            current.left=null;
        }
    }
}
