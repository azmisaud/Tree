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

class ZigZagTraversal
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    //Add your code here.
	    ArrayList<Integer> result=new ArrayList<>();
	    
	    boolean flag=false;
	    
	    Deque<Node> deque=new LinkedList<>();
	    deque.add(root);
	    
	    while(!deque.isEmpty()){
	        int size=deque.size();
	        
	        for(int i=0;i<size;i++){
	            if(!flag){
	                Node current=deque.pollFirst();
	                result.add(current.data);
	                
	                if(current.left!=null)
	                    deque.addLast(current.left);
	                    
                    if(current.right!=null)
                        deque.addLast(current.right);
	            } else {
	                Node current=deque.pollLast();
	                result.add(current.data);
	                
	                if(current.right!=null)
	                    deque.addFirst(current.right);
	                    
                    if(current.left!=null)
                        deque.addFirst(current.left);
	            }
	        }
	        flag=!flag;
	    }
	    
	    return result;
	}
}
