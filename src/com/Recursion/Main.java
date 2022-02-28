package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	Find that the string is palindrome or not using stack.
	 */
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindrome(str);
    }
    public static void palindrome(String str){
        Stack <Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        // pop will return the last element so when it will overall print the string in reverse.
        String rev = "";
        for(int i=0;i<str.length();i++){
            rev = rev + stack.pop();
        }
        // equals method will compare the contents of the element.
        if(rev.equals(str)){
            System.out.println("Yes");
        }
        else{
            System.out.println("no");
        }
    }
}
