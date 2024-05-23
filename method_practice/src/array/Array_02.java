package array;

import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {

        // 상품관리 프로그램
        /*
         * 기능
         * 1. 상품 등록 - 상품 이름, 가격 입력받아 저장
         * 2. 상품 목록 - 등록한 모든 상품의 목록 출력
         *
         * 동작
         * 0. 사용자에게 세 가지 선택 제시 - 1. 상품등록 2. 상품목록 3. 종료
         * 1. 상품 등록 - 사용자에게 상품 이름, 가격 입력받아 배열에 저장 (10개까지 제한)
         * 2. 상품 목록 - 배열에 저장된 모든 상품 출력
         * 3. 종료 - 프로그램 종료
         *
         * */

        // 사용자 입력받는 Scanner scanner
        Scanner scanner = new Scanner(System.in);

        // 선택 제시
        while (true) {
            System.out.println("1. 상품등록 / 2. 상품목록 / 3. 종료");
            System.out.println("메뉴 선택: ");
            int choice = scanner.nextInt();

            // 선택 시 해당한 기능 실행
            switch (choice) {
                case 1:
                    // 사용자에게 상품 이름, 가격 입력받고 - 배열 저장
                    String[] productNames = new String[10];
                    int[] productPrices = new int[10];
                    System.out.println("상품 이름 입력: ");
                    for (int i = 0; i < productNames.length; i++) {
                        productNames[i] = scanner.next();

                        System.out.println("상품 가격 입력: ");
                        for (int j = 0; j < productPrices.length; j++) {
                            productPrices[j] = scanner.nextInt();
                        }
                    }

                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    break;

                case 2:
                    // 배열 저장된 모든 상품 출력


            }


        }
        // 상품 이름 저장 배열 String[] productNames
//        String[]

        // 상품 가격 저장 배열 int[] productPrices


        // 등록된 상품 갯수 저장 변수 int productCount


    }
}
