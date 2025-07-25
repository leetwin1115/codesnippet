package codesnippet.five;

import java.util.Scanner;

public class Solution_1 {
    public int solution1(int n) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자연수를 입력해주세요: ");
        int answer = scanner.nextInt();

        for (int i = 2; i < n; i++) {
            if (n % 1 == 1) {
                answer = i;
                break;
            }
        }
        return answer;

        //System.out.println(n + "을 " + x + "로 나눈 나머지가 " + answer + "이고, " + x + "보다 작은 자연수 중에서 문제의 조건을 만족하는 수가 없으므로, " + x + "를 return 해야합니다.");
    }
}
