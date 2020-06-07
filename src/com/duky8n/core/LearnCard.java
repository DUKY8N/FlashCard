package com.duky8n.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.duky8n.ui.CardTable;

public class LearnCard {
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
				readFile.run();
				cardTable.changeLine1(wordDB.getLine1());
				cardTable.changeLine2(wordDB.getLine2());
				cardTable.hideLine2();
				cardTable.hideLearnButton();
				cardTable.showAnswerCheckButton();
				
				
			}
		
		});
		
		this.cardTable.learnMode.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PracticeMode();
				
			}
		
		});
	}

}
