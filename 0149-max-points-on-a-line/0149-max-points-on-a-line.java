class Solution {
    public int maxPoints(int[][] points) {
        int ans = 1;
        if(points.length <= 2) return points.length; 
        for(int i=0; i<points.length; i++){
            HashMap<Double, Integer> hm = new HashMap<>();
            
            for(int j=i+1; j<points.length; j++){
                Double slope = 0.0;
                if(points[j][0] - points[i][0] != 0.0){
                    if(points[j][1] - points[i][1] != 0) 
                        slope = (points[j][1] - points[i][1])*1.0/(points[j][0] - points[i][0]);
                }else slope = Double.MAX_VALUE;
                
                if(hm.containsKey(slope)){
                    hm.put(slope, hm.get(slope)+1);
                }else hm.put(slope, 2);
                
                ans = Math.max(hm.get(slope), ans);
                
            }
        }
        return ans;
    }
}