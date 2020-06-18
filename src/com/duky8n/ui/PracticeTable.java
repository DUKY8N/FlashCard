package com.duky8n.ui;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PracticeTable extends JFrame {

	///// LABELS /////

	public JLabel line1 = new JLabel("Welcome!");
	public JLabel line2 = new JLabel("단어장을 선택해 주세요.");
	public JLabel count1 = new JLabel("0/0");

	///// BUTTONS /////

	public JButton backButton = new JButton("이전");
	public JButton nextButton = new JButton("다음");
	
	///// IMAGE /////
	
	ImageIcon icon = new ImageIcon("images/school.png");

	public PracticeTable() {

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame 제목
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setVisible(true); // frame을 보여줄지의 여부
		this.setSize(450, 200); // frame size
		this.setIconImage(icon.getImage());

		///// PANELS /////

		// 기둥이 될 패널 //
		Container bigPanel = new Container();
		bigPanel.setLayout(new BorderLayout()); // 동서남북 레이아웃
		this.add(bigPanel); // bigPanel을 Frame에 첨가

		// 라벨들을 담을 패널 //
		JPanel labelsPanel = new JPanel();
		labelsPanel.setLayout(new BorderLayout()); // 동서남북 레이아웃
		JPanel contentsPanel = new JPanel();
		contentsPanel.setLayout(new GridLayout(2, 1)); // 2행, 1열 레이아웃
		bigPanel.add(labelsPanel, "Center"); // labelsPanel을 bigPanel(Center)에 첨가
		labelsPanel.add(contentsPanel, "Center");

		///// LABELS /////

		line1.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		line1.setFont(new Font("SanSerif", Font.BOLD, 30)); // label의 글꼴 변경
		contentsPanel.add(line1); // line1 label을 labelsPanel에 첨가

		line2.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		line2.setFont(new Font("SanSerif", Font.BOLD, 30)); // label의 글꼴 변경
		contentsPanel.add(line2); // line2 label을 labelsPanel에 첨가
		
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