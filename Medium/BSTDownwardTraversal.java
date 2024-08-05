class BSTDownwardTraversal
{
    private void findNode(Node root, int target, Node[] targetN){
        if(root==null)
            return;
            
        if(root.data==target){
            targetN[0]=root;
            return;
        }
        
        if(root.data<target){
            findNode(root.right,target,targetN);
        }
        else {
            findNode(root.left,target,targetN);
        }
    }
    
    private void DFS(Node targetN,int target, int position,long[] sum){
        if(targetN==null)
            return;
            
        if(position==0 && targetN.data!=target){
            sum[0]+=targetN.data;
        }
        
        DFS(targetN.left,target,position-1,sum);
        DFS(targetN.right,target,position+1,sum);
    }
    
    long verticallyDownBST(Node root,int target)
    {
        Node[] targetN=new Node[1];
        
        findNode(root,target,targetN);
        
        if(targetN[0]==null)
            return -1;
        
        long[] sum=new long[1];
        
        DFS(targetN[0],target,0,sum);
        
        return sum[0];
    }
}
