package string;

import java.util.Scanner;

/*
  한 개의 문장이 주어지면 그 문장 속에서
  가장 긴 단어를 출력하는 프로그램을 작성하세요.
  문장속의 각 단어는 공백으로 구분됩니다.
 */
public class Solution3 {
    public static String run(String sentence){
        String answer = "";
        for(String s : sentence.split(" ")){
            if(answer.length() < s.length()){
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(Solution3.run(sentence));
    }
}
