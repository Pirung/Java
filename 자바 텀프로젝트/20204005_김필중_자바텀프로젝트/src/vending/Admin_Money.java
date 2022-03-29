package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 11월 23일
//클래스 목적: 자판기 프로그램의 관리자 돈 설정 클래스
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

// 클래스 선언
public class Admin_Money extends JFrame {

	// 생성자 선언
	public Admin_Money(String ppww) {
		JPanel M = new JPanel(new GridLayout(2, 3)); // 2*3 설정
		// 사이즈. 색상 설정
		M.setPreferredSize(new Dimension(450, 400));
		M.setForeground(new Color(0, 0, 0));
		M.setBackground(new Color(255, 255, 255));

		// ==========================================================
		// 동전에 관한 gui 설정 부분
		JPanel Money_Number_1 = new JPanel();
		JLabel Money_Label_1 = new JLabel(Money_Array.MoneyL.get(0).getMoneyname());
		JButton MoneyButton_1 = new JButton(Money_Array.MoneyL.get(0).getMoneyname() + " 추가");
		Money_Number_1.add(new JLabel(new ImageIcon(7 + ".png")));
		MoneyButton_1.setForeground(new Color(0, 0, 255));
		MoneyButton_1.setBackground(new Color(255, 255, 255));
		Money_Number_1.add(Money_Label_1);
		Money_Number_1.add(MoneyButton_1);
		M.add(Money_Number_1);
		Money_Number_1.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_2 = new JPanel();
		JLabel Money_Label_2 = new JLabel(Money_Array.MoneyL.get(1).getMoneyname());
		JButton MoneyButton_2 = new JButton(Money_Array.MoneyL.get(1).getMoneyname() + " 추가");
		Money_Number_2.add(new JLabel(new ImageIcon(8 + ".png")));
		MoneyButton_2.setForeground(new Color(0, 0, 255));
		MoneyButton_2.setBackground(new Color(255, 255, 255));
		Money_Number_2.add(Money_Label_2);
		Money_Number_2.add(MoneyButton_2);
		M.add(Money_Number_2);
		Money_Number_2.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_3 = new JPanel();
		JLabel Money_Label_3 = new JLabel(Money_Array.MoneyL.get(2).getMoneyname());
		JButton MoneyButton_3 = new JButton(Money_Array.MoneyL.get(2).getMoneyname() + " 추가");
		Money_Number_3.add(new JLabel(new ImageIcon(9 + ".png")));
		MoneyButton_3.setForeground(new Color(0, 0, 255));
		MoneyButton_3.setBackground(new Color(255, 255, 255));
		Money_Number_3.add(Money_Label_3);
		Money_Number_3.add(MoneyButton_3);
		M.add(Money_Number_3);
		Money_Number_3.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_4 = new JPanel();
		JLabel Money_Label_4 = new JLabel(Money_Array.MoneyL.get(3).getMoneyname());
		JButton MoneyButton_4 = new JButton(Money_Array.MoneyL.get(3).getMoneyname() + " 추가");
		Money_Number_4.add(new JLabel(new ImageIcon(10 + ".png")));
		MoneyButton_4.setForeground(new Color(0, 0, 255));
		MoneyButton_4.setBackground(new Color(255, 255, 255));
		Money_Number_4.add(Money_Label_4);
		Money_Number_4.add(MoneyButton_4);
		M.add(Money_Number_4);
		Money_Number_4.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_5 = new JPanel();
		JLabel Money_Label_5 = new JLabel(Money_Array.MoneyL.get(4).getMoneyname());
		JButton MoneyButton_5 = new JButton(Money_Array.MoneyL.get(4).getMoneyname() + " 추가");
		Money_Number_5.add(new JLabel(new ImageIcon(7 + ".png")));
		MoneyButton_5.setForeground(new Color(0, 0, 255));
		MoneyButton_5.setBackground(new Color(255, 255, 255));
		Money_Number_5.add(Money_Label_5);
		Money_Number_5.add(MoneyButton_5);
		M.add(Money_Number_5);
		Money_Number_5.setBackground(new Color(236, 251, 255));
		// ==========================================================

		// 종료 버튼 설정
		JButton ENDButton = new JButton("종료");
		ENDButton.setBounds(1, 1, 1, 1);
		ENDButton.setForeground(new Color(0, 0, 255));
		ENDButton.setBackground(new Color(255, 255, 255));
		M.add(ENDButton);

		// 색상 설정과 기본 gui 설정
		M.setBackground(new Color(236, 251, 255));
		this.setContentPane(M);
		setSize(400, 450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// ========================================================================
		// 동전 추가 버튼 설정

		MoneyButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(0).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "10원 1개를 추가했습니다");
			}
		});

		MoneyButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(1).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "50원 1개를 추가했습니다");
			}
		});

		MoneyButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(2).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "100원 1개를 추가했습니다");
			}
		});

		MoneyButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(3).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "500원 1개를 추가했습니다");
			}
		});

		MoneyButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(4).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "1000원 1개를 추가했습니다");
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
