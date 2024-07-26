/*

Definition for Binary Tree Node
class Node
{
    int data;
    Node left;
    Node right;
    
    Node(int data)
    {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class CheckLevelsAreAnagram {
    public static boolean areAnagrams(Node node1, Node node2) {
        // code here
        
        Queue<Node> queue1=new LinkedList<>();
        Queue<Node> queue2=new LinkedList<>();
        
        queue1.add(node1);
        queue2.add(node2);
        
        while(!queue1.isEmpty() || !queue2.isEmpty()){
            int size1=queue1.size();
            int size2=queue2.size();
            
            if(size1!=size2) return false;
            
            ArrayList<Integer> ar1=new ArrayList<>();
            ArrayList<Integer> ar2=new ArrayList<>();
            
            for(int i=0;i<size1;i++){
                Node current1=queue1.poll();
                Node current2=queue2.poll();
                
                ar1.add(current1.data);
                ar2.add(current2.data);
                
                if(current1.left!=null)
                    queue1.add(current1.left);
                    
                if(current1.right!=null)
                    queue1.add(current1.right);
                    
                if(current2.left!=null)
                    queue2.add(current2.left);
                    
                if(current2.right!=null)
                    queue2.add(current2.right);
            }
            
            Collections.sort(ar1);
            Collections.sort(ar2);
            
            if(!ar1.equals(ar2)) return false;
        }
        
        return true;
    }
    
    //A HashMap can be used to reduce the time complexity.
}
        
