class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        Double e11 = Double.valueOf(event1[0].replace(":", "."));
        Double e12 = Double.valueOf(event1[1].replace(":", "."));
        Double e21 = Double.valueOf(event2[0].replace(":", "."));
        Double e22 = Double.valueOf(event2[1].replace(":", "."));
        
        if((e11 <= e21 && e12 >= e21) 
            || (e21 <= e11 && e22 >= e11)) return true;

        return false;
    }
}