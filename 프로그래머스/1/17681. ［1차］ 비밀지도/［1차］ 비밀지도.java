class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map1 = map(n,arr1);
        String[] map2 = map(n,arr2);
        
        String[] answer = new String[n];
        
        int count=0;
        
        for(int i=0;i<n;i++){
            String ans ="";
            for(int j=0;j<n;j++){
                if(map1[i].charAt(j)=='#' || map2[i].charAt(j)=='#'){
                    ans+="#";
                }else{
                    ans+=" ";
                }
            }
            answer[count]=ans;
            count++;
        }
        return answer;
        
    }
    
    public static String[] map(int n,int[] arr){
        String[] newMap = new String[n];
        int count=0;
        for(int i : arr){
            String dec = Integer.toBinaryString(i);
            while(dec.length()!=n){
                dec=" "+dec;
            }
            String plus ="";
            for(int j=0;j<dec.length();j++){
                if(dec.charAt(j)=='1'){
                    plus+="#";
                }else{
                    plus+=" ";
                }
            }
            newMap[count]=plus;
            count+=1;
        }
 
        return newMap;
    }
}
