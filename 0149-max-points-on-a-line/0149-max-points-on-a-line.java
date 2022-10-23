class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        if(points.length <= 2) return points.length; 
        for(int i=0; i<points.length; i++){
            for(int j=i+1; j<points.length; j++){
                int count = 0;
                for(int k=0; k<points.length; k++){
                    if((points[j][1]-points[i][1])*(points[k][0]-points[i][0]) ==
                      (points[k][1]-points[i][1])*(points[j][0]-points[i][0])) count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}