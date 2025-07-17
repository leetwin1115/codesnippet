package codesnippet.three;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = scanner.nextInt();

        System.out.println("두번째 숫자를 입력하세요");
        int num2 = scanner.nextInt();

        if (0> num1 | num1 >= 100 | 0 > num2 | num2 >= 100){
            System.out.println("제한사항을 벗어납니다.");
        }
        int result = num1 / num2;
        System.out.println("num1이"+num1+"num2가"+num2+"이므로 "+num1+"을"+num2+"로 나눈 몫"+result+"를 return합니다.");
    }
}
