package string;

import java.util.Scanner;

/* 대문자와 소문자가 같이 존재하는
   문자열을 입력받아 대문자는 소문자로
   소문자는 대문자로 변환하여 출력하는
   프로그램을 작성하세요.*/
public class Solution2 {
    public static String run(String sentence){
        char[] chars = sentence.toCharArray();
        for(int i=0;i<chars.length;i++){
            chars[i] = Character.isLowerCase(chars[i]) ? Character.toUpperCase(chars[i]) : Character.toLowerCase(chars[i]);
        }
        return String.valueOf(chars);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(Solution2.run(sentence));
    }
}
