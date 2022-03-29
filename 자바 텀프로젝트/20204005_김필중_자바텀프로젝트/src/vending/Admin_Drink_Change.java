package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 11�� 24��
//Ŭ���� ����: ���Ǳ� ���α׷��� ����� �̸� ���� Ŭ����
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
import javax.swing.JTextField;

// �̸� ���� Ŭ����
public class Admin_Drink_Change extends JFrame {

	private JPanel Change = new JPanel(new GridLayout(3, 2)); // 3*2�� ����
	private JLabel ChangeL = new JLabel("�ٲ� �̸�"); // �� ����
	private JTextField ChangeN = new JTextField(); // �Է�ĭ ����
	private JButton ChangeB = new JButton("����");// ���� ��ư ����

	// ������ ����
	public Admin_Drink_Change(int n) {
		// �߰�
		this.setContentPane(Change);
		Change.add(ChangeL);
		Change.add(ChangeN);
		Change.add(ChangeB);

		// �� ��� ����
		ChangeL.setHorizontalAlignment(NORMAL);

		setSize(350, 150); // ũ�� ����
		this.setLocationRelativeTo(null); // ��ġ ����
		this.setVisible(true); // ȭ�鿡 ���̰�
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // x��ư ������ ����

		// ��ư ������ �Է��� �̸����� ����
		ChangeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = ChangeN.getText().trim();
				Drink_Array.DrinkL.get(n).setName(b);
				JOptionPane.showMessageDialog(null, "�̸��� " + b + " �� ����Ǿ����ϴ�");
				dispose();
			}
		});
	}

}
