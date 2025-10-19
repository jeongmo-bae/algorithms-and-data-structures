package com.programmers.essential.hash;

import com.programmers.SolutionTemplate;

import java.util.Arrays;
import java.util.HashMap;

public class Lesson_42578 implements SolutionTemplate<String[][], Integer> {

    @Override
    public Integer solution(String[][] clothes) {
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
    }
}
