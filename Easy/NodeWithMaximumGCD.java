/*class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 */

class NodeWithMaximumGCD {
    int max=0;
    int node=0;
    
    int GCD(int a, int b){
        if(b==0)
            return a;
            
        return GCD(b,a%b);
    }
    
    void help(Node root){
        if(root==null)
            return;
    
    
        if(root.left!=null && root.right!=null){    
            int gcd=GCD(root.left.data,root.right.data);
            
            if(gcd>max){
                max=gcd;
                node=root.data;
            }
            
            if(gcd==max && root.data>node){
                max=gcd;
                node=root.data;
            }
        }
        help(root.left);
        help(root.right);
    }
    int maxGCD(Node root) {
        // code here 
        help(root);
        
        return node;
    }
}

