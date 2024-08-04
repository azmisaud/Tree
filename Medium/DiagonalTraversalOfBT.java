class DiagonalTraversalOfBT
{
     private void DFS(Node root, int level, ArrayList<ArrayList<Integer>> ar){
         if(root==null)
            return;
            
        if(ar.size()<level+1){
            ar.add(new ArrayList<>());
        }
        
        ar.get(level).add(root.data);
        
        DFS(root.left,level+1,ar);
        DFS(root.right,level,ar);
     }
     
     public ArrayList<Integer> diagonal(Node root)
      {
           //add your code here.
           ArrayList<ArrayList<Integer>> ds=new ArrayList<>();
           
           DFS(root,0,ds);
           
           ArrayList<Integer> result=new ArrayList<>();
           
           for(ArrayList<Integer> m : ds)
                result.addAll(m);
                
            return result;
      }
}
