package com.programmers.essential.hash;

import java.util.HashMap;
import java.util.Map;

public class Lessons_42576 {
    public static void main(String[] args) {
        Lessons_42576 lesson = new Lessons_42576();
        String answer = lesson.solution(new String[]{"qowjdah","qowjdah","aa","ab"},new String[]{"qowjdah","aa","ab"});
        System.out.println(answer);
    }
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer> countMapOfCompletion = new HashMap<>();
        for ( String completor : completion){
            countMapOfCompletion.put(completor, countMapOfCompletion.getOrDefault(completor,0)+1);
        }
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            if (countMapOfCompletion.containsKey(key)){
                if(countMapOfCompletion.get(key) > 0){
                    countMapOfCompletion.put(key,countMapOfCompletion.get(key)-1);
                }else{
                    countMapOfCompletion.remove(key);
                    answer = key;
                }
            }else  {
                answer = key;
            }
        }
//        System.out.println(countMapOfCompletion);
//        System.out.println(answer);
        return answer;
    }
}
