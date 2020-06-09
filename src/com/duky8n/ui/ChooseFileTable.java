package com.duky8n.ui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChooseFileTable extends JFrame {
	
	///// BUTTONS /////
	
	public JButton enterPathButton = new JButton("���� ��� �Է�");
	
	///// TEXTFIELD /////
	
	public JTextField pathTextField = new JTextField();

	public ChooseFileTable() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame ����
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true); // frame�� ���������� ����
		this.setSize(450, 100); // frame size
		this.setResizable(false);
		this.setLayout(new GridLayout(2, 0));
		
		///// TEXTFIELD /////

		this.add(pathTextField);

		///// BUTTONS /////
		
		this.add(enterPathButton);
	}

}