package com.green.greengram3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exam1 { //클래스 전체 테스트 실행

    @Test
    @DisplayName("테스트1")
    public void test1() {             // 순서는 상관없이 독립적으로 실행함 오래걸리면 늦게 끝남
        System.out.println("test1");
        int sum = 2 + 2;
        Assertions.assertEquals(4,sum);  //이퀄 비교 가장 많이씀
    }
    @Test
    @DisplayName("테스트2")
    public void test2() {
        int multi = 2 * 3;
        Assertions.assertEquals(6,multi);
    }
    @Test
    @DisplayName("테스트3")
    public void test3() {
        Assertions.assertEquals(3, MyUtils.sum(1,2));
        Assertions.assertEquals(7, MyUtils.sum(5,2));
        Assertions.assertEquals(10, MyUtils.sum(1,9));
        Assertions.assertEquals(4, MyUtils.sum(1,3));
    }

    @Test
    @DisplayName("테스트4")
    public void test4() {
        MyUtils mu = new MyUtils();
        Assertions.assertEquals(3,mu.multi(1,3));
        Assertions.assertEquals(6,mu.multi(2,3));
        Assertions.assertEquals(12,mu.multi(2,6));
        Assertions.assertEquals(2,mu.multi(2,1));
    }


}
