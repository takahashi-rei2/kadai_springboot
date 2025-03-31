package com.example.demo;

import org.junit.jupiter.api.Test;

public class Looptest5 {
	@Test
	void mondai1() {      
		for (int i = 0; i < 5; i++) {
	       for (int j = 0; j < 5; j++) {
	           System.out.print(10+i*3+j+" "); 
	       }
	       System.out.println();
		}
	}     
	@Test
    void mondai2() {      
        int a=0;
        int b=1;
        int c=1;
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 4; j++) {
                System.out.printf("%-3d ", a);
                c = a + b;
                a = b;
                b = c;                
            }
            System.out.println();
        }
	}      
}
