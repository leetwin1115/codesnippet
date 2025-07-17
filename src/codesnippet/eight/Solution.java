package codesnippet.eight;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("angle을 입력하세요");
        int angle = scanner.nextInt();

        int result = 0;

        if (angle < 90){
            result = 1;
            System.out.println("angle이"+angle+"이므로 예각입니다. 따라서 "+result+"을 return합니다.");
        } else if (angle == 90){
            result = 2;
            System.out.println("angle이"+angle+"이므로 직각입니다. 따라서 "+result+"을 return합니다.");
        } else if (angle < 90 || angle < 180){
            result = 3;
            System.out.println("angle이"+angle+"이므로 둔각입니다. 따라서 "+result+"을 return합니다.");
        } else if (angle == 180){
            result = 4;
            System.out.println("angle이"+angle+"이므로 평각입니다. 따라서 "+result+"을 return합니다.");
        } else {
            if (0 > angle || angle > 180){
                System.out.println("angle은 180도 각도까지 계산합니다.");
            }
        }
    }
}
