package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 11�� 20��
//Ŭ���� ����: ���Ǳ� ���α׷��� �ǳ� ��� Ŭ����
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

// ���� �̸� ���� Ŭ����
public class Admin_Drink_Change_Price extends JFrame {

	// �ʿ��� ���� ����
	private JPanel Change = new JPanel(new GridLayout(3, 2)); // �г� ����
	private JLabel ChangeL = new JLabel("�ٲ� �ݾ�"); // �� ����
	private JTextField ChangeN = new JTextField(); // ǥ�� �κ� ����
	private JButton ChangeB = new JButton("����"); // ��ư ����

	// ������ ����
	public Admin_Drink_Change_Price(int n) {
		this.setContentPane(Change);
		Change.add(ChangeL);
		Change.add(ChangeN);
		Change.add(ChangeB);

		// �� ��� ����
		ChangeL.setHorizontalAlignment(NORMAL);

		// ���� ������ â ��� ���� setSize�� ���� ���־�� ���������� �������� ��� ������ �ȴ�
		setSize(350, 150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// ��ư�� ������� ����
		ChangeB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b = ChangeN.getText().trim();
				int num = Integer.parseInt(b);
				Drink_Array.DrinkL.get(n).setPrice(num);
				JOptionPane.showMessageDialog(null, "������ ������ " + num + "������ ����Ǿ����ϴ�");
				dispose();
			}
		});
	}
}
