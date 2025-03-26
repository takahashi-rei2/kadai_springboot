package com.example.demo;

import org.junit.jupiter.api.Test;

public class LoopTest {
	@Test 
	void mondai1() { 
		for (int row = 0; row < 5; row++) {
		    
		    for (int col = 0; col <= row; col++) {
		        
		        System.out.print("* ");
		    }
		    
		    System.out.println();
		}
	 }
	  
	@Test 
	void mondai2() {
	    for (int row = 4; row <=0; row--) {
	    
	        for (int col = 0; col <= row; col++) {
	        
	            System.out.print("* ");
	    }
	   
	    System.out.println();
	}
	    }
	@Test 
	void mondai3() {      
	      for (int i = 0; i < 5; i++) {
	            for (int j = 0; j < 5; j++) {
	                if (i == 0 || i == 5 - 1 || j == 0 || j == 5 - 1) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // 空白を出力
	                }
	            }
	            System.out.println();
	        }
	    }


}
