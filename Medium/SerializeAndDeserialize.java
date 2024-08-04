class SerializeAndDeserialize{

  public ArrayList<Integer> serialize(Node root){
    ArrayList<Integer> result=new ArrayList<>();

    if(root==null)
      return result;

    Queue<Node> queue=new LinkedList<>();
    queue.add(root);

    while(!queue.isEmpty()){
      Node current=queue.poll();

      if(current!=null){
        result.add(current.data);
        queue.add(current.left);
        queue.add(current.right);
      }
      else {
        result.add(0);
      }
    }

    return result;
  }

  public Node deserialize(ArrayList<Integer> A){
    if(A.size()==0)
        return null;

    Node root=new Node(A.get(0));

    Queue<Node> queue=new LinkedList<>();
    queue.add(root);

    for(int i=1;i<A.size();i++){
      Node current=queue.poll();

      if(A.get(i)!=0){
        Node left=new Node(A.get(i));
        current.left=left;
        queue.add(left);
      }

      if(A.get(++i)!=0){
        Node right=new Node(A.get(i));
        current.right=right;
        queue.add(right);
      }
    }

    return root;
  }
}
