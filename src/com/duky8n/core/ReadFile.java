package com.duky8n.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadFile {
	Path path = Paths.get("test.txt");
	public ArrayList<String> firstWord = new ArrayList<String>();
	public ArrayList<String> secondWord = new ArrayList<String>();
	public ArrayList<Integer> correctNum = new ArrayList<Integer>();
	public int wordNum = 0;
	int count;
	
	ReadFile() {

	}

	public void run() {
		try {
			count = 0;

			BufferedReader reader = Files.newBufferedReader(path);
			String line = reader.readLine();
			while (line != null) {
				int idx = line.indexOf(":");

				this.firstWord.add(line.substring(0, idx));
				this.secondWord.add(line.substring(idx+1));
				this.correctNum.add(0);
				this.wordNum++;

				line = reader.readLine();
			}
		} catch (IOException e) {
			System.out.println("Could not read the file.");
		}
		
	}
	
	public String getLine1() {
		return this.firstWord.get(count);
	}

	public String getLine2() {
		return this.secondWord.get(count);
	}
	
	public void nextWord() {
		if (count < wordNum-1) count++;
	}

}