package com.duky8n.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
	Path path = Paths.get("test.txt");
	
	ReadFile() {

	}

	public void run() {
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String line = reader.readLine();
			while (line != null) {
				int idx = line.indexOf(":");

				WordDB.firstWord.add(line.substring(0, idx));
				WordDB.secondWord.add(line.substring(idx+1));
				WordDB.correctNum.add(0);
				WordDB.wordNum++;

				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Could not read the file.");
		}
		
	}
	

}