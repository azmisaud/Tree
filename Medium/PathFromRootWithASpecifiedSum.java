class PathFromRootWithASpecifiedSum {

  static void dfs(Node root, int s, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> ds) {
    if(root==null)
      return;

    s+=root.data;
    ds.add(root.data);

    if(s==sum)
      result.add(new ArrayList<>(ds));

    if(root.left!=null)
      dfs(root.left,s,sum,result,ds);

    if(root.right!=null)
      dfs(root.right,s,sum,result,ds);

    ds.remove(ds.size()-1);
  }

  public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        ArrayList<Integer> ds=new ArrayList<>();

        dfs(root,0,sum,result,ds);

        return result;
    }
}
