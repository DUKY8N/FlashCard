package com.duky8n.core;

import java.util.ArrayList;

public class WordDB {
	static public ArrayList<String> firstWord = new ArrayList<String>();
	static public ArrayList<String> secondWord = new ArrayList<String>();
	static public ArrayList<Integer> correctNum = new ArrayList<Integer>();
	static public int wordNum = 0;
	int count = 0;

	public String getLine1() {
		return firstWord.get(count);
	}

	public String getLine2() {
		return secondWord.get(count);
	}
	
	public void nextWord() {
		if (count < wordNum-1) count++;
	}

	public void beforWord() {
		if (count > 0) count--;
	}
}
