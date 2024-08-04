class FloorInBST {
    
    
    public static int floor(Node root, int x) {
        // Code here
        int floor=-1;
        
        Node current=root;
        
        while(current!=null){
            if(current.data==x)
                return x;
                
            if(current.data<x){
                floor=current.data;
                current=current.right;
            }
            else {
                current=current.left;
            }
        }
        
        return floor;
    }
}
