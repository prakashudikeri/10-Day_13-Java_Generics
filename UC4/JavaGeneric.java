package com.bridgelabz.UC4; //UC4-Generic Method

public class JavaGeneric {	
	public static void main(String[] args) {
        System.out.println("Welcome to Java Core - Generics Test Maximum");
        	JavaGeneric integerComparison = new JavaGeneric();												        //Creating Generic Integer Object for Integer Comparison
        System.out.println("Maximum from 3 Integer Object : "+integerComparison.compareTo(90,120,190));
        	JavaGeneric floatComparison = new JavaGeneric();														        //Creating Generic Float Object for Float Comparison
        System.out.println("Maximum from 3 Float Object : "+floatComparison.compareTo(90.0F,120.0F,190.0F));
        	JavaGeneric stringComparison = new JavaGeneric();															        //Creating Generic String Object for String Comparison
        System.out.println("Maximum from 3 String Object : "+stringComparison.compareTo("Apple","Peach","Banana"));
    	}
    public <T extends Comparable<T>> T compareTo(T a,T b,T c) {				//compareTo method for Checking Maximum from 3 Integer Object
        if(a.compareTo(b) > 0){
            if(a.compareTo(c) > 0) {
                return a;
            } 
            else {
                return c;
            	}
	        } 
	        else {
	            if(b.compareTo(c) > 0) {
	                return b;
	        	} 
	            else {
	                return c;
	            	}
	        	}
    		}	
}
