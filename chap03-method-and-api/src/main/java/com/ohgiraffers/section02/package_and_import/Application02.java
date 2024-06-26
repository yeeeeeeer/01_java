package main.java.com.ohgiraffers.section02.package_and_import;

import main.java.com.ohgiraffers.section01.method.Calculator;

import static main.java.com.ohgiraffers.section01.method.Calculator.maxNumber0f;

public class Application02 {
    public static void main(String[] args) {

        /*
         * 임포트
         * 서로 다른 패키지에서 존재하는 클래스를 사용하는 경우, 패키지 명을 포함한 풀 클래스 이름을 사용해야 한다.
         * 하지만 매번 다른 클래스의 패키지명까지 기술하기는 번거롭다.
         * 그래서 패키지명을 생략(클래스명도 생략가능)하고 사용할 수 있도록 한 구문이 import 구문이다.
         */

        // 다른 패키지의 클래스이름쓰고 엔터치면 import 구문이 자동추가됨. -> import 구문 경로확인하기
        // 풀 클래스네임 안써도 됨.
        Calculator calc = new Calculator();
        int min = calc.minNumber0f(50, 60);
        System.out.println(min);

        int max = maxNumber0f(50, 60);
        System.out.println(max);

        int max2 = maxNumber0f(100, 200);
        System.out.println(max2);
    }
}
