package com.duky8n.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.duky8n.ui.CardTable;

public class LearnCard extends Thread {
	CardTable cardTable = new CardTable();
	ReadFile readFile = new ReadFile();
	WordDB wordDB = new WordDB();

	public LearnCard() {
		cardTable.hideLearnButton();
		this.cardTable.checkAnswerButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.hideAnswerCheckButton();
				cardTable.showLearnButton();
				cardTable.showLine2();
			}
		});

		this.cardTable.reButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.nextWord();
				cardTable.changeLine1(wordDB.getLine1());
				cardTable.changeLine2(wordDB.getLine2());
			}
		});

		this.cardTable.rightButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.nextWord();
				cardTable.changeLine1(wordDB.getLine1());
				cardTable.changeLine2(wordDB.getLine2());
				cardTable.changeCount2(wordDB.count+1, WordDB.wordNum);
			}
		});

		this.cardTable.easyButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.nextWord();
				cardTable.changeLine1(wordDB.getLine1());
				cardTable.changeLine2(wordDB.getLine2());
			}
		});
		
		this.cardTable.swapLines.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.changeEachLine();
				
			}
		
		});

		this.cardTable.openVocabulary.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordDB.count = 0;
				readFile.run();
				cardTable.refreshButton.setVisible(true);
				cardTable.checkAnswerButton.setVisible(false);
				cardTable.reButton.setVisible(false);
				cardTable.rightButton.setVisible(false);
				cardTable.easyButton.setVisible(false);
				
			}
		
		});
		
		this.cardTable.learnMode.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PracticeMode();
				
			}
		
		});

		this.cardTable.refreshButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.changeLine1(wordDB.getLine1());
				cardTable.changeLine2(wordDB.getLine2());
				cardTable.hideLine2();
				cardTable.hideLearnButton();
				cardTable.showAnswerCheckButton();
				cardTable.refreshButton.setVisible(false);
				cardTable.changeCount2(wordDB.count+1, WordDB.wordNum);
			}
		
		});
	}

}
