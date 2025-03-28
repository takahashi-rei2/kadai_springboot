package com.example.demo;

import org.junit.jupiter.api.Test;

public class Looptest4 {
	@Test
	void mondai1() {      
	    for (int i = 0; i < 5; i++) {
	        for (int j = 1; j < 6; j++) {
	            System.out.print(i*5+j+" "); 
	        }
	        System.out.println();
	    }
	}     
	@Test
    void mondai2() {      
	    for (int i = 0; i < 5; i++) {
	        for (int j = 1; j < 6; j++) {
	            int N=i*5+j;
	                if(N<10){
	                    System.out.print(N+"  "); 
	                }else{
	                    System.out.print(N+" ");   
	                }
	        }
	            System.out.println();
	    }
    }       
    @Test
    void mondai3() {      
    	for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                int N=i*j;
                if(N<10){
                    System.out.print(N+"  "); 
                }else{
                    System.out.print(N+" ");   
                }
            }
                System.out.println();
        }
    }
}
