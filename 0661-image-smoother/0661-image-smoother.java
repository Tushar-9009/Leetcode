class Solution {
    public int[][] imageSmoother(int[][] img) {
        int n=img.length;
        int m=img[0].length;
        int ans=0;
        int[][] arr=new int[n][m];

        int[] dx={0,-1,-1,-1,0,+1,+1,+1,0};
        int[] dy={0,-1,0,+1,+1,+1,0,-1,-1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int count=0;
                int sum=0;
                for(int k=0;k<9;k++){
                    int ni=i+dx[k];
                    int nj=j+dy[k];
                    if(ni>=0 && ni<n && nj>=0 && nj<m){
                        count++;
                        sum+=img[ni][nj];
                        
                    }
                }
                ans=(sum/count);
                arr[i][j]=ans;
            }
        }
        return arr;
    }
}