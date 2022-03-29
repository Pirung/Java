package vending;
//====================================================================================

//최초 작성자: 20204005 김필중
//최초 작성일: 21년 11월 25일
//클래스 목적: 자판기 프로그램의 관리자 음료수 설정 클래스
//저작권: 20204005 김필중
//====================================================================================

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// 음료수 클래스 설정
public class Admin_Drink extends JFrame {

	// 생성자 선언
	public Admin_Drink(String ppww) {
		JPanel Beverage = new JPanel(new GridLayout(3, 3)); // 패널 3*3 설정
		Beverage.setPreferredSize(new Dimension(450, 400)); // 패널 크기 설정
		Beverage.setForeground(new Color(0, 0, 0)); // 패널 위치 설정
		Beverage.setBackground(new Color(255, 255, 255)); // 패널 배경화면 설정

		// 패널 1번은 1번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_1 = new JPanel();
		JLabel DrinkLabel_1 = new JLabel(Drink_Array.DrinkL.get(0).getDrinkPrice() + "원");
		JButton DrinkButton_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_1_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_1_1_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_1.add(new JLabel(new ImageIcon(1 + ".png")));
		DrinkButton_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1.setBackground(new Color(255, 255, 255));
		DrinkButton_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1_1.setBackground(new Color(255, 255, 255));
		DrinkButton_1_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_1.add(DrinkLabel_1);
		DrinkNumber_1.add(DrinkButton_1);
		DrinkNumber_1.add(DrinkButton_1_1);
		DrinkNumber_1.add(DrinkButton_1_1_1);
		Beverage.add(DrinkNumber_1);
		DrinkNumber_1.setBackground(new Color(236, 251, 255));

		// 패널 2번은 2번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_2 = new JPanel();
		JLabel DrinkLabel_2 = new JLabel(Drink_Array.DrinkL.get(1).getDrinkPrice() + "원");
		JButton DrinkButton_2 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_2_1 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_2_1_1 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_2.add(new JLabel(new ImageIcon(2 + ".png")));
		DrinkButton_2.setForeground(new Color(0, 0, 255));
		DrinkButton_2.setBackground(new Color(255, 255, 255));
		DrinkButton_2_1.setForeground(new Color(0, 0, 255));
		DrinkButton_2_1.setBackground(new Color(255, 255, 255));
		DrinkButton_2_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_2_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_2.add(DrinkLabel_2);
		DrinkNumber_2.add(DrinkButton_2);
		DrinkNumber_2.add(DrinkButton_2_1);
		DrinkNumber_2.add(DrinkButton_2_1_1);
		Beverage.add(DrinkNumber_2);
		DrinkNumber_2.setBackground(new Color(236, 251, 255));

		// 패널 3번은 3번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_3 = new JPanel();
		JLabel DrinkLabel_3 = new JLabel(Drink_Array.DrinkL.get(2).getDrinkPrice() + "원");
		JButton DrinkButton_3 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_3_1 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_3_1_1 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_3.add(new JLabel(new ImageIcon(3 + ".png")));
		DrinkButton_3.setForeground(new Color(0, 0, 255));
		DrinkButton_3.setBackground(new Color(255, 255, 255));
		DrinkButton_3_1.setForeground(new Color(0, 0, 255));
		DrinkButton_3_1.setBackground(new Color(255, 255, 255));
		DrinkButton_3_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_3_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_3.add(DrinkLabel_3);
		DrinkNumber_3.add(DrinkButton_3);
		DrinkNumber_3.add(DrinkButton_3_1);
		DrinkNumber_3.add(DrinkButton_3_1_1);
		Beverage.add(DrinkNumber_3);
		DrinkNumber_3.setBackground(new Color(236, 251, 255));

		// 패널 4번은 4번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_4 = new JPanel();
		JLabel DrinkLabel_4 = new JLabel(Drink_Array.DrinkL.get(3).getDrinkPrice() + "원");
		JButton DrinkButton_4 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_4_1 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_4_1_1 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_4.add(new JLabel(new ImageIcon(4 + ".png")));
		DrinkButton_4.setForeground(new Color(0, 0, 255));
		DrinkButton_4.setBackground(new Color(255, 255, 255));
		DrinkButton_4_1.setForeground(new Color(0, 0, 255));
		DrinkButton_4_1.setBackground(new Color(255, 255, 255));
		DrinkButton_4_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_4_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_4.add(DrinkLabel_4);
		DrinkNumber_4.add(DrinkButton_4);
		DrinkNumber_4.add(DrinkButton_4_1);
		DrinkNumber_4.add(DrinkButton_4_1_1);
		Beverage.add(DrinkNumber_4);
		DrinkNumber_4.setBackground(new Color(236, 251, 255));

		// 패널 5번은 5번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_5 = new JPanel();
		JLabel DrinkLabel_5 = new JLabel(Drink_Array.DrinkL.get(4).getDrinkPrice() + "원");
		JButton DrinkButton_5 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_5_1 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_5_1_1 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_5.add(new JLabel(new ImageIcon(5 + ".png")));
		DrinkButton_5.setForeground(new Color(0, 0, 255));
		DrinkButton_5.setBackground(new Color(255, 255, 255));
		DrinkButton_5_1.setForeground(new Color(0, 0, 255));
		DrinkButton_5_1.setBackground(new Color(255, 255, 255));
		DrinkButton_5_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_5_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_5.add(DrinkLabel_5);
		DrinkNumber_5.add(DrinkButton_5);
		DrinkNumber_5.add(DrinkButton_5_1);
		DrinkNumber_5.add(DrinkButton_5_1_1);
		Beverage.add(DrinkNumber_5);
		DrinkNumber_5.setBackground(new Color(236, 251, 255));

		// 패널 6번은 6번 음료에 관한 선언(음료 이름, 가격, 사진 등)
		JPanel DrinkNumber_6 = new JPanel();
		JLabel DrinkLabel_6 = new JLabel(Drink_Array.DrinkL.get(5).getDrinkPrice() + "원");
		JButton DrinkButton_6 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " 추가"); // 음료 추가 버튼 설정
		JButton DrinkButton_6_1 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " 가격 변경"); // 가격 변경 버튼 설정
		JButton DrinkButton_6_1_1 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " 이름 변경"); // 이름 변경 버튼 설정
		DrinkNumber_6.add(new JLabel(new ImageIcon(6 + ".png")));
		DrinkButton_6.setForeground(new Color(0, 0, 255));
		DrinkButton_6.setBackground(new Color(255, 255, 255));
		DrinkButton_6_1.setForeground(new Color(0, 0, 255));
		DrinkButton_6_1.setBackground(new Color(255, 255, 255));
		DrinkButton_6_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_6_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_6.add(DrinkLabel_6);
		DrinkNumber_6.add(DrinkButton_6);
		DrinkNumber_6.add(DrinkButton_6_1);
		DrinkNumber_6.add(DrinkButton_6_1_1);
		Beverage.add(DrinkNumber_6);
		DrinkNumber_6.setBackground(new Color(236, 251, 255));

		// 종료 버튼 설정
		JButton ENDButton = new JButton("종료");
		ENDButton.setBounds(1, 1, 1, 1);
		ENDButton.setForeground(new Color(0, 0, 255));
		ENDButton.setBackground(new Color(255, 255, 255));
		Beverage.add(ENDButton);

		Beverage.setBackground(new Color(236, 251, 255));
		this.setContentPane(Beverage);
		setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// ========================================================================
		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(0).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(0).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(0);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(0);
			}
		});

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(1).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(1).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(1);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(1);
			}
		});

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(2).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(2).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(2);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(2);
			}
		});

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(3).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(3).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(3);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(3);
			}
		});

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(4).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(4).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(4);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(4);
			}
		});

		// 음료 추가 버튼을 누를시 발생하는 이벤트, 개수를 1개씩 추가함
		DrinkButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(5).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(5).getDrinkName() + " 1개를 추가했습니다");
			}
		});

		// 음료 가격 변경 버튼을 누를시 가격 변경 메소드 호출
		DrinkButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(5);
			}
		});

		// 음료 이름 변경 버튼을 누를시 이름 변경 메소드 호출
		DrinkButton_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(5);
			}
		});

		// 종료 버튼 설정
		ENDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Admin_Setting(ppww);
				dispose();
			}
		});

	}

}
