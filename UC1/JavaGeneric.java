package com.bridgelabz.UC1; //UC1 - MaximumOf3Integer

public class JavaGeneric {
	public static void main(String[] args) {
        System.out.println("Welcome to Java Core - Generics Test Maximum");
        System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,20));
    	}
	public static Integer compareTo(Integer a,Integer b,Integer c) {				//compareTo method for Checking Maximum from 3 Integer Object
        if(a > b){
            if(a > c) {
                return a;
            } 
            else {
                return c;
            	}
        } 
        else {
            if(b > c) {
                return b;
            	} 
            else {
                return c;
            	}
        	}
    	}
    
}