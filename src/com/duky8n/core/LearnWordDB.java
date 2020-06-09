package com.duky8n.core;

import java.util.ArrayList;

public class LearnWordDB {
	WordDB wordDB = new WordDB();
	static public ArrayList<String> waitingFirstWord = new ArrayList<String>(WordDB.firstWord);
	static public ArrayList<String> waitingSecondWord = new ArrayList<String>(WordDB.secondWord);

	static public ArrayList<String> studingFirstWord = new ArrayList<String>();
	static public ArrayList<String> studingSecondWord = new ArrayList<String>();

	static public ArrayList<String> studiedFirstWord = new ArrayList<String>();
	static public ArrayList<String> studiedSecondWord = new ArrayList<String>();

	static public ArrayList<Integer> correctNum = new ArrayList<Integer>(WordDB.correctNum);

	void readyToStudy() {
	}
}
