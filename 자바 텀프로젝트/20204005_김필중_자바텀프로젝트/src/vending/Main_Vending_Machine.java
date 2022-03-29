package vending;

//====================================================================================
// 최초 작성자: 20204005 김필중
// 최초 작성일: 21년 10월 27일
// 클래스 목적: 자판기 프로그램의 메인을 담당
// 저작권: 20204005 김필중
//====================================================================================

// 필요한 임포트하기
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 자판기 메인 프레임 클래스 선언 JFrame을 상속
class Vending_Frame extends JFrame {

	// 자판기 프레임 생성자 선언(비밀번호을 입력)
	public Vending_Frame(String ppww) {
		// 돈을 동적할당을 해준다
		Money_Array.MoneyL.add(new Vending_Money("10원", 10, 5));
		Money_Array.MoneyL.add(new Vending_Money("50원", 50, 5));
		Money_Array.MoneyL.add(new Vending_Money("100원", 100, 5));
		Money_Array.MoneyL.add(new Vending_Money("500원", 500, 5));
		Money_Array.MoneyL.add(new Vending_Money("1000원", 1000, 5));

		// 음료를 동적할당을 해준다
		Drink_Array.DrinkL.add(new Vending_Drink("물", 450, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("커피", 500, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("이온음료", 550, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("고급커피", 700, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("탄산음료", 750, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("비싼음료", 1000, 3));

		setTitle("자판기"); // 프레임 이름을 설정한다
		setPreferredSize(new Dimension(650, 600)); // 크기를 설정한다
		setLocationRelativeTo(null); // 창이 가운데에 뜨도록 함
		setLocation(300, 300); // 위치를 설정한다
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 창을 끄면 프로그램을 종료
		setVisible(true); // 창을 눈에 보이도록 함
		setSize(640, 480); // 사이즈는 640*480
		setResizable(false); // 사이즈 재조정 불가능

		Container contentPanel = getContentPane(); // contentPanel을 Container로 getContentPane을 한다

		JPanel Panel1 = new Vending_Machine_Panel1(); // 판넬을 선언한다

		contentPanel.add(Panel1, BorderLayout.CENTER); // contentPanel에 판넬을 추가한다

		JPanel Panel2 = new JPanel(); // 판넬을 선언한다
		JButton click = new JButton("관리자 로그인"); // 버튼 로그인을 만든다
		Panel2.add(click); // 버튼을 추가한다
		click.setPreferredSize(new Dimension(150, 100)); // 크기를 설정한다
		Panel2.setBackground(new Color(216, 141, 186)); // 배경을 설정한다
		contentPanel.add(Panel2, BorderLayout.SOUTH); // 판넬을 추가한다

		// 관리자 로그인 클릭시
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Admin_Login(ppww); // 관리자 로그인 클래스 호출
				dispose(); // 화면 종료
			}
		});

		setVisible(true); // 화면 출력
		pack();

	}

}

// 메인 클래스
public class Main_Vending_Machine {

	public static void main(String[] args) {
		new Vending_Frame("q1w2e3r4!@"); // asd로 프레임 호출
	}

}
