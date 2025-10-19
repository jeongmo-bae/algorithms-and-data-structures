package com.programmers.essential.hash;

import com.programmers.SolutionTemplate;

import java.util.Arrays;

public class Lesson_42577 implements SolutionTemplate<String[], Boolean> {
    @Override
    public Boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        System.out.println("Arrays.toString(phone_book) = " + Arrays.toString(phone_book));

        for (int i = 0; i < phone_book.length-1; i++) {
            if(phone_book[i+1].startsWith(phone_book[i])) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
