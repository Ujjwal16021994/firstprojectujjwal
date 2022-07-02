package com.ujjwal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String str = "jaishriram";
        String str1 = "jaishriiram";
        char c=0;
        for(char d: str.toCharArray())
        {
            c ^= d;
        }

        for(char d : str1.toCharArray())
        {
            c ^= d;
        }
        System.out.println(c);
    }
}
