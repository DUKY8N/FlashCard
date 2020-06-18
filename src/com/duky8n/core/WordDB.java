package com.duky8n.core;

import java.util.ArrayList;
import java.util.Random;

public class WordDB {
	static public int wordNum = 0;

	static public ArrayList<String> firstWord = new ArrayList<String>();
	static public ArrayList<String> secondWord = new ArrayList<String>();

	public ArrayList<String> toStudyFirstWord = new ArrayList<String>();
	public ArrayList<String> toStudySecondWord = new ArrayList<String>();

	public ArrayList<String> studyingFirstWord = new ArrayList<String>();
	public ArrayList<String> studyingSecondWord = new ArrayList<String>();
	public ArrayList<Integer> proficiencyLevel = new ArrayList<Integer>();

	public ArrayList<String> studiedFirstWord = new ArrayList<String>();
	public ArrayList<String> studiedSecondWord = new ArrayList<String>();

	public int count = 0;
	int randomNum = 0;

	WordDB() {
	}

	public String getLine1() {
		return firstWord.get(count);
	}

	public String getLine2() {
		return secondWord.get(count);
	}

	public void nextWord() {
		if (count < wordNum - 1)
			count++;
	}

	public void beforWord() {
		if (count > 0)
			count--;
	}

	public void readyToStudy() {
		Random random = new Random();
		while (studyingFirstWord.size() < 10 && toStudyFirstWord.size() != 0) {
			int temp = random.nextInt(toStudyFirstWord.size());
			studyingFirstWord.add(toStudyFirstWord.get(temp));
			studyingSecondWord.add(toStudySecondWord.get(temp));
			proficiencyLevel.add(0);
			toStudyFirstWord.remove(temp);
			toStudySecondWord.remove(temp);
		}
	}

	public void chooseWord() {
		Random random = new Random();
		if (studyingFirstWord.size() > 0) {
			int temp = random.nextInt(studyingFirstWord.size());
			if (studyingFirstWord.size() > 2) {
				while (temp == this.randomNum) temp = random.nextInt(studyingFirstWord.size());
			}
			this.randomNum = temp;
		}

	}

	public String getStudyingLine1() {
		if (studyingFirstWord.size() > 0) {
			return studyingFirstWord.get(randomNum);
		} else {
			return "수고하셨습니다";
		}
	}

	public String getStudyingLine2() {
		if (studyingSecondWord.size() > 0) {
			return studyingSecondWord.get(randomNum);
		} else {
			return "모든 단어를 공부하셨습니다";
		}
	}

	public void reStudy() {
		if (proficiencyLevel.get(randomNum) > 0) {
			proficiencyLevel.set(randomNum, proficiencyLevel.get(randomNum) - 1);
		}
	}

	public void studied() {
		proficiencyLevel.set(randomNum, proficiencyLevel.get(randomNum) + 1);
	}

	public void perfectlyStudied() {
		proficiencyLevel.set(randomNum, proficiencyLevel.get(randomNum) + 2);
	}

	public void removeAlreadyKnow() {
		if (this.proficiencyLevel.get(randomNum) >= 4) {
			this.studiedFirstWord.add(this.studyingFirstWord.get(randomNum));
			this.studiedSecondWord.add(this.studyingSecondWord.get(randomNum));
			this.studyingFirstWord.remove(randomNum);
			this.studyingSecondWord.remove(randomNum);
			this.proficiencyLevel.remove(randomNum);
		}
	}

	public void changeEachLine() {
		ArrayList<String> temp = new ArrayList<String>();
		temp.addAll(toStudyFirstWord);
		this.toStudyFirstWord.clear();
		this.toStudyFirstWord.addAll(toStudySecondWord);
		this.toStudySecondWord.clear();
		this.toStudySecondWord.addAll(temp);

		temp.clear();
		temp.addAll(studyingFirstWord);
		this.studyingFirstWord.clear();
		this.studyingFirstWord.addAll(studyingSecondWord);
		this.studyingSecondWord.clear();
		this.studyingSecondWord.addAll(temp);

		temp.clear();
		temp.addAll(studiedFirstWord);
		this.studiedFirstWord.clear();
		this.studiedFirstWord.addAll(studiedSecondWord);
		this.studiedSecondWord.clear();
		this.studiedSecondWord.addAll(temp);
	}

	public void fillWord() {
		this.toStudyFirstWord.addAll(firstWord);
		this.toStudySecondWord.addAll(secondWord);
	}

	public void reset() {
		this.toStudyFirstWord.clear();
		this.toStudySecondWord.clear();
		this.studyingFirstWord.clear();
		this.studyingSecondWord.clear();
		this.proficiencyLevel.clear();
		this.studiedFirstWord.clear();
		this.studiedSecondWord.clear();
	}
}
