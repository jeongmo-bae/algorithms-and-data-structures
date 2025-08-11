package com.programmers.essential.heap;

import java.util.ArrayList;
import java.util.Collections;

public class Lessons_42626 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        ArrayList<Integer> arrayListScoville = new ArrayList<>();
        for ( Integer scov : scoville) {
            arrayListScoville.add(scov);
        }
        while (arrayListScoville.size() > 1){
            answer += 1;
            Collections.sort(arrayListScoville);
            Integer first = arrayListScoville.remove(0);
            Integer second = arrayListScoville.remove(0);
            Integer nextScovil = first + 2*second ;
            arrayListScoville.add(0,nextScovil);
            boolean allUpperThanK = true;
            for (Integer scov : arrayListScoville) {
                if (scov < K){
                    allUpperThanK = false;
                    break;
                }
            }
            if (allUpperThanK){
                break;
            }
        }
        //섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
        return answer;
    }
}
