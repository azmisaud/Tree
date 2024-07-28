class Tuple {
  Node node;
  int vertical;
  int level;

  public Tuple(Node node, int vertical, int level) {
    this.node=node;
    this.vertical=vertical;
    this.level=level;
  }
}

class VerticalOrderTraversal {
  static ArrayList <Integer> verticalOrder(Node root){
    if(root==null)
      return null;

    Queue<Tuple> queue=new LinkedList<>();
    queue.add(new Tuple(root,0,0));

    TreeMap<Integer,TreeMap<Integer,Queue<Integer>>> map=new TreeMap<>();

    while(!queue.isEmpty()){
      Node current=queue.peek().node;
      int vertical=queue.peek().vertical;
      int level=queue.peek().level;

      queue.poll();

      if(!map.containsKey(vertical))
        map.put(vertical,new TreeMap<>());

      if(!map.get(vertical).containsKey(level))
        map.get(vertical).put(level,new LinkedList<>());

       if(current.left!=null)
         queue.add(new Tuple(current.left,vertical-1,level+1));

      if(current.right!=null)
        queue.add(new Tuple(current.right,vertical+1,level+1));
    }

    ArrayList<Integer> result=new ArrayList<>();

    for(TreeMap<Integer,Queue<Integer>> value : map.values()){
      for(Queue<Integer> queue2 : value.values()){
        while(!queue2.isEmpty())
          result.add(queue2.poll());
      }
    }

    return result;
  }
}
