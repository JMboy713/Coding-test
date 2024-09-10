import java.util.*;


class Solution {
    public int[] solution(int[] sequence, int k) {

        List<int[]> arr = new ArrayList<>();
        int len = sequence.length;


        int i = 0;
        int j = 0;
        int total = sequence[i];
        if(total==k){
            return new int[]{i,j};
        }
         while(i<len && j<len){
            if(sequence[i]>k){
                break;
            }

            if(total==k){
                arr.add(new int[]{i,j});
                if(j==len-1){
                    break;
                }
                j++;
                total+=sequence[j];
            }else if(total<k){
                if(j==len-1){
                    break;
                }
                j++;
                total+=sequence[j];
            }else if(total>k){
                if(i==len-1){
                    break;
                }
                total-=sequence[i];
                i++;
            }
        }

        /*

        len = 5

        00 1 -> 01
        01 3 -> 02
        02 6 -> 03
        03 10 -> 13
        13 9 -> 23
        23 7 -> 24 ( 23 추가)
        24 12 -> 34
        34 9 -> 44
        44 while 문 탈출




        */




        int[] answer = new int[2];
        // for(int[] list : arr){
        //     System.out.print(list[0]);
        //     System.out.println(list[1]);
        // }

        for(int[] list : arr){
            if(answer[0]==0 && answer[1]==0){
                answer[0]=list[0];
                answer[1]=list[1];
            }
            if(list[1]-list[0] < answer[1]-answer[0]){
                answer[0]=list[0];
                answer[1]=list[1];
            }else if(list[0]<answer[0]){
                answer[0]=list[0];
                answer[1]=list[1];
            }
        }



        return answer;
    }
}