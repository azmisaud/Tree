/*
Tree node structure  used in the program
class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class MaximumValue {
    
    private void help(Node root, int level, ArrayList<Integer> result){
        if(root==null)
            return;
            
        if(level==result.size())
            result.add(root.data);
            
        else {
            if(result.get(level)<root.data){
                result.set(level,root.data);
            }
        }
        
        help(root.left,level+1,result);
        help(root.right,level+1,result);
    }
    ArrayList<Integer> maximumValue(Node node) {
       //code here
       ArrayList<Integer> result=new ArrayList<>();
       
       help(node,0,result);
       
       return result;
    }
}
