package com.duky8n.ui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class AddWord extends JFrame {
	
	///// BUTTONS /////
	
	public JButton enterButton = new JButton("�ܾ� �߰�");
	
	///// TEXTFIELD /////
	
	public JTextField line1 = new JTextField();
	public JTextField line2 = new JTextField();
	
	///// IMAGE /////

	ImageIcon icon = new ImageIcon("images/door.png");

	public AddWord() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame ����
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true); // frame�� ���������� ����
		this.setSize(450, 125); // frame size
		this.setIconImage(icon.getImage());
		this.setResizable(false);
		this.setLayout(new BorderLayout());
		
		///// PANELS /////
		
		// �ؽ�Ʈ�ʵ���� ���� �г� //
		JPanel textfildPanel = new JPanel();
		textfildPanel.setLayout(new GridLayout(2, 0));
		this.add(textfildPanel, "Center");
		
		///// TEXTFIELD /////

		textfildPanel.add(line1);
		textfildPanel.add(line2);

		///// BUTTONS /////
		
		this.add(enterButton, "South");
	}

}