package codesnippet.ten;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("리스트에 넣을 정수 개수를 입력하세요 (1~999): ");
        int number = scanner.nextInt();

        if (0 >= number | number >= 1000){
            System.out.println("권장크기를 초과하는 원소입니다.");
            return;
        }

        System.out.println(number + "개의 정수를 입력하세요:");
        for (int i = 0; i < number; i++) {
            int value = scanner.nextInt();
            numbers.add(value);
        }

        double average = calculateAverage(numbers);
        System.out.println("numbers의 원소들의 평균 값은 " + average + "입니다.");
    }
    public static double calculateAverage(List<Integer> list) {
        if (list.isEmpty()) return 0.0;

        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }
}

