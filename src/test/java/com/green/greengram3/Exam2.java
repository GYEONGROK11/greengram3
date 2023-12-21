package com.green.greengram3;

import org.junit.jupiter.api.*;


public class Exam2 {

    @BeforeAll
    public static void beforAll() {  // 모든 test 전 한번 실행 스태틱
        System.out.println("beforAll");
    }

    @AfterAll
    public static void afterAll() {  // 모든 test 후 한번 실행 스태틱
        System.out.println("afterAll");
    }

    @BeforeEach
    public void beforeEach() {  //각 test 전 각각 실행
        System.out.println("--beforeEach");
    }
    @AfterEach
    public void afterEach() {  //각 test 후 각각 실행
        System.out.println("--afterEach");
    }
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }
}
