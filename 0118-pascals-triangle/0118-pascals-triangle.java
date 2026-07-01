class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int[][] pas=new int[n][n];
        List<List<Integer>> res=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0) pas[i][j]=1;
                else if(i==j) pas[i][j]=1;
                else pas[i][j]=pas[i-1][j]+pas[i-1][j-1];
                row.add(pas[i][j]);
            }
            res.add(row);
        }
        return res;
    }
}