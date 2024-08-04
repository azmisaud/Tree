class ConstructTreeFromInAndPostOrder{

  private Node help(int[] inOrder, int iStart, int iEnd, int[] postOrder, int pStart,int pEnd, HashMap<Integer,Integer> map){
    if(pStart>pEnd || iStart>iEnd)
        return null;

    Node root=new Node(postOrder[pEnd]);

    int iRoot=map.get(postOrder[pEnd]);

    int numLeft=iRoot-iStart;

    root.left=help(inOrder,iStart,iRoot-1,postOrder,pStart,pStart+numLeft-1,map);
    root.right=help(inOrder,iRoot+1,iEnd,postOrder,pStart+numLeft,pEnd-1,map);

    return root;
  }

  Node buildTree(int n, int in[], int post[]) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++)
            map.put(in[i],i);
            
        return help(in,0,n-1,post,0,n-1,map);
    }
}
