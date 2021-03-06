package com.duky8n.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.duky8n.ui.PracticeTable;

public class PracticeMode {
	PracticeTable practiceTable = new PracticeTable();
	WordDB wordDB = new WordDB();

	PracticeMode() {
		practiceTable.changeLine1(wordDB.getLine1());
		practiceTable.changeLine2(wordDB.getLine2());
		practiceTable.changeCount(wordDB.count + 1, WordDB.wordNum);

		this.practiceTable.nextButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordDB.nextWord();
				practiceTable.changeLine1(wordDB.getLine1());
				practiceTable.changeLine2(wordDB.getLine2());
				practiceTable.changeCount(wordDB.count + 1, WordDB.wordNum);

			}

		});

		this.practiceTable.backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				wordDB.beforWord();
				practiceTable.changeLine1(wordDB.getLine1());
				practiceTable.changeLine2(wordDB.getLine2());
				practiceTable.changeCount(wordDB.count + 1, WordDB.wordNum);

			}

		});
	}

}
