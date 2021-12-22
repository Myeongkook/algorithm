package string;
import java.util.Scanner;

/*
  영어 알파벳과 특수문자로 구성된 문자열이
  주어지면 영어 알파벳만 뒤집고, 특수문자는
  자기 자리에 그대로 있는 문자열을 만들어
  출력하는 프로그램을 작성하세요.
 */
public class Solution5 {
    public static void run(String sentence){
        char[] chars = sentence.toCharArray();
        for(int i=0; i<chars.length/2;i++){
            if(Character.isAlphabetic(chars[i])){
                char tmp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = tmp;
            }
        }
        System.out.println(String.valueOf(chars));
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        Solution5.run(sentence);
    }
}
