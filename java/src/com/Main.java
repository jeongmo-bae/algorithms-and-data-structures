package com;

import com.programmers.basic.Lessons_181916;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Lessons_181916 lesson = new Lessons_181916();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            lesson.solution(random.nextInt(6)+1,random.nextInt(6)+1,random.nextInt(6)+1,random.nextInt(6)+1);
        }
    }
}
