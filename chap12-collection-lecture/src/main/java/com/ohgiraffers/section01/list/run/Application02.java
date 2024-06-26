package main.java.com.ohgiraffers.section01.list.run;

import main.java.com.ohgiraffers.section01.list.comparator.AscendingPrice;
import main.java.com.ohgiraffers.section01.list.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Application02 {
    public static void main(String[] args) {

        // 책관리할 ArrayList 생성
        List<BookDTO> bookList = new ArrayList<>();

        bookList.add(new BookDTO(1, "홍길동전", "허균", 50000));
        bookList.add(new BookDTO(2, "목민심서", "정약용", 30000));
        bookList.add(new BookDTO(3, "동의보감", "허준", 40000));
        bookList.add(new BookDTO(4, "삼국사기", "김부식", 45000));
        bookList.add(new BookDTO(5, "삼국유사", "일연", 58000));

        // Collections.sort(bookList); - 오류

        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        // 가격오름차순 정리
        // 가격은 int 타입이라 compareTo로 못함. compareTo는 객체타입만 비교가능.
        System.out.println();
        System.out.println("---- 가격 오름차순 정렬 ----");
        bookList.sort(new AscendingPrice());
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }


        System.out.println("---- 책 제목 기준으로 오름차순 정렬 ----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

        System.out.println("---- 작가 기준으로 오름차순 정렬 -----");
        bookList.sort(new Comparator<BookDTO>() {
            @Override
            public int compare(BookDTO o1, BookDTO o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        for (BookDTO bookDTO : bookList) {
            System.out.println(bookDTO);
        }

    }
}
