package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 11�� 26��
//Ŭ���� ����: ���Ǳ� ���α׷��� ���� ���� Ŭ����
//���۱�: 20204005 ������
//====================================================================================
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

// Ŭ���� ����
public class Admin_Money_get extends JDialog {
	private JLabel getlist = new JLabel("����"); // ���� �̸�
	// �� ������ �󺧵� ����
	private JLabel get10;
	private JLabel get50;
	private JLabel get100;
	private JLabel get500;
	private JLabel get1000;
	private JButton Cok = new JButton("Go"); // Ȯ�Ϥ� ��ư

	// ������ ����
	public Admin_Money_get(Frame frame, String title) {
		// �⺻ ����
		super(frame, title);
		setLayout(null);
		int num_10;
		int num_50;
		int num_100;
		int num_500;
		int num_1000;

		// ���� 10�� ������ 5�� ���϶�� 0 ǥ��
		if (Money_Array.MoneyL.get(0).getMoneynumber() <= 5) {
			get10 = new JLabel("  10�� : 0��");
			// 5���� �� �������� ǥ��
		} else {
			num_10 = Money_Array.MoneyL.get(0).getMoneynumber() - 5;
			get10 = new JLabel("  10�� : " + num_10 + "��");
			Money_Array.MoneyL.get(0).setnum(Money_Array.MoneyL.get(0).getMoneynumber() - num_10);
		}

		// ���� 50�� ������ 5�� ���϶�� 0 ǥ��
		if (Money_Array.MoneyL.get(1).getMoneynumber() <= 5) {
			get50 = new JLabel("  50�� : 0��");
			// 5���� �� �������� ǥ��
		} else {
			num_50 = Money_Array.MoneyL.get(1).getMoneynumber() - 5;
			get50 = new JLabel("  50�� : " + num_50 + "��");
			Money_Array.MoneyL.get(1).setnum(Money_Array.MoneyL.get(1).getMoneynumber() - num_50);
		}

		// ���� 100�� ������ 5�� ���϶�� 0 ǥ��
		if (Money_Array.MoneyL.get(2).getMoneynumber() <= 5) {
			get100 = new JLabel(" 100�� : 0��");
			// 5���� �� �������� ǥ��
		} else {
			num_100 = Money_Array.MoneyL.get(2).getMoneynumber() - 5;
			get100 = new JLabel(" 100�� : " + num_100 + "��");
			Money_Array.MoneyL.get(2).setnum(Money_Array.MoneyL.get(2).getMoneynumber() - num_100);
		}

		// ���� 500�� ������ 5�� ���϶�� 0 ǥ��
		if (Money_Array.MoneyL.get(3).getMoneynumber() <= 5) {
			get500 = new JLabel(" 500�� : 0��");
			// 5���� �� �������� ǥ��
		} else {
			num_500 = Money_Array.MoneyL.get(3).getMoneynumber() - 5;
			get500 = new JLabel(" 500�� : " + num_500 + "��");
			Money_Array.MoneyL.get(3).setnum(Money_Array.MoneyL.get(3).getMoneynumber() - num_500);
		}

		// ���� 1000�� ������ 5�� ���϶�� 0 ǥ��
		if (Money_Array.MoneyL.get(4).getMoneynumber() <= 5) {
			get1000 = new JLabel("1000�� : 0��");
			// 5���� �� �������� ǥ��
		} else {
			num_1000 = Money_Array.MoneyL.get(4).getMoneynumber() - 5;
			get1000 = new JLabel("1000�� : " + num_1000 + "��");
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
