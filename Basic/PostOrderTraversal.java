class PostOrderTraversal {

  void postHelp(Node node, ArrayList<Integer> list) {
    if(node==null)
      return;

    postHelp(node.left,list);
    postHelp(node.right,list);
    list.add(node.data);
  }

  ArrayList<Integer> postOrder(Node root){
    ArrayList<Integer> list=new ArrayList<>();

    postHelp(root,list);

    return list;
  }
}
