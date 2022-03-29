package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 10월 30일
//클래스 목적: 자판기 프로그램의 비밀번호 변경 클래스
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
import javax.swing.JPasswordField;

// 비밀번호 변경 설정 jframe 상속
public class Admin_Change_pw extends JFrame {

	private JPanel loginPanel = new JPanel(new GridLayout(4, 2)); // 패널 4*2로 설정
	private JLabel pwLabel = new JLabel("바꿀 비밀번호 "); // 바꿀 비밀번호 라벨 설정
	private JPasswordField pwText = new JPasswordField(); // 비밀번호 입력 설정
	private JButton loginBtn = new JButton("변경"); // 변경 버튼 설정
	JButton end = new JButton("종료"); // 종료 버튼 설정

	// 생성자 선언
	public Admin_Change_pw(String ppww) {
		// 패널에 추가
		this.setContentPane(loginPanel);
		loginPanel.add(pwLabel);
		loginPanel.add(pwText);
		loginPanel.add(loginBtn);
		loginPanel.add(end);
		pwLabel.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // 사이즈 설정
		this.setLocationRelativeTo(null); // 위치 설정
		this.setVisible(true); // 화면에 표시
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x버튼 누르면 종료

		// 로그인 버튼 설정
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 비밀번호 변수 설정
				String pw = pwText.getText().trim();

				// 입력 변수가 없으면 오류
				if (pw.length() == 0) {
					JOptionPane.showMessageDialog(null, "바꿀 비밀번호를 입력 하셔야 됩니다.", "비번을 입력!", JOptionPane.DEFAULT_OPTION);
					return;
				}

				// 아닐경우는 변경
				else {
					JOptionPane.showMessageDialog(null, "비밀번호 변경이 완료되었습니다", "변경 성공!", JOptionPane.DEFAULT_OPTION);
					new Vending_Frame(pw);
					dispose();
					return;
				}
			}
		});

		// 종료 버튼 누르르시 종료
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Frame(ppww);
				dispose();
			}
		});
	}

}
