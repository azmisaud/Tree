/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Pair {
    TreeNode node;
    int number;
    
    public Pair(TreeNode node, int number){
        this.node=node;
        this.number=number;
    }
}
class MaximumWidthOfBT {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        
        int result=0;
        
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(root,0));
        
        while(!queue.isEmpty()){
            int size=queue.size();
            
            int min=queue.peek().number;
            
            int first=0;
            int last=0;
            
            for(int i=0;i<size;i++){
                int currentNum=queue.peek().number - min;
                TreeNode current=queue.peek().node;
                
                queue.poll();
                
                if(i==0)
                    first=currentNum;
                
                if(i==size-1)
                    last=currentNum;
                
                if(current.left!=null)
                    queue.add(new Pair(current.left,currentNum*2+1));
                
                if(current.right!=null)
                    queue.add(new Pair(current.right,currentNum*2+2));
            }
            result=Math.max(result,last-first+1);
        }
        
        return result;
    }
}
