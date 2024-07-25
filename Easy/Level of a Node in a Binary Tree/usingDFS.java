class usingDFS {

  int help(Node node,int data,int level) {
    if(node==null)
      return 0;

    if(node.data==data)
      return level;

    int downLevel=help(node.left,data,level+1);
    if(downLevel!=0)
      return downLevel;

    return help(node.right,data,level+1);
  }

  int getLevel(Node node,int data) {
    return help(node,data,1);
  }
}
