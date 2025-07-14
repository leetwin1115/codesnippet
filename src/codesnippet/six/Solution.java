package codesnippet.six;

public class Solution {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트
        int result = sol.solution(2, 3); // 결과는 5
        System.out.println("결과: " + result);
    }
}