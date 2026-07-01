class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        int[][] pas=new int[rowIndex+1][rowIndex+1];
        for(int i=0;i<=rowIndex;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || i==j) pas[i][j]=1;
                else pas[i][j]=pas[i-1][j]+pas[i-1][j-1];
                if(i==rowIndex) res.add(pas[i][j]);
            }
            
        }
        return res;
    }
}