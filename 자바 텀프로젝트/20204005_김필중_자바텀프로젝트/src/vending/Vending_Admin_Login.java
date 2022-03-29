package vending;
//====================================================================================

//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 10�� 30��
//Ŭ���� ����: ���Ǳ� ���α׷��� ���� �α��� Ŭ����
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

// �α��� Ŭ����
public class Vending_Admin_Login extends JFrame {

	private JPanel loginPanel = new JPanel(new GridLayout(4, 2)); // �α��� �г��� 4*2�� �ʱ�ȭ
	private JLabel pwLabel = new JLabel("��й�ȣ "); // ��й�ȣ �� �߰�
	private JPasswordField pwText = new JPasswordField(); // ��й�ȣ �Է��ϴ� ĭ�� �߰�
	private JButton loginBtn = new JButton("�α���"); // �α��� ��ư �߰�
	JButton end = new JButton("����"); // ���� ��ư �߰�

	// ������ ����
	public Vending_Admin_Login(String ppww) {
		this.setContentPane(loginPanel); // ������Ʈ�� ���δ�
		// �гο� �߰��Ѵ�
		loginPanel.add(pwLabel);
		loginPanel.add(pwText);
		loginPanel.add(loginBtn);
		loginPanel.add(end);
		// ���� ����� �����Ѵ�
		pwLabel.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // ũ�� ����
		this.setLocationRelativeTo(null); // ��ġ ����
		this.setVisible(true); // ȭ�鿡 ǥ��
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x��ư ������ ������ �Ѵ�

		// �α��� ��ư�� ������
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ��� Ȯ�� �׽�Ʈ �ڵ�
				String pw = pwText.getText().trim();

				// ���� �ƹ��͵� �Է��� �ȵǸ� ����
				if (pw.length() == 0) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �Է� �ϼž� �˴ϴ�.", "����� �Է�!", JOptionPane.DEFAULT_OPTION);
					return;
				}

				// ������ ���� �г� ȣ��
				if (pw.equals(ppww)) {
					JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
					new Vending_Admin_Setting(ppww);
					dispose();
					return;
				}
				// �ƴ� ���� ����
				JOptionPane.showMessageDialog(null, "�α��� ����", "�α��� Ȯ��!", JOptionPane.DEFAULT_OPTION);
			}
		});

		// ���� ��ư�� �׳� ����
		end.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Frame(ppww);
				dispose();
			}
		});
	}
}
