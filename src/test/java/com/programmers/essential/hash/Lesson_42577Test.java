package com.programmers.essential.hash;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lesson_42577Test {

    @Test
    @DisplayName("validate solution method with test case")
    void testSolution(){
        // given
        Lesson_42577 lesson = new Lesson_42577();

        // when
        String[] phoneBook1 = {"119", "97674223", "1195524421"};
        String[] phoneBook2 = {"123","456","789"};
        String[] phoneBook3 = {"12","123","1235","567","88"};

        // then
        Assertions.assertThat(lesson.solution(phoneBook1)).isEqualTo(false);
        Assertions.assertThat(lesson.solution(phoneBook2)).isEqualTo(true);
        Assertions.assertThat(lesson.solution(phoneBook3)).isEqualTo(false);
    }

}