package com.duky8n.core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.duky8n.ui.ChooseFileTable;

public class ReadFile extends Thread {
	ChooseFileTable chooseFileTable = new ChooseFileTable();

	ReadFile() {
		chooseFileTable.setVisible(false);

	}

	public void run() {
		chooseFileTable.setVisible(true);
		WordDB.firstWord.clear();
		WordDB.secondWord.clear();
		WordDB.secondWord.clear();
		WordDB.wordNum = 0;
		chooseFileTable.enterPathButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("enter");
					Path path = Paths.get(chooseFileTable.pathTextField.getText());
					BufferedReader reader = Files.newBufferedReader(path);
					String line = reader.readLine();
					while (line != null) {
						int idx = line.indexOf(":");

						WordDB.firstWord.add(line.substring(0, idx));
						WordDB.secondWord.add(line.substring(idx + 1));
						WordDB.correctNum.add(0);
						WordDB.wordNum++;

						line = reader.readLine();
						chooseFileTable.setVisible(false);

					}
				} catch (IOException e1) {
					System.out.println("Could not read the file.");
					chooseFileTable.enterPathButton.setText("단어장 없음");

				}

			}

		});

	}

}