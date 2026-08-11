class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int  m=mat.length;
        int n=mat[0].length;

        List<Integer> ans = new ArrayList<>();

        int a=m;
        int b=n;
        int row[] =new int[a];
        int col[] =new int[b];

        for(int i=0;i<m;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
            }
            row[i]=min;
        }

        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<m;j++){
                if(mat[j][i]>max){
                    max=mat[j][i];
                }
            }
            col[i]=max;
        }

        Arrays.sort(row);
        Arrays.sort(col);

        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(row[i]==col[j]){
                    ans.add(row[i]);
                }
            }
        }
        return ans;
    }
}