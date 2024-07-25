/*
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}*/
class MaxLevelSumInBinaryTree {
    public int maxLevelSum(Node root) {
        // add code here.
        int result=Integer.MIN_VALUE;
        
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            int sum=0;
            
            for(int i=0;i<size;i++){
                Node current=queue.poll();
                
                sum+=current.data;
                
                if(current.left!=null)
                    queue.add(current.left);
                    
                if(current.right!=null)
                    queue.add(current.right);
            }
            
            result=Math.max(result,sum);
        }
        
        return result;
    }
}
