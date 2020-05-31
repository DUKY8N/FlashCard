package com.duky8n.flashCard;

import java.awt.*;
import javax.swing.*;

public class Card extends JFrame {
	public Card() {
		/**
		 * Container를 대신해서 JPanel을 사용해봄
		 * Container sample = this.getContentPane();
		 * JPanel sample = new JPanel();
		 */

		///// FRAME SETTING /////

		this.setTitle("FlashCard"); // frame 제목 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼을 누를시 프로세스 종료
		this.setVisible(true); // frame을 보여줄지의 여부
		this.setSize(500, 250); // frame size
		
		///// PANELS /////

		// 기둥이 될 패널 //
		JPanel bigPanel = new JPanel(); 
		bigPanel.setLayout(new BorderLayout()); // 동서남북 레이아웃
		this.add(bigPanel); // bigPanel을 Frame에 첨가

		// 라벨들을 담을 패널 //
		JPanel labelsPanel = new JPanel(); 
		labelsPanel.setLayout(new GridLayout(2,1)); // 2행, 1열 레이아웃
		bigPanel.add(labelsPanel, "Center"); // labelsPanel을 bigPanel(Center)에 첨가

		// 버튼들을 담을 패널 //
		JPanel btnsPanel = new JPanel(); 
		bigPanel.add(btnsPanel, "South"); // btnsPanel을 bigPanel(South)에 첨가
		
		///// LABELS /////
		
		JLabel word1 = new JLabel("여기에는 영어단어");
		word1.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		labelsPanel.add(word1); // word1 label을 labelsPanel에 첨가
		
		JLabel word2 = new JLabel("여기에는 영단어뜻");
		word2.setHorizontalAlignment(JLabel.CENTER); // label을 center위치에 지정
		labelsPanel.add(word2); // word2 label을 labelsPanel에 첨가

		///// BUTTONS /////

		JButton reButton = new JButton("다시");
		btnsPanel.add(reButton); // reButton Button을 btnsPanel에 첨가
		
		JButton rightButton = new JButton("알맞음");
		btnsPanel.add(rightButton); // rightButton Button을 btnsPanel에 첨가
		
		JButton easyButton = new JButton("쉬움");
		btnsPanel.add(easyButton); // easyButton Button을 btnsPanel에 첨가
		
		///// MENU BAR /////

		JMenuBar mb = new JMenuBar(); // 메뉴바 생성 
		JMenu fileMenu = new JMenu("File"); // File 이라는 이름의 메뉴 생성
		JMenu optionMenu = new JMenu("Option"); // Option 이라는 이름의 메뉴 생성
		mb.add(fileMenu);
		mb.add(optionMenu);
		this.setJMenuBar(mb); // Main Frame에 메뉴바 붙임

	}

	public static void main(String[] args) {
		new Card();
	}

}

