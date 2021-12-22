package string;

import java.util.Scanner;

/*
  N개의 단어가 주어지면 각 단어를
  뒤집어 출력하는 프로그램을 작성하세요.
 */
public class Solution4 {
    public static void preprocess(){
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String [] request = new String[count];
        for(int i = 0;i<count;i++){
            String s = sc.nextLine();
            request[i] = s;
        }
        run(request);
    }

    public static void run(String[]request){
        for (String s : request) {
            char[] chars = s.toCharArray();
            for(int i=0; i<chars.length/2;i++){
                char tmp = chars[i];
                chars[i] = chars[chars.length - 1 - i];
                chars[chars.length - 1 - i] = tmp;
            }
            System.out.println(String.valueOf(chars));
        }
    }
    public static void main(String[]args){
        Solution4.preprocess();
    }
}
