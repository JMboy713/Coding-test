class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
	      for(int i=0; i<arr1.length;i++){ // 0 1
					for(int j=0;j<arr1[0].length;j++){ // 0 1
						answer[i][j]=arr1[i][j]+arr2[i][j];
					}
	      }
        return answer;
    }
}