package com.Recursion;
import java.util.*;

public class reversedStringToStraightString {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        straight(str);
    }
    public static void straight(String str){
        Stack <Character> stack = new Stack<>();
        for(int i=str.length()-1;i>0;i--){
            stack.push(str.charAt(i));
        }
        String straight = "";
        for(int i=0;i<str.length();i++){
            straight = straight + stack.pop();
        }
        System.out.println(straight);
    }
}
