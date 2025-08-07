package com.programmers.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lessons_181916 {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int mapSize ;
        int[] items = new int[] {a,b,c,d};
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int item : items) {
            countMap.put(item, countMap.getOrDefault(item, 0) + 1);
        }
//        entrySet을 List로 변환
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(countMap.entrySet());
//        System.out.println(entryList.get(0).getKey());

//        value 기준으로 내림차순 하되, 같으면 key기준으로 오름차순
        entryList.sort((e1, e2) -> {
            int cmp = e2.getValue().compareTo(e1.getValue());
            if (cmp == 0) {
                return e2.getKey().compareTo(e1.getKey());
            }
            return cmp;
        });

        mapSize = countMap.size();
        if(mapSize == 1){
            answer = entryList.get(0).getKey() * 1111;
        }else if(mapSize == 2){
            int p = entryList.get(0).getKey();
            int q = entryList.get(1).getKey();
            if(entryList.get(0).getValue() == 3) {
                answer = (int) Math.pow((10 * p + q),2);
            }else{
                answer = (p + q) * Math.abs(p - q);
            }
        } else if (mapSize == 3) {
            answer = entryList.get(1).getKey() * entryList.get(2).getKey();
        } else {
            answer = entryList.get(3).getKey();
        }
        System.out.println("=========================");
        System.out.println(a + " , " + b + " , " + c + " , " + d);
        System.out.println(entryList);
        System.out.println(answer);
        return answer;
    }
}
