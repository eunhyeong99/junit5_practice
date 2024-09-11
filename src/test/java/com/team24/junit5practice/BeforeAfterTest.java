package com.team24.junit5practice;

import org.junit.jupiter.api.*;

public class BeforeAfterTest {


    // 0순위 -- 한번만 실행된다.
    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기 전에 최초로 수행\n");
    }
    
    
    // 코드 실행 전
    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트 코드가 실행되기 전에 수행");
    }

    // 코드 실행 후
    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트 코드가 실행된 후에 수행\n");
    }
 
    // Test 코드들이 수행 된 후 맨 마지막에 수행
    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 수행된 후 마지막으로 수행\n");
    }

    @Test
    void test1(){
        System.out.println("테스트 코드 작성 1");
    }

    @Test
    void test2(){
        System.out.println("테스트 코드 작성 2");
    }
}
