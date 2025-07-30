package codesnippet.seven;

public class Solution_1 {

    public int[] solution(long n) {
        // 1. 숫자를 문자열로 바꾼 뒤 뒤집기
        // 2. 뒤집은 문자열을 char stream으로 변환
        // 3. 각 문자를 숫자로 바꿔 int 배열로 반환
        return new StringBuilder(String.valueOf(n)).reverse()
                .toString()
                .chars()
                .map(i -> i - '0')
                .toArray();
    }

}