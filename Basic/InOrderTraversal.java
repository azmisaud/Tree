class InOrderTraversal {

void inHelp(Node node, ArrayList<Integer> list) {
  if(node==null)
    return;

  inHelp(node.left,list);
  list.add(node.data);
  inHelp(node.right,list);
}

ArrayList<Integer> inOrder(Node root){
  ArrayList<Integer> list=new ArrayList<>();

  inHelp(root,list);

  return list;
}
}
