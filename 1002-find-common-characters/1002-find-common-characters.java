class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        for(int i=0; i<words[0].length(); i++){
            if(hm.containsKey(words[0].charAt(i))){
                hm.put(words[0].charAt(i), hm.get(words[0].charAt(i))+1);
            }else hm.put(words[0].charAt(i), 1);
        }
        
        HashMap<Character, Integer> temp = new HashMap<>();
        
        for(int i=1; i<words.length; i++){
            temp.clear();
            String s = words[i];
            
            for(int j=0; j<s.length(); j++){
                if(temp.containsKey(s.charAt(j))){
                    temp.put(s.charAt(j), temp.get(s.charAt(j))+1);
                }else temp.put(s.charAt(j), 1);
            }
            
            for(Character ch : hm.keySet()){
                if(temp.containsKey(ch)){
                    hm.put(ch, Math.min(temp.get(ch), hm.get(ch)));
                }else hm.put(ch, 0);
            }
        }
        List<String> ans = new ArrayList<>();
        
        for(Character ch: hm.keySet()){
            if(hm.get(ch) > 0){
                int i = hm.get(ch);
                while(i-- > 0)
                    ans.add(ch+"");
            }
        }
        return ans;
    }
}