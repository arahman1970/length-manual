package com.company;

public class Main {

    public static void main(String[] args) {
        calculateLength("This is the length demo");
    }

    private static void calculateLength(String input){

//First remove whitespace characters
        input = input.replace(" ", "");
        int len =0;

        char [] array = input.toCharArray();

        for(char c: array){
            len++;
        }
        System.out.println(len);
    }
}