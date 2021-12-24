package string;

import java.util.Scanner;

public class Solution9 {
    public static int run(){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        char[] chars = word.toCharArray();
        for (char a : chars) {
            if(Character.isDigit(a)){
                sb.append(a);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String[]args){
        System.out.println(Solution9.run());
    }
}
