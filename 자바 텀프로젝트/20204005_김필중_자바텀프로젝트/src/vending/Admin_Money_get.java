package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 11월 26일
//클래스 목적: 자판기 프로그램의 어드민 수금 클래스
//저작권: 20204005 김필중
//====================================================================================
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

// 클래스 선언
public class Admin_Money_get extends JDialog {
	private JLabel getlist = new JLabel("수금"); // 수금 이름
	// 각 동전의 라벨들 선언
	private JLabel get10;
	private JLabel get50;
	private JLabel get100;
	private JLabel get500;
	private JLabel get1000;
	private JButton Cok = new JButton("Go"); // 확일ㄴ 버튼

	// 생성자 선언
	public Admin_Money_get(Frame frame, String title) {
		// 기본 설정
		super(frame, title);
		setLayout(null);
		int num_10;
		int num_50;
		int num_100;
		int num_500;
		int num_1000;

		// 만약 10원 동전이 5개 이하라면 0 표시
		if (Money_Array.MoneyL.get(0).getMoneynumber() <= 5) {
			get10 = new JLabel("  10원 : 0개");
			// 5개를 뺀 나머지를 표시
		} else {
			num_10 = Money_Array.MoneyL.get(0).getMoneynumber() - 5;
			get10 = new JLabel("  10원 : " + num_10 + "개");
			Money_Array.MoneyL.get(0).setnum(Money_Array.MoneyL.get(0).getMoneynumber() - num_10);
		}

		// 만약 50원 동전이 5개 이하라면 0 표시
		if (Money_Array.MoneyL.get(1).getMoneynumber() <= 5) {
			get50 = new JLabel("  50원 : 0개");
			// 5개를 뺀 나머지를 표시
		} else {
			num_50 = Money_Array.MoneyL.get(1).getMoneynumber() - 5;
			get50 = new JLabel("  50원 : " + num_50 + "개");
			Money_Array.MoneyL.get(1).setnum(Money_Array.MoneyL.get(1).getMoneynumber() - num_50);
		}

		// 만약 100원 동전이 5개 이하라면 0 표시
		if (Money_Array.MoneyL.get(2).getMoneynumber() <= 5) {
			get100 = new JLabel(" 100원 : 0개");
			// 5개를 뺀 나머지를 표시
		} else {
			num_100 = Money_Array.MoneyL.get(2).getMoneynumber() - 5;
			get100 = new JLabel(" 100원 : " + num_100 + "개");
			Money_Array.MoneyL.get(2).setnum(Money_Array.MoneyL.get(2).getMoneynumber() - num_100);
		}

		// 만약 500원 동전이 5개 이하라면 0 표시
		if (Money_Array.MoneyL.get(3).getMoneynumber() <= 5) {
			get500 = new JLabel(" 500원 : 0개");
			// 5개를 뺀 나머지를 표시
		} else {
			num_500 = Money_Array.MoneyL.get(3).getMoneynumber() - 5;
			get500 = new JLabel(" 500원 : " + num_500 + "개");
			Money_Array.MoneyL.get(3).setnum(Money_Array.MoneyL.get(3).getMoneynumber() - num_500);
		}

		// 만약 1000원 동전이 5개 이하라면 0 표시
		if (Money_Array.MoneyL.get(4).getMoneynumber() <= 5) {
			get1000 = new JLabel("1000원 : 0개");
			// 5개를 뺀 나머지를 표시
		} else {
			num_1000 = Money_Array.MoneyL.get(4).getMoneynumber() - 5;
			get1000 = new JLabel("1000원 : " + num_1000 + "개");
			Money_Array.MoneyL.get(4).setnum(Money_Array.MoneyL.get(4).getMoneynumber() - num_1000);
		}

		Cok.setForeground(Color.WHITE);
		Cok.setBackground(Color.BLACK);

		getlist.setBounds(30, 10, 140, 30);
		get10.setBounds(40, 50, 80, 20);
		get50.setBounds(40, 80, 80, 20);
		get100.setBounds(40, 110, 80, 20);
		get500.setBounds(40, 140, 80, 20);
		get1000.setBounds(40, 170, 80, 20);
		Cok.setBounds(100, 200, 60, 30);

		add(getlist);
		add(get10);
		add(get50);
		add(get100);
		add(get500);
		add(get1000);
		add(Cok);

		setBounds(500, 200, 180, 270);

		Cok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(4).Moneyextraction(Money_Array.MoneyL.get(4).getMoneynumber() - 5);
				Money_Array.MoneyL.get(3).Moneyextraction(Money_Array.MoneyL.get(3).getMoneynumber() - 5);
				Money_Array.MoneyL.get(2).Moneyextraction(Money_Array.MoneyL.get(2).getMoneynumber() - 5);
				Money_Array.MoneyL.get(1).Moneyextraction(Money_Array.MoneyL.get(1).getMoneynumber() - 5);
				Money_Array.MoneyL.get(0).Moneyextraction(Money_Array.MoneyL.get(0).getMoneynumber() - 5);
				setVisible(false);
			}
		});
	}

}
