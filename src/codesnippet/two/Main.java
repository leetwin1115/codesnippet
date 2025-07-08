package codesnippet.two;

import java.util.Scanner;

public class Main {

    // solution 함수: 두 수의 차를 계산
    public static int solution(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력
        System.out.print("num1을 입력하세요 (-50000 ~ 50000): ");
        int num1 = scanner.nextInt();

        System.out.print("num2를 입력하세요 (-50000 ~ 50000): ");
        int num2 = scanner.nextInt();

        // 입력값 검증
        if (num1 < -50000 || num1 > 50000 || num2 < -50000 || num2 > 50000) {
            System.out.println("입력값이 제한 범위를 벗어났습니다.");
            return;
        }

        // 결과 계산 및 출력
        int result = solution(num1, num2);
        System.out.println("num1이 "+num1+"이고 num2가"+num2+"이므로 "+num1+"-"+num2+"="+result+"을 return합니다.");
    }
}