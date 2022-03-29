package vending;

//====================================================================================
// ���� �ۼ���: 20204005 ������
// ���� �ۼ���: 21�� 10�� 27��
// Ŭ���� ����: ���Ǳ� ���α׷��� ������ ���
// ���۱�: 20204005 ������
//====================================================================================

// �ʿ��� ����Ʈ�ϱ�
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ���Ǳ� ���� ������ Ŭ���� ���� JFrame�� ���
class Vending_Frame extends JFrame {

	// ���Ǳ� ������ ������ ����(��й�ȣ�� �Է�)
	public Vending_Frame(String ppww) {
		// ���� �����Ҵ��� ���ش�
		Money_Array.MoneyL.add(new Vending_Money("10��", 10, 5));
		Money_Array.MoneyL.add(new Vending_Money("50��", 50, 5));
		Money_Array.MoneyL.add(new Vending_Money("100��", 100, 5));
		Money_Array.MoneyL.add(new Vending_Money("500��", 500, 5));
		Money_Array.MoneyL.add(new Vending_Money("1000��", 1000, 5));

		// ���Ḧ �����Ҵ��� ���ش�
		Drink_Array.DrinkL.add(new Vending_Drink("��", 450, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("Ŀ��", 500, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("�̿�����", 550, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("���Ŀ��", 700, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("ź������", 750, 3));
		Drink_Array.DrinkL.add(new Vending_Drink("�������", 1000, 3));

		setTitle("���Ǳ�"); // ������ �̸��� �����Ѵ�
		setPreferredSize(new Dimension(650, 600)); // ũ�⸦ �����Ѵ�
		setLocationRelativeTo(null); // â�� ����� �ߵ��� ��
		setLocation(300, 300); // ��ġ�� �����Ѵ�
		setDefaultCloseOperation(EXIT_ON_CLOSE); // â�� ���� ���α׷��� ����
		setVisible(true); // â�� ���� ���̵��� ��
		setSize(640, 480); // ������� 640*480
		setResizable(false); // ������ ������ �Ұ���

		Container contentPanel = getContentPane(); // contentPanel�� Container�� getContentPane�� �Ѵ�

		JPanel Panel1 = new Vending_Machine_Panel1(); // �ǳ��� �����Ѵ�

		contentPanel.add(Panel1, BorderLayout.CENTER); // contentPanel�� �ǳ��� �߰��Ѵ�

		JPanel Panel2 = new JPanel(); // �ǳ��� �����Ѵ�
		JButton click = new JButton("������ �α���"); // ��ư �α����� �����
		Panel2.add(click); // ��ư�� �߰��Ѵ�
		click.setPreferredSize(new Dimension(150, 100)); // ũ�⸦ �����Ѵ�
		Panel2.setBackground(new Color(216, 141, 186)); // ����� �����Ѵ�
		contentPanel.add(Panel2, BorderLayout.SOUTH); // �ǳ��� �߰��Ѵ�

		// ������ �α��� Ŭ����
		click.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Admin_Login(ppww); // ������ �α��� Ŭ���� ȣ��
				dispose(); // ȭ�� ����
			}
		});

		setVisible(true); // ȭ�� ���
		pack();

	}

}

// ���� Ŭ����
public class Main_Vending_Machine {

	public static void main(String[] args) {
		new Vending_Frame("q1w2e3r4!@"); // asd�� ������ ȣ��
	}

}
