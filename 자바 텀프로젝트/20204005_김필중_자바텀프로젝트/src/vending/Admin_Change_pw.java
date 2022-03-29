package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 10�� 30��
//Ŭ���� ����: ���Ǳ� ���α׷��� ��й�ȣ ���� Ŭ����
//���۱�: 20204005 ������
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

// ��й�ȣ ���� ���� jframe ���
public class Admin_Change_pw extends JFrame {

	private JPanel loginPanel = new JPanel(new GridLayout(4, 2)); // �г� 4*2�� ����
	private JLabel pwLabel = new JLabel("�ٲ� ��й�ȣ "); // �ٲ� ��й�ȣ �� ����
	private JPasswordField pwText = new JPasswordField(); // ��й�ȣ �Է� ����
	private JButton loginBtn = new JButton("����"); // ���� ��ư ����
	JButton end = new JButton("����"); // ���� ��ư ����

	// ������ ����
	public Admin_Change_pw(String ppww) {
		// �гο� �߰�
		this.setContentPane(loginPanel);
		loginPanel.add(pwLabel);
		loginPanel.add(pwText);
		loginPanel.add(loginBtn);
		loginPanel.add(end);
		pwLabel.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // ������ ����
		this.setLocationRelativeTo(null); // ��ġ ����
		this.setVisible(true); // ȭ�鿡 ǥ��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x��ư ������ ����

		// �α��� ��ư ����
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ��й�ȣ ���� ����
				String pw = pwText.getText().trim();

				// �Է� ������ ������ ����
				if (pw.length() == 0) {
					JOptionPane.showMessageDialog(null, "�ٲ� ��й�ȣ�� �Է� �ϼž� �˴ϴ�.", "����� �Է�!", JOptionPane.DEFAULT_OPTION);
					return;
				}

				// �ƴҰ��� ����
				else {
					JOptionPane.showMessageDialog(null, "��й�ȣ ������ �Ϸ�Ǿ����ϴ�", "���� ����!", JOptionPane.DEFAULT_OPTION);
					new Vending_Frame(pw);
					dispose();
					return;
				}
			}
		});

		// ���� ��ư �������� ����
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Frame(ppww);
				dispose();
			}
		});
	}

}
