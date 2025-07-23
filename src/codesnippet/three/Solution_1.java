package codesnippet.three;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("n 숫자를 입력하세요: ");
        int n = scanner.nextInt();

        String numStr = String.valueOf(n);

        int answer = 0;

        for (int i=0; i<numStr.length(); i++){
            int sum = Character.getNumericValue(numStr.charAt(i));
            System.out.print(sum+" ");
            answer += sum;
        }

        if(n<10 && n>0){
            System.out.println("10보다 작으므로 한 자릿수"+answer+"를 return 하면 됩니다.");
        } else if (n<0){
            System.out.println("n이 0보다 작습니다. 다시 입력해주세요.");
        } else {
            System.out.println(answer+"이므로"+answer+"를 return 하면 됩니다.");
        }
    }
}
