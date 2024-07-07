import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        while(progresses.length!=0){
            int count=0;
            if(progresses[0]>=100){
                while(progresses[0]>=100){
                    progresses=pop(progresses);
                    speeds=pop(speeds);
                    count+=1;
                    if(progresses.length==0){
                        break;
                    }
                }
                answer.add(count);
            }
            
            if(progresses.length==0){
                break;
            }
            for(int i=0;i<progresses.length;i++){
                progresses[i]+=speeds[i];
            }
        }
        int[] intArray = convertArrayListToIntArray(answer);

        return intArray;
    }
    public int[] pop(int[] arr){
        ArrayDeque<Integer> newarr = new ArrayDeque<>();
        for(int i:arr){
            newarr.add(i);
        }
        newarr.pollFirst();
        int[] array = new int[newarr.size()];
        int count=0;
        for(int i:newarr){
            array[count]=i;
            count++;
        }
        return array;
    }
    public static int[] convertArrayListToIntArray(ArrayList<Integer> arrayList) {
        int[] intArray = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            intArray[i] = arrayList.get(i);
        }
        return intArray;
    }
}