package codesnippet.two;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 숫자를 입력하시겠습니까? (1~100): ");
        int size = scanner.nextInt();

        if (size <= 1 || size >= 100) {
            System.out.println("잘못된 숫자 입력입니다.");
        }

        double[] arr = new double[100];
        double sum = 0.0;

        for (int i=0; i<size; i++) {
            System.out.println("숫자를 입력하세요");
            arr[i] = scanner.nextDouble();
                sum += arr[i];
        }

        double average = sum / size;

        for (int i=0; i<size; i++) {
            System.out.println("입력값"+arr[i]+"평균값"+average);
        }
    }
}
