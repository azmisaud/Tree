class Pair {
    Node node;
    long sum;
    
    public Pair(Node node, long sum){
        this.node=node;
        this.sum=sum;
    }
}
class RootToLeafPathsSum
{
	public static long treePathsSum(Node root)
    {
         long sum=0;
         
         Queue<Pair> queue=new LinkedList<>();
         queue.add(new Pair(root,root.data));
         
         while(!queue.isEmpty()){
             int size=queue.size();
             
             for(int i=0;i<size;i++){
                 Node current=queue.peek().node;
                 long currentSum=queue.peek().sum;
                 
                 queue.poll();
                 
                 if(current.left==null && current.right==null)
                    sum+=currentSum;
                    
                if(current.left!=null){
                    long currSum=currentSum*10+current.left.data;
                    queue.add(new Pair(current.left,currSum));
                }
                
                if(current.right!=null){
                    long currSum=currentSum*10+current.right.data;
                    queue.add(new Pair(current.right,currSum));
                }
             }
         }
         
         return sum;
	}
}
