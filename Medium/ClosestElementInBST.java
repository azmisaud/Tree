class ClosestElementInBST
{
    //Function to find the least absolute difference between any node
    //value of the BST and the given integer.
    static int minDiff(Node  root, int K) 
    { 
        // Write your code here
        int difference=Integer.MAX_VALUE;
        
        Node current=root;
        
        while(current!=null){
            if(current.data==K)
                return 0;
                
            if(current.data<K){
                difference=Math.min(difference,Math.abs(current.data-K));
                current=current.right;
            }
            else {
                difference=Math.min(difference,Math.abs(current.data-K));
                current=current.left;
            }
        }
        
        return difference;
    } 
}

