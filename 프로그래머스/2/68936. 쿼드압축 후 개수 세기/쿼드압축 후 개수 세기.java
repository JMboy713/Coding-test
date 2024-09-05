class Solution {
    static int zero = 0;
    static int one = 0;
    public int[] solution(int[][] arr) {
        sol(arr);
        int[] answer = new int[]{zero,one};        
        return answer;
    }
    
    public void sol(int[][]arr){
        if(isSame(arr)){
            if(arr[0][0]==1){
                one++;
            }else{
                zero++;
            }
        }else{
            int len = arr.length/2;
            int[][] arr1 = new int[len][len];
            int[][] arr2 = new int[len][len];
            int[][] arr3 = new int[len][len];
            int[][] arr4 = new int[len][len];
            
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(i<len && j<len){
                        arr1[i][j]=arr[i][j];
                    }else if(i<len && j>=len){
                        arr2[i][j-len]=arr[i][j];
                    }else if(i>=len && j>=len){
                        arr4[i-len][j-len]=arr[i][j];
                    }else{
                        arr3[i-len][j]=arr[i][j];
                    }
                }
            }
            // System.out.println(arr1);
            // System.out.println(arr2);
            // System.out.println(arr3);
            // System.out.println(arr4);
            
            sol(arr1);
            sol(arr2);
            sol(arr3);
            sol(arr4);
        }
    } 
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean isSame(int[][] arr){
        boolean same = true;
        if(arr[0][0]==1){
            for(int[] line : arr){
                for(int a : line){
                    if (a!=1){
                        same = false;
                    }
                }
            }    
        }else{
            for(int[] line : arr){
                for(int a : line){
                    if (a!=0){
                        same = false;
                    }
                }
            }    
        }
        return same;
    }
}