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
		this.cardTable.checkAnswerButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					cardTable.hideAnswerCheckButton();
					cardTable.showLine2();
				if (wordDB.studyingFirstWord.size() > 0) {
					cardTable.showLearnButton();
				}
			}
		});

		this.cardTable.reButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.reStudy();
				wordDB.chooseWord();
				cardTable.changeLine1(wordDB.getStudyingLine1());
				cardTable.changeLine2(wordDB.getStudyingLine2());
				cardTable.changeCount3(wordDB.proficiencyLevel.get(wordDB.randomNum));
			}
		});

		this.cardTable.rightButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.studied();
				wordDB.removeAlreadyKnow();
				wordDB.chooseWord();
				cardTable.changeLine1(wordDB.getStudyingLine1());
				cardTable.changeLine2(wordDB.getStudyingLine2());
				cardTable.changeCount1(wordDB.toStudyFirstWord.size() + wordDB.studyingFirstWord.size());
				cardTable.changeCount2(wordDB.studiedFirstWord.size(), WordDB.wordNum);
				cardTable.changeCount3(wordDB.proficiencyLevel.get(wordDB.randomNum));
			}
		});

		this.cardTable.easyButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
				wordDB.perfectlyStudied();
				wordDB.removeAlreadyKnow();
				wordDB.chooseWord();
				cardTable.changeLine1(wordDB.getStudyingLine1());
				cardTable.changeLine2(wordDB.getStudyingLine2());
				cardTable.changeCount1(wordDB.toStudyFirstWord.size() + wordDB.studyingFirstWord.size());
				cardTable.changeCount2(wordDB.studiedFirstWord.size(), WordDB.wordNum);
				cardTable.changeCount3(wordDB.proficiencyLevel.get(wordDB.randomNum));
			}
		});

		this.cardTable.swapLines.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.changeEachLine();
				wordDB.changeEachLine();

			}

		});

		this.cardTable.openVocabulary.addActionListener(new ActionListener() {

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

		this.cardTable.learnMode.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new PracticeMode();

			}

		});

		this.cardTable.refreshButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordDB.reset();
				wordDB.fillWord();
				wordDB.readyToStudy();
				wordDB.chooseWord();
				cardTable.changeLine1(wordDB.getStudyingLine1());
				cardTable.changeLine2(wordDB.getStudyingLine2());
				cardTable.hideLine2();
				cardTable.hideLearnButton();
				cardTable.showAnswerCheckButton();
				cardTable.refreshButton.setVisible(false);
				cardTable.changeCount1(wordDB.toStudyFirstWord.size() + wordDB.studyingFirstWord.size());
				cardTable.changeCount2(wordDB.studiedFirstWord.size(), WordDB.wordNum);
			}

		});
	}

}
