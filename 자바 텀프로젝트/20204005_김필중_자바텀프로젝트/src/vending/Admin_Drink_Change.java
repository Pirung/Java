package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 11월 24일
//클래스 목적: 자판기 프로그램의 음료수 이름 변경 클래스
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

// 이름 변경 클래스
public class Admin_Drink_Change extends JFrame {

	private JPanel Change = new JPanel(new GridLayout(3, 2)); // 3*2로 설정
	private JLabel ChangeL = new JLabel("바꿀 이름"); // 라벨 설정
	private JTextField ChangeN = new JTextField(); // 입력칸 설정
	private JButton ChangeB = new JButton("변경");// 변경 버튼 설정

	// 생성자 선언
	public Admin_Drink_Change(int n) {
		// 추가
		this.setContentPane(Change);
		Change.add(ChangeL);
		Change.add(ChangeN);
		Change.add(ChangeB);

		// 라벨 가운데 정렬
		ChangeL.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // 크기 설정
		this.setLocationRelativeTo(null); // 위치 설정
		this.setVisible(true); // 화면에 보이게
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x버튼 누를시 종료

		// 버튼 누르면 입력한 이름으로 변경
		ChangeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = ChangeN.getText().trim();
				Drink_Array.DrinkL.get(n).setName(b);
				JOptionPane.showMessageDialog(null, "이름이 " + b + " 로 변경되었습니다");
				dispose();
			}
		});
	}

}
