package com.study.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 * JUnit5부터는 public을 붙여줄 필요 없음
 * */
class StudyTest {

    @Test
    void studyTest() {
        Study study = new Study();
        assertNotNull(study);
    }

    @Test
    @Disabled // 테스트 실행에서 제외할때
    void create1() {
        System.out.println("create1");
    }

    // @BeforeAll, @AfterAll은 static을 사용해야함
    // 모든 테스트 메서드 실행 전에 한 번만 실행됨
    @BeforeAll
    static void beforeAllSetUp() {
        System.out.println("before All");
    }

    // 모든 테스트 메서드 실행 후에 한 번만 실행됨
    @AfterAll
    static void afterAllSetUp() {
        System.out.println("after All");
    }

    // @BeforeEach, @AfterEach는 테스트 메서드 당 매번 실행됨
    @BeforeEach
    void BeforeEachSetUp() {
        System.out.println("before Each");
    }

    @AfterEach
    void AfterEachSetUp() {
        System.out.println("after Each");
    }




}