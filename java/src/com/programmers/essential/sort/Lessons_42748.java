package com.programmers.essential.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lessons_42748 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            answer[i] = preprocess(array,commands[i]).get(commands[i][2]-1);
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    public static ArrayList<Integer> preprocess(int[] array, int[] command){
        ArrayList<Integer> preprocessedArray =  new ArrayList<>();
        for (int i = command[0]-1; i < command[1]; i++) {
            preprocessedArray.add(array[i]);
        }
        Collections.sort(preprocessedArray);
        return preprocessedArray;
    }
    public static void main(String[] args) {
        Lessons_42748 sol = new Lessons_42748();
        sol.solution(new int[]{1,5,2,6,3,7,4},new int[][]{{2,5,3},{4,4,1},{1,7,3}});
    }
}
