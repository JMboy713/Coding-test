class Solution {
    boolean solution(String s) {
        
        int cp = CountP(s);
        int cy = County(s);
        if(cp==cy){
            return true;
        }

        return false;
    }
    
    public int CountP(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            char ind = s.charAt(i);
            if(ind==('P') || ind==('p')){
                count+=1;
            }
        }
        return count;
    }

    public int County(String s){
        int count=0;
        String upper = s.toUpperCase();
        for(int i=0;i<upper.length();i++){
            char ind= upper.charAt(i);
            if(ind==('Y')){
                count+=1;
            }
        }
        return count;
    }
}