package com.bridgelabz.UC2; //UC2-MaximumOf3Float

public class JavaGeneric {
	public static void main(String[] args) {
        System.out.println("Welcome to Java Core - Generics Test Maximum");
        System.out.println("Maximum from 3 Integer Object : "+compareTo(90,120,190));
        System.out.println("Maximum from 3 Float Object : "+compareTo(90.0F,120.0F,190.0F));
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
    public static Float compareTo(Float a,Float b,Float c) {					    //compareTo method for Checking Maximum from 3 Float Object
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
