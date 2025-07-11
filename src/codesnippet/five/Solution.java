package codesnippet.five;

public class Solution {
    public int solution(int num1, int num2) {
        if (num1 == num2) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트 예제
        int result1 = sol.solution(2, 3); // 다르므로 -1
        int result2 = sol.solution(5, 5); // 같으므로 1

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
