package com.duky8n.ui;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CardTable extends JFrame {

	///// LABELS /////

	JLabel line1 = new JLabel("Welcome!");
	JLabel line2 = new JLabel("�ܾ����� ������ �ּ���.");
	JLabel count1 = new JLabel("����: 0/0");
	JLabel count2 = new JLabel("��ä: 0/0");
	JLabel count3 = new JLabel("����: 0");

	///// BUTTONS /////

	public JButton reButton = new JButton("�ٽ�");
	public JButton rightButton = new JButton("�˸���");
	public JButton easyButton = new JButton("����");
	public JButton checkAnswerButton = new JButton("���� Ȯ��");
	public JButton refreshButton = new JButton("���� ��ħ");
	
	///// MENU BAR /////
	
	public JMenuItem swapLines = new JMenuItem("�� �Ʒ� �ٲٱ�");
	public JMenuItem openVocabulary = new JMenuItem("�ܾ��� ����");
	public JMenuItem learnMode = new JMenuItem("���� ���");
	public JMenuItem reset = new JMenuItem("���õ� �ʱ�ȭ");
	public JMenuItem addWord = new JMenuItem("�ܾ� �߰�");
	
	///// IMAGE /////

	ImageIcon icon = new ImageIcon("images/cat.png");

	public CardTable() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X ��ư�� ������ ���μ��� ����
		this.setVisible(true); // frame�� ���������� ����
		this.setSize(450, 300); // frame size
		this.setIconImage(icon.getImage());

		///// PANELS /////

		// ����� �� �г� //
		Container bigPanel = new Container();
		bigPanel.setLayout(new BorderLayout()); // �������� ���̾ƿ�
		this.add(bigPanel); // bigPanel�� Frame�� ÷��

		// �󺧵��� ���� �г� //
		JPanel labelsPanel = new JPanel();
		labelsPanel.setLayout(new GridLayout(2, 1)); // 2��, 1�� ���̾ƿ�
		bigPanel.add(labelsPanel, "Center"); // labelsPanel�� bigPanel(Center)�� ÷��

		JPanel detailLabelsPanel = new JPanel();
		detailLabelsPanel.setLayout(new GridLayout(1, 2));
		bigPanel.add(detailLabelsPanel, "North");

		// ��ư���� ���� �г� //
		JPanel btnsPanel = new JPanel();
		bigPanel.add(btnsPanel, "South"); // btnsPanel�� bigPanel(South)�� ÷��

		///// LABELS /////

		line1.setHorizontalAlignment(JLabel.CENTER); // label�� center��ġ�� ����
		line1.setFont(new Font("SanSerif", Font.BOLD, 30)); // label�� �۲� ����
		labelsPanel.add(line1); // line1 label�� labelsPanel�� ÷��

		line2.setHorizontalAlignment(JLabel.CENTER); // label�� center��ġ�� ����
		line2.setFont(new Font("SanSerif", Font.BOLD, 30)); // label�� �۲� ����
		labelsPanel.add(line2); // line2 label�� labelsPanel�� ÷��

		count1.setHorizontalAlignment(JLabel.LEFT); // label�� center��ġ�� ����
		detailLabelsPanel.add(count1);
		count2.setHorizontalAlignment(JLabel.CENTER); // label�� center��ġ�� ����
		detailLabelsPanel.add(count2);
		count3.setHorizontalAlignment(JLabel.RIGHT); // label�� center��ġ�� ����
		detailLabelsPanel.add(count3);

		///// BUTTONS /////

		btnsPanel.add(checkAnswerButton); // checkAnswerButton Button�� btnsPanel�� ÷��
		btnsPanel.add(reButton); // reButton Button�� btnsPanel�� ÷��
		btnsPanel.add(rightButton); // rightButton Button�� btnsPanel�� ÷��
		btnsPanel.add(easyButton); // easyButton Button�� btnsPanel�� ÷��
		btnsPanel.add(refreshButton);

		reButton.setVisible(false);
		refreshButton.setVisible(false);
		rightButton.setVisible(false);
		easyButton.setVisible(false);
		checkAnswerButton.setVisible(false);

		///// MENU BAR /////

		JMenuBar mb = new JMenuBar(); // �޴��� ����
		JMenu fileMenu = new JMenu("File"); // File �̶�� �̸��� �޴� ����
		JMenu optionMenu = new JMenu("Option"); // Option �̶�� �̸��� �޴� ����
		mb.add(fileMenu);
		mb.add(optionMenu);
		this.setJMenuBar(mb); // Main Frame�� �޴��� ����
		fileMenu.add(openVocabulary);
		fileMenu.add(addWord);
		optionMenu.add(swapLines);
		optionMenu.add(reset);
		optionMenu.add(learnMode);

	}

	public void changeLine1(String word) {
		line1.setText(word);
	}

	public void changeLine2(String word) {
		line2.setText(word);
	}

	public void changeCount1(int num1) {
		count1.setText("���� �ܾ�: " + num1);
	}

	public void changeCount2(int num1, int num2) {
		count2.setText("��ä: " + num1 + "/" + num2);
	}

	public void changeCount3(int num1) {
		count3.setText("����: " + num1);
	}

	public void changeEachLine() {
		String temp = this.line1.getText();
		this.changeLine1(this.line2.getText());
		this.changeLine2(temp);
	}

	public void hideLine2() {
		line2.setVisible(false);
	}

	public void hideLearnButton() {
		reButton.setVisible(false);
		rightButton.setVisible(false);
		easyButton.setVisible(false);

	}
	
	public void hideAnswerCheckButton() {
		checkAnswerButton.setVisible(false);
	}

	public void showLine2() {
		line2.setVisible(true);
	}

	public void showLearnButton() {
		reButton.setVisible(true);
		rightButton.setVisible(true);
		easyButton.setVisible(true);

	}
	
	public void showAnswerCheckButton() {
		checkAnswerButton.setVisible(true);
	}

}