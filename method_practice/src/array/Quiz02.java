package array;

import java.util.Scanner;

public class Quiz02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 배열 선언
        int[] nums = new int[5];

        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }


    }
}
