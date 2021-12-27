package string;

import java.util.Scanner;

/*
  알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가
  연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를
  표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
  단 반복횟수가 1인 경우 생략합니다.
 */
public class Solution11 {

    public static String run(){
        Scanner sc = new Scanner(System.in);
        String request = sc.nextLine().toUpperCase();
        char[] chars = request.toCharArray();
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            int counter = 1;
            for(int j=i+1;j<chars.length-1;j++){
                if(chars[i]!=chars[j]){
                    break;
                }else {
                    counter++;
                }
            }
            if(counter>1){
                System.out.println(counter);
            }

        }
        return "";
    }
    public static void main(String[]args){
        Solution11.run();
    }
}
