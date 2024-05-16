//System.out.println();
class Solution {
    public int[] solution(long n) {
        String str = ""+n;

        int[] arr = new int[str.length()];
        int count =0;
        while(n!=0){
            System.out.println((int)(n%10));

            arr[count]=(int)(n%10);
            n=n/10;
            count+=1;
        }
        return arr;
    }
}