/*
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class LeafUnderBudget{
    public int getCount(Node node, int bud)
    {
        //code here  
        int budget=bud;
        int count=0;
        int level=1;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        
        while(!queue.isEmpty()){
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
            
                if(current.left==null && current.right==null && budget>=level) {
                    count++;
                    budget-=level;
                }
                
                if(budget<level) break;
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            level++;
        }
         
        return count;   
    }
}
