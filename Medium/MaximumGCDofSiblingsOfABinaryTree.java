class MaximumGCDofSiblingsOfABinaryTree {
    
    static private int GCD(int a, int b){
        if(b==0)
            return a;
            
        return GCD(b,a%b);
    }
    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
        // code here
        HashMap<Integer,ArrayList<Integer>> hs=new HashMap<>();
        
        int size=arr.size();
        
        for(int i=0;i<size;i++){
            int parent=arr.get(i).get(0);
            int child=arr.get(i).get(1);
            if(!hs.containsKey(parent)){
                ArrayList<Integer> sub=new ArrayList<>();
                sub.add(child);
                hs.put(parent,new ArrayList<>(sub));
            }
            else {
                hs.get(parent).add(child);
            }
        }
        
        int maxGCD=0;
        
        for(ArrayList<Integer> ar : hs.values()){
            if(ar.size()%2==0){
                maxGCD=Math.max(maxGCD, GCD(ar.get(0),ar.get(1)));
            }
        }
        
        return maxGCD;
    }
}
