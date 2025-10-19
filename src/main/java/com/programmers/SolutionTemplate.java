package com.programmers;
@FunctionalInterface
public interface SolutionTemplate<I, O> {
    public static void print(Object obj) {
        System.out.println(obj);
    };

    O solution(I input);
}
