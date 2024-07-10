import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] list = s.split("}");
        ArrayList<List<Integer>> numberlist = new ArrayList<>();// 원소를 나열할 리스트
        
        for(String a : list){
            String newa = a.replaceAll("\\{","");
            String[] numlist = newa.split(",");
            
            ArrayList<Integer>  number = new ArrayList<>();
            for(String b : numlist){
                try{
                    number.add(Integer.parseInt(b));
                }catch(Exception e){
                    continue;
                }
            }
            numberlist.add(number);
        }
        
         
        Collections.sort(numberlist, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> list1, List<Integer> list2) {
                return Integer.compare(list1.size(), list2.size());
            }
        });
        
        int count=1;
        ArrayList<Integer> validate = new ArrayList<>();
        
        
        for(List<Integer> array : numberlist){
            // System.out.println(array);
            if(array.size()==count){
                for(int a : array){
                    if(!validate.contains(a)){
                        validate.add(a);
                    }
                }
                count++;
            }
        }
        // System.out.println(validate);
        int[] answer = validate.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}