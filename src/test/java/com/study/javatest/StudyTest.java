package com.study.javatest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
/**
 * JUnit5부터는 public을 붙여줄 필요 없음
 * */
// 클래스에 적용하면 전체 테스트 이름을 어떤 전략으로 보여줄지 정함
@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {

    @Test
    @DisplayName("스터디 객체 생성 테스트")
    void study_test() {
        Study study = new Study();
        assertNotNull(study);
        assertEquals(StudyStatus.DRAFT, study.getStatus());
    }

    @Test
    @Disabled // 테스트 실행에서 제외할때
    void create1_test() {
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