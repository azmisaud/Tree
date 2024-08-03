/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/

class KthAncestorInATree
{
    private boolean found;
    
    private void DFS(Node root,int node,ArrayList<Integer> ds){
        
        if(root==null || found)
            return;
            
        if(root.data==node){
            found=true;
            return;
        }
        
        ds.add(root.data);
        
        DFS(root.left,node,ds);
        DFS(root.right,node,ds);
        
        if(!found)
            ds.remove(ds.size()-1);
    }
    
    public int kthAncestor(Node root, int k, int node)
    {
        //Write your code here
        ArrayList<Integer> ds=new ArrayList<>();
        
        DFS(root,node,ds);
        
        int result=-1;
        
        if(k<=ds.size()){
            Collections.reverse(ds);
            result=ds.get(k-1);
        }
        
        return result;
    }
}
