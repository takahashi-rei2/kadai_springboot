package com.example.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JavaKadaiApplicationTests {

	@Test
	void contextLoads() {
		try {
		Files.readString(Paths.get(""));
		}
		catch(IOException E){
			
		}
		finally {
			
		}
		
	}

}
