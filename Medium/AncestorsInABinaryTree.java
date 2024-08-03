class AncestorsInABinaryTree{

  private boolean found;

  private void helper(Node root, int target, ArrayList<Integer> ds){
    if(root==null || found)
      return;

    if(root.data==target){
      found=true;
      return;
    }

    ds.add(root.data);

    helper(root.left,target,ds);
    helper(root.right,target,ds);

    if(!found)
      ds.remove(ds.size()-1);
  }

  public ArrayList<Integer> Ancestors(Node root, int target) {
        // add your code here
        ArrayList<Integer> result=new ArrayList<>();
        helper(root,target,result);
        
        if(!result.isEmpty())
            Collections.reverse(result);
        return result;
    }
}
