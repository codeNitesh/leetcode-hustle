class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> arr = new ArrayList<>();
        
        int i = 1;
        int sum = 0;
        int MOD = (int) 1e9 + 7;
        
        while(sum != n){
            int temp = n^(n-i);
            if(temp == i){
                arr.add(i);
                sum = (sum + i)%MOD;
            }
            i = (i + i)%MOD;
        }
        
        int[] ans = new int[queries.length];
        for(int k=0; k<queries.length; k++){
            int[] q = queries[k];
            long t = 1; 
            for(i=q[0]; i<=q[1]; i++){
                t = (t * arr.get(i))%MOD;
            }
            ans[k] = (int) t;
        }

        System.out.println(arr);
        return ans;
    }
}