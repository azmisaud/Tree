class PrintBinaryTreeLevelsInSortedOrder
{
    public static ArrayList <ArrayList <Integer>> binTreeSortedLevels (int arr[], int n)
    {
        // your code here  
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        
        int s=0;
        int k=2;
        
        while(s<n){
            
            ArrayList<Integer> rs=new ArrayList<>();
            
            for(int i=s;i<k-1;i++){
                if(i<n){
                rs.add(arr[i]);
                }
            }
            
            Collections.sort(rs);
            
            result.add(rs);
            
            s=k-1;
            k*=2;
        }
        
        return result;
    }
}
