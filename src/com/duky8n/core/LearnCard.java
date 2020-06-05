package com.duky8n.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.duky8n.ui.CardTable;

public class LearnCard {
	CardTable cardTable = new CardTable();

	public LearnCard() {
		cardTable.hideLine2();
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
			}
		});

		this.cardTable.rightButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
			}
		});

		this.cardTable.easyButton.addActionListener( new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardTable.showAnswerCheckButton();
				cardTable.hideLearnButton();
				cardTable.hideLine2();
			}
		});
	}

	public static void main(String[] args) {
		LearnCard lc = new LearnCard();
		lc.cardTable.hideLearnButton();

	}

}
