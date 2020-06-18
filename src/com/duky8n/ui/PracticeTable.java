package com.duky8n.ui;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PracticeTable extends JFrame {

	///// LABELS /////

	public JLabel line1 = new JLabel("Welcome!");
	public JLabel line2 = new JLabel("�ܾ����� ������ �ּ���.");
	public JLabel count1 = new JLabel("0/0");

	///// BUTTONS /////

	public JButton backButton = new JButton("����");
	public JButton nextButton = new JButton("����");
	
	///// IMAGE /////
	
	ImageIcon icon = new ImageIcon("images/school.png");

	public PracticeTable() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame ����
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true); // frame�� ���������� ����
		this.setSize(450, 200); // frame size
		this.setIconImage(icon.getImage());

		///// PANELS /////

		// ����� �� �г� //
		Container bigPanel = new Container();
		bigPanel.setLayout(new BorderLayout()); // �������� ���̾ƿ�
		this.add(bigPanel); // bigPanel�� Frame�� ÷��

		// �󺧵��� ���� �г� //
		JPanel labelsPanel = new JPanel();
		labelsPanel.setLayout(new BorderLayout()); // �������� ���̾ƿ�
		JPanel contentsPanel = new JPanel();
		contentsPanel.setLayout(new GridLayout(2, 1)); // 2��, 1�� ���̾ƿ�
		bigPanel.add(labelsPanel, "Center"); // labelsPanel�� bigPanel(Center)�� ÷��
		labelsPanel.add(contentsPanel, "Center");

		///// LABELS /////

		line1.setHorizontalAlignment(JLabel.CENTER); // label�� center��ġ�� ����
		line1.setFont(new Font("SanSerif", Font.BOLD, 30)); // label�� �۲� ����
		contentsPanel.add(line1); // line1 label�� labelsPanel�� ÷��

		line2.setHorizontalAlignment(JLabel.CENTER); // label�� center��ġ�� ����
		line2.setFont(new Font("SanSerif", Font.BOLD, 30)); // label�� �۲� ����
		contentsPanel.add(line2); // line2 label�� labelsPanel�� ÷��
		
		count1.setHorizontalAlignment(JLabel.CENTER);
		labelsPanel.add(count1, "South");

		///// BUTTONS /////

		bigPanel.add(backButton, "West");
		bigPanel.add(nextButton, "East");

	}

	public void changeLine1(String word) {
		line1.setText(word);
	}

	public void changeLine2(String word) {
		line2.setText(word);
	}
	
	public void changeEachLine() {
		String temp = this.line1.getText();
		this.changeLine1(this.line2.getText());
		this.changeLine2(temp);
	}

	public void changeCount(int num1, int num2) {
		count1.setText(num1 + "/" + num2);
	}
	
	public void hideLine2() {
		line2.setVisible(false);
	}

	public void showLine2() {
		line2.setVisible(true);
	}

}