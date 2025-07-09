package codesnippet.three;

public class Solution {
    public int solution(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(10, 5);
        System.out.println(result);  // 출력: 2
    }
}

