package com.programmers;
@FunctionalInterface
public interface SolutionTemplate<I, O> {
    O solution(I input);
}
