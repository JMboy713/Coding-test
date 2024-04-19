 import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();  // 입력받은 문자열 저장
        StringBuilder result = new StringBuilder();  // 출력할 결과를 저장할 StringBuilder 객체 생성
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);  // 현재 문자를 저장
            if (Character.isUpperCase(currentChar)) {
                // 대문자인 경우 소문자로 변환 후 StringBuilder에 추가
                result.append(Character.toLowerCase(currentChar));
            } else {
                // 소문자 또는 그 외의 문자는 그대로 StringBuilder에 추가
                result.append(Character.toUpperCase(currentChar));
            }
        }

        System.out.println(result.toString());  // 최종 변환된 문자열 출력
    }
}
