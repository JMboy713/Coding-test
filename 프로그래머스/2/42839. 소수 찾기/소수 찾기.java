import java.util.*;

class Solution {
    static Set<Integer> uniqueNumbers = new HashSet<>();
    
    public int solution(String numbers) {
        String[] list = numbers.split("");
        boolean[] visited = new boolean[list.length];
        
        // 숫자의 순열을 찾고, 순열을 통해 나오는 모든 숫자를 uniqueNumbers에 추가
        for (int i = 0; i < list.length; i++) {
            find(visited, "", list);
        }
        
        int answer = 0;
        
        // uniqueNumbers에 있는 숫자 중에서 소수를 찾아 합산
        for (int num : uniqueNumbers) {
            answer += isPrime(num);
        }
        
        return answer;
    }
    
    public void find(boolean[] visited, String currentNum, String[] list) {
        if (!currentNum.isEmpty()) {
            uniqueNumbers.add(Integer.parseInt(currentNum)); // 숫자를 Set에 추가
        }
        
        for (int i = 0; i < list.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                find(visited, currentNum + list[i], list); // 순열 생성
                visited[i] = false; // 재귀가 끝난 후 다시 방문 여부를 초기화
            }
        }
    }
    
    public static int isPrime(int num) {        
        if (num < 2) {
            return 0;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
