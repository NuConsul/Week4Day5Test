package com.chemwater.week4day5test;

import java.util.Scanner;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println(getStringToReverse("fiver"  )) ;
    }


    static String getStringToReverse(String stringOne) {
        if(stringOne.length() == 0)
            return "";
        return stringOne.charAt(stringOne.length() - 1) + getStringToReverse(stringOne.substring(0,stringOne.length()-1));
    }



}
