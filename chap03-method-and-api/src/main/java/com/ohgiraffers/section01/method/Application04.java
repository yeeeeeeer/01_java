package main.java.com.ohgiraffers.section01.method;

public class Application04 {
    public static void main(String[] args) {
        /*
         *  여러 개의 전달 인자를 이용한 메소드 호출 테스트
         * */

        Application04 app4 = new Application04();
        app4.testMethod("홍길동", 20, '남');
        // app4.testMethod(20, "유관순",'여');    // 매개변수의 순서대로 인자를 넣어줘야한다!

        // 변수에 저장된 값을 전달하여 호출할 수 있다.
        String name = "유관순";
        int age = 20;
        char gendar = '여';
        app4.testMethod(name, age, gendar);

    }

    /**
     * 이름과 나이와 성별을 전달받아 한 번에 출력해주는 기능을 제공
     *
     * @param name 출력할 이름을 전달 해주세요
     * @param age 출력할 나이를 전달 해주세요
     * @param gendar 출력할 성별을 전달 해주세요. 성별은 변경되지 않습니다.
     * */

    public void testMethod(String name, int age, final char gendar) {

        /*
        name = "홍길동";
        age =20;
        gendar ='s';
        */

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "세 이며, 성별은 " + gendar + "입니다.");
    }
}
