package codesnippet.nine;

public class Solution_1 {
    public long solution(long n) {
        // 제곱근이 정수인지 확인한 후 (x+1)^2 반환, 아니면 -1 반환
        return (Math.sqrt(n) % 1 == 0) ?
                (long) Math.pow(Math.sqrt(n) + 1, 2) : -1L;
    }
}
