/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class AllNodesDistanceK {
    private void markParents(TreeNode root, Map<TreeNode,TreeNode> parent){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            
            if(current.left!=null){
                parent.put(current.left,current);
                queue.add(current.left);
            }
            
            if(current.right!=null){
                parent.put(current.right,current);
                queue.add(current.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        Map<TreeNode,TreeNode> parent=new HashMap<>();
        markParents(root,parent);
        
        Set<TreeNode> visited=new HashSet<>();
        visited.add(target);
        
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(target);
        
        int level=0;
        
        while(!queue.isEmpty()){
            if(level==k)
                break;
            
            int size=queue.size();
            
            for(int i=0;i<size;i++){
                TreeNode current=queue.poll();
                
                if(current.left!=null && !visited.contains(current.left)){
                    queue.add(current.left);
                    visited.add(current.left);
                }
                
                if(current.right!=null && !visited.contains(current.right)){
                    queue.add(current.right);
                    visited.add(current.right);
                }
                
                if(parent.get(current)!=null && !visited.contains(parent.get(current))){
                    queue.add(parent.get(current));
                    visited.add(parent.get(current));
                }
            }
            level++;
        }
        
        List<Integer> result=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode current=queue.poll();
            result.add(current.val);
        }
        
        return result;
    }
}
