/*
// node structure:

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

class BheemWantsLadoos{
    
    private static void markParents(Node root, Map<Node,Node> parent){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);

        parent.put(root,null);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i=0;i<size;i++){
                Node current=queue.poll();

                if(current.left!=null){
                    queue.add(current.left);
                    parent.put(current.left,current);
                }

                if(current.right!=null){
                    queue.add(current.right);
                    parent.put(current.right,current);
                }
            }
        }
    }
    
    private static Node findNode(Node root, int target){
        if(root==null)
            return null;

        if(root.data==target)
            return root;

        Node left=findNode(root.left,target);
        if(left!=null)
            return left;

        return findNode(root.right,target);
    }
    
    static int ladoos(Node root, int home, int k){
        // Your code goes here
        Map<Node,Node> parent=new HashMap<>();
        markParents(root,parent);

        Node homeNode=findNode(root,home);

        Queue<Node> queue=new LinkedList<>();
        queue.add(homeNode);

        Set<Node> visited=new HashSet<>();
        visited.add(homeNode);

        int level=0;

        int sum=0;

        while(!queue.isEmpty()){
            if(level==k+1)
                break;

            int size=queue.size();

            for(int i=0;i<size;i++){
                Node current=queue.poll();

                sum+=current.data;

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


        return sum;
    }
}

