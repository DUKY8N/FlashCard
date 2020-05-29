package com.duky8n;

import java.awt.*;
import javax.swing.*;

public class Frame1 extends JFrame {
	public Frame1() {
		this.setTitle("FlashCard");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(450, 300);
		
		Container c = this.getContentPane();
		c.setLayout(null);
		
		JLabel word1 = new JLabel("여기에는 영어단어");
		word1.setSize(150,50);
		word1.setLocation(150, 30);
		c.add(word1);
		
		JLabel word2 = new JLabel("여기에는 영단어뜻");
		word2.setSize(150,50);
		word2.setLocation(150, 50);
		c.add(word2);

		JButton reButton = new JButton("다시");
		reButton.setSize(100,50);
		c.add(reButton);
		reButton.setLocation(50,200);
		JButton rightButton = new JButton("알맞음");
		rightButton.setSize(100,50);
		c.add(rightButton);
		rightButton.setLocation(175,200);
		JButton easyButton = new JButton("쉬움");
		easyButton.setSize(100,50);
		c.add(easyButton);
		easyButton.setLocation(300,200);

	}

	public static void main(String[] args) {
		new Frame1();
	}

}
