package com.programmers.essential.hash;

import com.programmers.SolutionTemplate;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

class Lesson_42578Test {
    @Test
    @DisplayName("Use Impl - validate solution method with test case")
    void testSolution() {
        // given
        Lesson_42578 lesson = new Lesson_42578();

        // when
        String[][] clothes1 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        String[][] clothes2 = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        // then
        Assertions.assertThat(lesson.solution(clothes1)).isEqualTo(5);
        Assertions.assertThat(lesson.solution(clothes2)).isEqualTo(3);
    }

    @Test
    @DisplayName("Use Lambda - validate solution method with test case")
    void testSolutionUseLambdaExpression() {
        // given
        SolutionTemplate<String[][], Integer> solver = clothes -> {
            int answer = 1;
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (String[] cloth : clothes) {
                if (hashMap.containsKey(cloth[1])) {
                    hashMap.put(cloth[1], hashMap.get(cloth[1]) + 1);
                } else {
                    hashMap.put(cloth[1], 1);
                }
            }
            for(Integer count : hashMap.values()){
                answer *= (count +1);
            }
            SolutionTemplate.print("clothes = " + Arrays.deepToString(clothes));
            SolutionTemplate.print("answer = " + (answer-1));
            return answer-1;
        };

        // when
        String[][] clothes1 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };
        String[][] clothes2 = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };
        // then
        Assertions.assertThat(solver.solution(clothes1)).isEqualTo(5);
        Assertions.assertThat(solver.solution(clothes2)).isEqualTo(3);
    }
}