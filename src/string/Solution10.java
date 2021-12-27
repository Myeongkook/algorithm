package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
  한 개의 문자열 s와 문자 t가 주어지면 문자열 s의
  각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
 */

public class Solution10 {
    public static String run(){
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        char[] chars = split[0].toCharArray();
        List<Integer> position = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        for(int i=0;i< chars.length;i++){
            if(chars[i]==split[1].charAt(0)){
                position.add(i);
            }
        }
        for(int i=0;i< chars.length;i++){
            int tmp = 100;
            for (Integer integer : position) {
                if(Math.abs(integer-i)<tmp){
                    tmp = Math.abs(integer - i);
                }
            }
            answer.append(tmp).append(" ");
        }
        return answer.toString();
    }
    public static void main(String[]args){
        System.out.println(Solution10.run());
    }
}
