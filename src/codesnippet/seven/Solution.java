package codesnippet.seven;

public class Solution {
    public int solution(int num1, int num2) {
        double result = ((double) num1 / num2) * 1000;
        return (int) result;
    }

    // 테스트용 메인
    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트 예시: 3 / 2 = 1.5 → 1.5 * 1000 = 1500
        int result = sol.solution(3, 2);
        System.out.println("결과: " + result);  // 출력: 1500
    }
}
