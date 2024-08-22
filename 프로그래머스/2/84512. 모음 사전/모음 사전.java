import java.util.*;

class Solution {
    
    // 모든 가능한 단어를 저장할 리스트
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        // DFS를 사용해 모든 가능한 단어를 생성
        dfs("");
        // 주어진 단어의 인덱스를 반환 (순서 계산)
        return list.indexOf(word);
    }
    
    // DFS를 통해 재귀적으로 단어를 생성하는 메소드
    public static void dfs(String s) {
        // 단어 길이가 5보다 크면 종료
        if (s.length() > 5) {
            return;
        }
        // 생성된 단어를 리스트에 추가
        list.add(s);
        // 각 모음(AEIOU)을 붙여 새로운 단어를 생성하고 재귀 호출
        for (int i = 0; i < 5; i++) {
            dfs(s + "AEIOU".charAt(i));
        }
    }
}