package array;

import java.util.Scanner;

public class Quiz02_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("5개의정수를 입력하세요");

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =sc.nextInt();
        }

        System.out.println("출력");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        if(i < arr.length-1){
            System.out.print(", ");
        }
        }

    }
}
