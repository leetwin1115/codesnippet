package codesnippet_1.one;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 숫자를 입력하세요");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            int even = num / 2;
            System.out.println(even);
        } else {
            int odd = num / 2;
            System.out.println(odd);
        }
    scanner.close();
    }
}
