class PreOrderTraversal {

  static void preHelp(Node node, ArrayList<Integer> list) {
    if(node==null)
      return;

    list.add(node.data);
    preHelp(node.left,list);
    preHelp(node.right,list);
  }

  static ArrayList<Integer> preOrder(Node root){
    ArrayList<Integer> list=new ArrayList<>();

    preHelp(root,list);

    return list;
  }
}
