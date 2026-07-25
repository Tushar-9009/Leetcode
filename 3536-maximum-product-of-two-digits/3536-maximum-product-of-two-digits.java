class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        while(n>0){
            int num=n%10;
            res.add(num);
            n/=10;
        }
        int max=0;
        for(int i=0;i<res.size()-1;i++){
            for(int j=i+1;j<res.size();j++){
                int out = res.get(i)*res.get(j);
                max=Math.max(out,max);
            }
        }
        return max;
    }
}