package main.com.java.ohgiraffers.section01.polymoriphism;

public class Application01 {
    public static void main(String[] args) {

        /*
         * 다형성
         * 다형성이란 하나의 인스턴스가 여러 가지 타입을 가질 수 있다는 것을 의미한다.
         * 때문에 하나의 타입으로 여러 타입의 인스턴스를 처리할 수 있기도 하고,
         * 하나의 메소드 호출로 객체별로 각기 다른 방법으로 동작하게 될 수도 있다.
         *
         *
         * 다형성은 객체지향 프로그래밍의 3대 특징(캡슐화, 상속, 다형성) 중 하나이며,
         * 객체지향 프로그래밍의 꽃이라고 불리울 정도로 활용성이 높고, 장점이 많다.
         * 하지만 학습하기 어렵다는 단점을 가지고 있다.
         *
         * */

        /*
         * 다형성 장점
         *
         * 1. 여러 타입의 객체를 하나의 타입으로 관리할 수 있기 때문에 유지보수성과 생산성이 증가된다.
         * 2. 상속을 기반으로 한 기술이기 때문에 상속관계에 있는 모든 객체는 동일한 메세지를 수신할 수 있다.
         * 이런 동일한 메세지를 수신받아 처리하는 내용을 객체별로 다르게 할 수 있다는 장점을 가지고 있다.
         * (다양한 기능을 사용하는데 있어서 관리해야할 메세지 종류가 줄어들게 된다.)
         * 하나의 호출로 여러 가지 동작을 수행할 수 있다는 측면에서 오버로딩을 다형성으로 보기도 한다.
         * 다형성을 이해하기 쉬운 가장 좋은 예이기도 하다.
         * 하지만 이 부분은 이견이 많이 존재하기 때문에 다형성을 이해하는데 참고로만 활용하자.
         *
         * 3. 확장성이 좋은 코드를 작성할 수 있다.
         * 4. 결합도를 낮춰서 유지보수성을 증가시킬 수 있다.
         * */

        // Animal 인스턴스 생성 후 메소드 호출
        System.out.println("--------- Animal 생성 ---------");
        Animal animal = new Animal();
        animal.cry();
        animal.eat();
        animal.run();


        // Rabbit 인스턴스 생성 후 메소드 호출
        System.out.println("--------- Rabbit 생성 ---------");
        Rabbit rabbit = new Rabbit();
        rabbit.cry();
        rabbit.eat();
        rabbit.run();

        // Tiger 인스턴스 생성 후 메소드 호출
        System.out.println("--------- Tiger 생성 ---------");
        Tiger tiger = new Tiger();
        tiger.cry();
        tiger.eat();
        tiger.run();

        // 부모타입으로 자식 인스턴스 주소값 저장 - Animal(부모타입 자료형) animal1
        // -> 부모에 있는 메소드만 사용가능하다.(자식메소드에만 있는것은 못함.)
        Animal animal1 = new Rabbit();
        Animal animal2 = new Tiger();

        // 동적 바인딩 확인해보기
        System.out.println("--------- 동적 바인딩 ---------");
        animal1.cry();
        animal2.cry();

        System.out.println("-------- 클래스 타입의 형변환 확인 ---------");
        ((Rabbit) animal1).jump();
        // animal1.jump();  <- animal1의 자료형이 Animal임 / 부모에 있는 메소드만 사용가능하다.(자식메소드에만 있는것은 못함.)
        ((Tiger) animal2).bite();

        // instanceof 연산자 사용해보기
        System.out.println("-------- instanceof 확인 ---------");
        System.out.println("animal 이 Tiger 와 같은지 " + (animal1 instanceof Tiger));
        System.out.println("animal 이 Rabbit 와 같은지 " + (animal1 instanceof Rabbit));
        System.out.println("animal 이 Animal 와 같은지 " + (animal1 instanceof Animal));
        System.out.println("anima2 이 Rabbit 와 같은지 " + (animal2 instanceof Rabbit));
        System.out.println("anima2 이 Tiger 와 같은지 " + (animal2 instanceof Tiger));

        // 타입이 맞는것만 형변환시키기위한 if문
        if(animal1 instanceof Rabbit){
            ((Rabbit) animal1).jump();
        }

        // 묵시적 형변환
        Animal animal3 = new Rabbit();
        Animal animal4 = (Animal) new Rabbit();   // 업캐스팅
        Rabbit rabbit1 = (Rabbit) new Animal();   // 다운캐스팅
    }
}