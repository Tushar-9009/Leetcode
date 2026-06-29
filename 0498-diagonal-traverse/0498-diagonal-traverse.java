class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[] arr=new int[n*m];
        int k=0;
        int i=0;
        int j=0;

        while( i<n && j<m && k<=((m*n)-1)){
            arr[k]=mat[i][j];
            k++;
            if((i+j)%2==1){
                if(j==0 && i<=n-2) i++;
                else if(i==n-1 ) j++;
                else{
                    i++;
                    j--;
                }
            }else{
                if(i==0 && j<=m-2) j++;
                else if(j==m-1 ) i++;
                else{
                    i--;
                    j++;
                }
            }
        }
        return arr;
    }
}