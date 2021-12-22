package string;

import java.util.*;

/*
  소문자로 된 한개의 문자열이 입력되면
  중복된 문자를 제거하고 출력하는 프로그램을 작성하세요.
  제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
 */
public class Solution6 {
    public static void run(String sentence){
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : sentence.toCharArray()) {
            boolean FLAG = false;
            for (Character b : characters) {
                if(c==b){
                    FLAG = true;
                    break;
                }
            }
            if(!FLAG)characters.add(c);
        }
        printCharacter(characters);
    }

    public static void printCharacter(ArrayList<Character> answer){
        StringBuffer sb = new StringBuffer();
        for (Character a : answer) {
            sb.append(a);
        }
        System.out.println(sb);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Solution6.run(sentence);
    }
}
