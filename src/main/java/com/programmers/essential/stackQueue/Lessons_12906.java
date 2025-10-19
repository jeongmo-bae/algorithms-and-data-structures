package com.programmers.essential.stackQueue;

import java.util.ArrayList;
import java.util.Arrays;

public class Lessons_12906 {
    public static void main(String[] args) {
        Lessons_12906 sol = new Lessons_12906();
        System.out.println(Arrays.toString(sol.solution(new int[] {1,1,3,3,0,1,1})));
        System.out.println(Arrays.toString(sol.solution(new int[] {4,4,4,3,3})));    
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrayList = new ArrayList<>();  
        int beforeVal = arr[0];
        arrayList.add(beforeVal);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != beforeVal){
                beforeVal = arr[i];
                arrayList.add(arr[i]);
            }
        }
        answer = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            answer[i] = arrayList.get(i);
        }
        return answer;
    }
}



