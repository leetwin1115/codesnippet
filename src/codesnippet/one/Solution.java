package codesnippet.one;

import java.util.Scanner;

public class Solution {
    public static int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    // 테스트용 main 메서드
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 정수를 입력하세요:");
        int num1 = scanner.nextInt();
        System.out.println("두 번째 정수를 입력하세요:");
        int num2 = scanner.nextInt();

        int result = solution(num1, num2);
        System.out.println("num1이 "+num1+", num2가 "+num2+"이므로 "+num1+" * "+num2+" = "+result+"를 return합니다.");
    }
}

