/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class SumOfLeafNodesAtMinLevel {
     public int minLeafSum(Node root){
        //code here
        
        int sum=0;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                if(current.left==null && current.right==null)
                    sum+=current.data;
                    
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            if(sum>0)
                break;
        }
        
        return sum;
    }
}
