package codesnippet.four;
import java.util.Scanner;

public class Solution_1 {

        public static int solution(int n) {
            int sum = 0;

            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("정수를 입력하세요 (0 ~ 3000): ");
            int n = scanner.nextInt();

            if (n < 0 || n > 3000) {
                System.out.println("입력 범위를 초과했습니다.");
                return;
            }
            int result = solution(n);
            System.out.println(n + "의 약수의 합은: " + result);
        }
    }
