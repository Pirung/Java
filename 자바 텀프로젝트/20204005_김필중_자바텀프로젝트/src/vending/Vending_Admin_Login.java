package vending;
//====================================================================================

//최초 작성자: 20204005 김필중
//최초 작성일: 21년 10월 30일
//클래스 목적: 자판기 프로그램의 어드민 로그인 클래스
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

// 로그인 클래스
public class Vending_Admin_Login extends JFrame {

	private JPanel loginPanel = new JPanel(new GridLayout(4, 2)); // 로그인 패널을 4*2로 초기화
	private JLabel pwLabel = new JLabel("비밀번호 "); // 비밀번호 라벨 추가
	private JPasswordField pwText = new JPasswordField(); // 비밀번호 입력하는 칸을 추가
	private JButton loginBtn = new JButton("로그인"); // 로그인 버튼 추가
	JButton end = new JButton("종료"); // 종료 버튼 추가

	// 생성자 선언
	public Vending_Admin_Login(String ppww) {
		this.setContentPane(loginPanel); // 컴포넌트를 붙인다
		// 패널에 추가한다
		loginPanel.add(pwLabel);
		loginPanel.add(pwText);
		loginPanel.add(loginBtn);
		loginPanel.add(end);
		// 라벨을 가운데로 설정한다
		pwLabel.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // 크기 설정
		this.setLocationRelativeTo(null); // 위치 설정
		this.setVisible(true); // 화면에 표시
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x버튼 누르면 꺼지게 한다

		// 로그인 버튼을 누르면
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 비번 확인 테스트 코드
				String pw = pwText.getText().trim();

				// 만약 아무것도 입력이 안되면 리턴
				if (pw.length() == 0) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력 하셔야 됩니다.", "비번을 입력!", JOptionPane.DEFAULT_OPTION);
					return;
				}

				// 같으면 어드민 패널 호출
				if (pw.equals(ppww)) {
					JOptionPane.showMessageDialog(null, "로그인 성공", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
					new Vending_Admin_Setting(ppww);
					dispose();
					return;
				}
				// 아닐 경우는 실패
				JOptionPane.showMessageDialog(null, "로그인 실패", "로그인 확인!", JOptionPane.DEFAULT_OPTION);
			}
		});

		// 종료 버튼은 그냥 끊다
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Frame(ppww);
				dispose();
			}
		});
	}
}
