class OddEvenLevelDifference
{
	int getLevelDiff(Node root)
	{
	    //code here
	    int sum=0;
	    int level=1;
	    
	    Queue<Node> queue=new LinkedList<>();
	    queue.add(root);
	    
	    while(!queue.isEmpty()){
	        int size=queue.size();
	        int currSum=0;
	        
	        for(int i=0;i<size;i++){
	            Node current=queue.poll();
	            
	            currSum+=current.data;
	            
	            if(current.left!=null)
	                queue.add(current.left);
	                
                if(current.right!=null)
                    queue.add(current.right);
	        }
	        
	        if(level%2==0)
	            sum-=currSum;
            else
                sum+=currSum;
                
            level++;
	    }
	    
	    return sum;
	}
}
