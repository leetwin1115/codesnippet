package codesnippet.four;

public class Solution {
    public static int solution(int age) {
        int birthYear = 2025 - age + 1;
        return birthYear;
    }

    public static void main(String[] args) {
        int age = 40;
        int result = solution(age);
        System.out.println("태어난 해는: " + result);
    }
}

