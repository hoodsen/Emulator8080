package com.jasonrobison.emulator8080.emulator;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

public class Emulator {
	
	Cpu cpu = new Cpu();
	
	public void loadGameIntoMemory(String pathToGame) throws IOException {
		InputStream inputStream  = new FileInputStream("/Users/jason/Downloads/invaders");
		
		byte[] bytes = IOUtils.toByteArray(inputStream);
		
		for (int i = 0; i < bytes.length; i++) {
			cpu.getMemory()[i] = bytes[i];
		}
	}
	
	public void executeGame() {
		cpu.executeProgram();
	}

}
