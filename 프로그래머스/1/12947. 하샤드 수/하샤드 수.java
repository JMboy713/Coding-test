class Solution {
    public boolean solution(int x) {
        String str = ""+x;
        int div = 0;
        for(int i =0;i<str.length();i++){
            
            div+=Character.getNumericValue(str.charAt(i));
        }
        return x%div==0 ?true:false;
    }
}