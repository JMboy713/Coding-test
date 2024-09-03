// 숫자의 길이가 같다면 -> 비교
// 숫자의 길이가 다르다면 -> 자리수로 비교.( 더 짧은걸로)
// 더 짧은것까지의 길이까지 같다면 -> 짧은게 먼저
// 더 긴게 후순위
import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            arr[i]=numbers[i]+"";
        }
        
        Comparator<String> customComparator = new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                while(true){
                    if(s1.length()==s2.length()){
                        return s2.compareTo(s1);// 길이가 같다면 비교
                    }
                    if(s1.length()<s2.length()){// s1이 더 짧을때
                        for(int i=0;i<s1.length();i++){
                            if(s1.charAt(i)!=s2.charAt(i)){
                                return s2.substring(i,i+1).compareTo(s1.substring(i,i+1));
                            }
                        }
                        // 만약 모든 자리가 똑같다면 짧은게 오게 한다.
                        s2 = s2.substring(s1.length());
                        
                    }else if(s1.length()>s2.length()){
                        for(int i=0;i<s2.length();i++){
                            if(s1.charAt(i)!=s2.charAt(i)){
                                return s2.substring(i,i+1).compareTo(s1.substring(i,i+1));
                            }
                        }
                        // 만약 모든 자리가 똑같다면 
                        s1 = s1.substring(s2.length());
                    }
                }
            }
        };
        Arrays.sort(arr,customComparator);
        StringBuilder sb = new StringBuilder();
        for(String a : arr){
            sb.append(a);
        }
        return arr[0].equals("0") ? "0" :String.valueOf(sb);
    }
}