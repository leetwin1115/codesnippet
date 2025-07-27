package codesnippet.six;

import java.util.ArrayList;
import java.util.List;

public class Solution_1 {
    public List<Long> solution(int x, int n) {
        List<Long> answer = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            answer.add((long) x * i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.solution(2, 5));
        System.out.println(sol.solution(-4, 3));
    }
}

