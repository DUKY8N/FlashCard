package com.duky8n.ui;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class CardTable extends JFrame {

	///// LABELS /////

	JLabel line1 = new JLabel("Welcome!");
	JLabel line2 = new JLabel("단어장을 선택해 주세요.");
	JLabel count1 = new JLabel("현재: 0/0");
	JLabel count2 = new JLabel("전채: 0/0");
	JLabel count3 = new JLabel("연속: 0");

	///// BUTTONS /////

	public JButton reButton = new JButton("다시");
	public JButton rightButton = new JButton("알맞음");
	public JButton easyButton = new JButton("쉬움");
	public JButton checkAnswerButton = new JButton("정답 확인");
	public JButton refreshButton = new JButton("새로 고침");
	
	///// MENU BAR /////
	
	public JMenuItem swapLines = new JMenuItem("위 아래 바꾸기");
	public JMenuItem openVocabulary = new JMenuItem("단어장 열기");
	public JMenuItem learnMode = new JMenuItem("연습 모드");
	public JMenuItem reset = new JMenuItem("숙련도 초기화");
	public JMenuItem addWord = new JMenuItem("단어 추가");
	
	///// IMAGE /////

	ImageIcon icon = new ImageIcon("images/cat.png");

	public CardTable() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame 제목
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼을 누를시 프로세스 종료
		this.setVisible(true); // frame을 보여줄지의 여부
		this.setSize(450, 300); // frame size
		this.setIconImage(icon.getImage());

		///// PANELS /////

		// 기둥이 될 패널 //
		Container bigPanel = new Container();
		bigPanel.setLayout(new BorderLayout()); // 동서남북 레이아웃
		this.add(bigPanel); // bigPanel을 Frame에 첨가

		// 라벨들을 담을 패널 //
		JPanel labelsPanel = new JPanel();
		labelsPanel.setLayout(new GridLayout(2, 1)); // 2행, 1열 레이아웃
		bigPanel.add(labelsPanel, "Center"); // labelsPanel을 bigPanel(Center)에 첨가

		JPanel detailLabelsPanel = new JPanel();
		detailLabelsPanel.setLayout(new GridLayout(1, 2));
		bigPanel.add(detailLabelsPanel, "North");

		// 버튼들을 담을 패널 //
		JPanel btnsPanel = new JPanel();
		bigPanel.add(btnsPanel, "South"); // btnsPanel을 bigPanel(South)에 첨가

		///// LABELS /////

		line1.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		line1.setFont(new Font("SanSerif", Font.BOLD, 30)); // label의 글꼴 변경
		labelsPanel.add(line1); // line1 label을 labelsPanel에 첨가

		line2.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		line2.setFont(new Font("SanSerif", Font.BOLD, 30)); // label의 글꼴 변경
		labelsPanel.add(line2); // line2 label을 labelsPanel에 첨가

		count1.setHorizontalAlignment(JLabel.LEFT); // label을 center위치에 지정
		detailLabelsPanel.add(count1);
		count2.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		detailLabelsPanel.add(count2);
		count3.setHorizontalAlignment(JLabel.RIGHT); // label을 center위치에 지정
		detailLabelsPanel.add(count3);

		///// BUTTONS /////

		btnsPanel.add(checkAnswerButton); // checkAnswerButton Button을 btnsPanel에 첨가
		btnsPanel.add(reButton); // reButton Button을 btnsPanel에 첨가
		btnsPanel.add(rightButton); // rightButton Button을 btnsPanel에 첨가
		btnsPanel.add(easyButton); // easyButton Button을 btnsPanel에 첨가
		btnsPanel.add(refreshButton);

		reButton.setVisible(false);
		refreshButton.setVisible(false);
		rightButton.setVisible(false);
		easyButton.setVisible(false);
		checkAnswerButton.setVisible(false);

		///// MENU BAR /////

		JMenuBar mb = new JMenuBar(); // 메뉴바 생성
		JMenu fileMenu = new JMenu("File"); // File 이라는 이름의 메뉴 생성
		JMenu optionMenu = new JMenu("Option"); // Option 이라는 이름의 메뉴 생성
		mb.add(fileMenu);
		mb.add(optionMenu);
		this.setJMenuBar(mb); // Main Frame에 메뉴바 붙임
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
		count1.setText("남은 단어: " + num1);
	}

	public void changeCount2(int num1, int num2) {
		count2.setText("전채: " + num1 + "/" + num2);
	}

	public void changeCount3(int num1) {
		count3.setText("연속: " + num1);
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