package com.chemwater.week4day5test;

import java.util.Scanner;

public class ConditionalInput {

    static char a = 'a' ;

    public static void conditionalInputMethod(char charVariable) {
        //char

        switch(charVariable) {
            case 'a' :
                System.out.println(" 1") ;
                break ;

            case 'e':
                System.out.println(" 2") ;
                break ;

            case 'i':
                System.out.println(" 3") ;
                break ;

            case 'o':
                System.out.println(" 4") ;
                break ;

            case 'u':
                System.out.println(" 5") ;
                break ;

            case 'y':
                System.out.println(" ") ;
                break ;

            case ' ':
                System.out.println(" y") ;
                break ;

            case 'b':
                System.out.println("c") ;
                break ;

            case 'c':
                System.out.println("d") ;
                break ;

            case 'd':
                System.out.println("e") ;
                break ;

            case 'f':
                System.out.println("g") ;
                break ;

            case 'g':
                System.out.println("h") ;
                break ;

            case 'h':
                System.out.println("i") ;
                break ;

            case 'j':
                System.out.println("k") ;
                break ;

            case 'k':
                System.out.println("l") ;
                break ;

            case 'l':
                System.out.println("m") ;
                break ;

            case 'm':
                System.out.println("n") ;
                break ;

            case 'n':
                System.out.println("o") ;
                break ;

            case 'p':
                System.out.println("q") ;
                break ;

            case 'q':
                System.out.println("r") ;
                break ;

            case 'r':
                System.out.println("s") ;
                break ;

            case 's':
                System.out.println("t") ;
                break ;

            case 't':
                System.out.println("u") ;
                break ;

            case 'v':
                System.out.println("w") ;
                break ;

            case 'x':
                System.out.println("y") ;
                break ;

            case 'z':
                System.out.println("a") ;
                break ;


                default:
                    System.out.println("Not a valid character") ;
                    break ;


        }
    }

    //public static void main(String[] args) {
        //conditionalInputMethod('r') ;
        /*while (a <= 'z') {
            System.out.println(a);
            a++;
        }*/
    //}


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(stringFormatting(s1));
    }
    /*public static String stringFormatting(String s1) {
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(i%2==0){
                if(c==122)
                    c=(char) (c-25);
                else{
                    c=(char) (c+1);}
                sb.append(c);}
            else
                sb.append(c);}
        return sb.toString();
    }*/
    public static String stringFormatting(String s1) {
        StringBuffer sb= new StringBuffer() ;
        for(int i = 0 ; i <s1.length() ; i++) {
            char c = s1.charAt(i) ;
            /*if(i%2 == 0) {
                if(c == 122)
                    c = (char) (c-25) ;
                else {
                    c = (char) (c+1);
                }
                sb.append(c);
            }*/


            if(c == 97)
                c = (char) (c+25) ;
            else {
                c = (char) (c-1) ;
            }
                sb.append(c);
        }
        return sb.toString() ;
    }






}
