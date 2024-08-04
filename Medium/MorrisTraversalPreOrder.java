class MorrisTraversalPreOrder{

  static ArrayList<Integer> morrisTraversal(Node node){
        if(node==null)
            return null;

        ArrayList<Integer> result=new ArrayList<>();

        Node current=node;

        while(current!=null){
            if(current.left==null){
                result.add(current.data);
                current=current.right;
            }
            else{
                Node previous=current.left;
                while(previous.right!=null && previous.right!=current){
                    previous=previous.right;
                }

                if(previous.right==null){
                    previous.right=current;
                    result.add(current.data);
                    current=current.left;
                }
                else{
                    previous.right=null;
                    current=current.right;
                }
            }
        }

        return result;
    }

 public static void main(String[] args) {

        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.left.right.left=new Node(8);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        node.right.right.left=new Node(9);
        node.right.right.right=new Node(10);
        
        System.out.println(morrisTraversal(node));
    }
}
}
