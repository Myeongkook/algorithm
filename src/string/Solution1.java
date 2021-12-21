package string;

import java.util.Scanner;

/*한 개의 문자열을 입력받고, 특정 문자를 입력받아
 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지
 알아내는 프로그램을 작성하세요.

 * 대소문자를 구분하지 않습니다.
 * 문자열의 길이는 100을 넘지 않습니다.
 */
public class Solution1 {

    public static int run(String sentence, char keyword){
        int answer = 0;
        char[] chars = sentence.toLowerCase().toCharArray();
        for (char i: chars){
         if(i==Character.toLowerCase(keyword)){
             answer++;
         }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        char keyword = sc.next().charAt(0);
        System.out.println(Solution1.run(sentence, keyword));
    }
}
