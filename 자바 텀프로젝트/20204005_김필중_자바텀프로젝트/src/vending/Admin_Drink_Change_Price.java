package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 11월 20일
//클래스 목적: 자판기 프로그램의 판넬 담당 클래스
//저작권: 20204005 김필중
//====================================================================================

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// 음료 이름 변경 클래스
public class Admin_Drink_Change_Price extends JFrame {

	// 필요한 변수 선언
	private JPanel Change = new JPanel(new GridLayout(3, 2)); // 패널 설정
	private JLabel ChangeL = new JLabel("바꿀 금액"); // 라벨 설정
	private JTextField ChangeN = new JTextField(); // 표시 부분 설정
	private JButton ChangeB = new JButton("변경"); // 버튼 설정

	// 생성자 선언
	public Admin_Drink_Change_Price(int n) {
		this.setContentPane(Change);
		Change.add(ChangeL);
		Change.add(ChangeN);
		Change.add(ChangeB);

		// 라벨 가운데 정렬
		ChangeL.setHorizontalAlignment(NORMAL);

		// 현재 프레임 창 가운데 정렬 setSize를 먼저 해주어야 정상적으로 프레임이 가운데 정렬이 된다
		setSize(350, 150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// 버튼을 누를경우 변경
		ChangeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = ChangeN.getText().trim();
				int num = Integer.parseInt(b);
				Drink_Array.DrinkL.get(n).setPrice(num);
				JOptionPane.showMessageDialog(null, "음료의 가격이 " + num + "원으로 변경되었습니다");
				dispose();
			}
		});
	}
}
