package com.example.demo;

public class looptest2 {
	void mondai1() {      
	    for (int i = 0; i < 5; i++) {
	        for (int j = 0; j < 5; j++) {
	            if (i==j) {
	                System.out.print("*");
	            } else {
	                System.out.print("  "); 
	            }
	        }
	        System.out.println();
	        }
	}      
    void mondai2() {      
	    for (int i = 0; i < 5; i++) {                
	         for (int j = 0; j < 5; j++) {
	             if(i%2==0){
                     System.out.print("*  ");
                 } else {
                     System.out.print("  *");
                 }
	         }
	             System.out.println();
	    }
    }       

    void mondai3() {      
	    for (int i = 0; i < 5; i++) {
	        int center = (int) Math.ceil(5/2);
	            if (center==i) {
                    for (int j = 0; j < 5; j++) {
	                    System.out.print("* ");
	                }
	                System.out.println();
                } else {
                    for (int j = 0; j < 5; j++) {
                        if (center==j) {
	                        System.out.print("* "); 
	                     } else {
	                         System.out.print("  "); 
                         }
	                }
	                System.out.println();
	            }
        }
    }     



}
