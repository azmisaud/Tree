/*Node is as follows:
class Node{
	int data;
	Node left,right;
	
	Node(int key)
	{
	    data = key;
	    left = right = null;
	}
}

*/
class ChildrenSumInBinaryTree
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        // add your code here
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            Node current=queue.poll();
            
            if(current.left==null && current.right==null)
                continue;
                
            int data1=current.left!=null ? current.left.data : 0;
            int data2=current.right!=null ? current.right.data : 0;
            
            if(current.data!=data1+data2)
                return 0;
                
            if(current.left!=null)
                queue.add(current.left);
                
            if(current.right!=null)
                queue.add(current.right);
        }
        
        return 1;
    }
}
