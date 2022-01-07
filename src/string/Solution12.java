package string;

import java.util.Scanner;

public class Solution12 {
    public static String run(){
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='#')sb.append(1);
            else{
                sb.append(0);
            }
        }
        for(int j=0;j<sb.length();j+=sb.length()/num){
            String substring = sb.substring(j, j + sb.length() / num);
            int i = Integer.parseInt(substring,2);
            answer.append((char) i);
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        System.out.println(Solution12.run());
    }
}
