package com.programmers.essential.hash;

import java.util.HashSet;

public class Lessons_1845 {
    public int solution(int[] nums) {
        int answer = nums.length/2;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        // System.out.println(hashSet);
        // System.out.println(answer);
        if(hashSet.size() < answer){
            answer = hashSet.size();
        }
        // System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        Lessons_1845 lesson = new Lessons_1845();
        lesson.solution(new int[]{3,1,2,3});
        lesson.solution(new int[]{3,3,3,2,2,4});
        lesson.solution(new int[]{3,3,3,2,2,2});
    }
    
}
