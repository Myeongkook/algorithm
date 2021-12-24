package string;

import java.util.Scanner;

public class Solution8 {
    public static String run() {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char a : chars) {
            if(Character.isAlphabetic(a))sb.append(a);
        }
        String noSpecialCharacters = sb.toString().toLowerCase();
        char[] toCharArray = noSpecialCharacters.toCharArray();
        for(int i=0;i<toCharArray.length/2;i++){
            if(toCharArray[i]!=toCharArray[toCharArray.length-1-i]){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[]args){
        System.out.println(Solution8.run());
    }
}
