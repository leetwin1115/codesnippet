package codesnippet.nine;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n을 입력하세요: ");
        int n = scanner.nextInt();

        int sum = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= n; i += 2) {
            sum += i;
            sb.append(i);
            if (i + 2 <= n) {
                sb.append(" + ");
            }
        }

        sb.append(" = ").append(sum);

        System.out.println(sb.toString());
    }
}
