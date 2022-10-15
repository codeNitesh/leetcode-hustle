class Solution {
    public int countTime(String time) {
        int ans = 1;
        
        String[] arr = time.split(":");
        
        if(arr[0].charAt(0) == '?' && arr[0].charAt(1) == '?') ans = 24;
        else if(arr[0].charAt(0) == '?'){
            if(arr[0].charAt(1) <= '3') ans = 3;
            else ans = 2;
        }else if(arr[0].charAt(1) == '?'){
            if(arr[0].charAt(0) == '2') ans = 4;
            else ans = 10;
        }
        
        
        if(arr[1].charAt(0) == '?' && arr[1].charAt(1) == '?') ans = ans * 60;
        else if(arr[1].charAt(0) == '?'){
            ans = ans * 6;
        }else if(arr[1].charAt(1) == '?'){
            ans = ans * 10;
        }
        return ans;
    }
}