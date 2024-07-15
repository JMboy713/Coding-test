// 교집합 -> 비교 -> 없다면 1로 정의
// 합집합 -> 비교후 같다면 둘중 하나를 넣는 식으로. 
import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        
        int answer = 0;
        ArrayList<String> dummy = multipleSet(str1);
        ArrayList<String> array1 = multipleSet(str1);
        ArrayList<String> array2 = multipleSet(str2);
        int intersect = 0;
        int union = 0;
        
        if(array1.size()==0 & array2.size()==0){
            return 65536;
        }
        for(String str : dummy){
            if(array2.contains(str)){
                intersect++;
                array2.remove(str);
                array1.remove(str);
            }
        }

        union=array1.size()+array2.size()+intersect;
        
        return union==0 ? 0 :(int) (((double)intersect / (double)union) *65536);
    }
    
    
    public ArrayList<String> multipleSet(String str){
        str = str.toLowerCase();
        ArrayList<String> arr = new ArrayList<>();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' && str.charAt(i+1)>='a' && str.charAt(i+1)<='z'){
                arr.add(str.charAt(i)+""+str.charAt(i+1));
            }
        }
        return arr;
    }
}