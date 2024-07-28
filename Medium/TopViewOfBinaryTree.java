/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Pair {
    int vertical;
    Node node;
    
    public Pair(int vertical,Node node){
        this.vertical=vertical;
        this.node=node;
    }
}

class TopViewOfBinaryTree {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        // add your code
        Queue<Pair> queue=new LinkedList<>();
        queue.add(new Pair(0,root));
        
        TreeMap<Integer,Node> map=new TreeMap<>();
        
        while(!queue.isEmpty()){
            Node current=queue.peek().node;
            int vertical=queue.peek().vertical;
            
            queue.poll();
            
            if(!map.containsKey(vertical))
                map.put(vertical,current);
                
            if(current.left!=null)
                queue.add(new Pair(vertical-1,current.left));
                
            if(current.right!=null)
                queue.add(new Pair(vertical+1,current.right));
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        
        for(Node node : map.values())
            result.add(node.data);
            
        return result;
    }
}
