package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 11�� 23��
//Ŭ���� ����: ���Ǳ� ���α׷��� ������ �� ���� Ŭ����
//���۱�: 20204005 ������
//====================================================================================

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

// Ŭ���� ����
public class Admin_Money extends JFrame {

	// ������ ����
	public Admin_Money(String ppww) {
		JPanel M = new JPanel(new GridLayout(2, 3)); // 2*3 ����
		// ������. ���� ����
		M.setPreferredSize(new Dimension(450, 400));
		M.setForeground(new Color(0, 0, 0));
		M.setBackground(new Color(255, 255, 255));

		// ==========================================================
		// ������ ���� gui ���� �κ�
		JPanel Money_Number_1 = new JPanel();
		JLabel Money_Label_1 = new JLabel(Money_Array.MoneyL.get(0).getMoneyname());
		JButton MoneyButton_1 = new JButton(Money_Array.MoneyL.get(0).getMoneyname() + " �߰�");
		Money_Number_1.add(new JLabel(new ImageIcon(7 + ".png")));
		MoneyButton_1.setForeground(new Color(0, 0, 255));
		MoneyButton_1.setBackground(new Color(255, 255, 255));
		Money_Number_1.add(Money_Label_1);
		Money_Number_1.add(MoneyButton_1);
		M.add(Money_Number_1);
		Money_Number_1.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_2 = new JPanel();
		JLabel Money_Label_2 = new JLabel(Money_Array.MoneyL.get(1).getMoneyname());
		JButton MoneyButton_2 = new JButton(Money_Array.MoneyL.get(1).getMoneyname() + " �߰�");
		Money_Number_2.add(new JLabel(new ImageIcon(8 + ".png")));
		MoneyButton_2.setForeground(new Color(0, 0, 255));
		MoneyButton_2.setBackground(new Color(255, 255, 255));
		Money_Number_2.add(Money_Label_2);
		Money_Number_2.add(MoneyButton_2);
		M.add(Money_Number_2);
		Money_Number_2.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_3 = new JPanel();
		JLabel Money_Label_3 = new JLabel(Money_Array.MoneyL.get(2).getMoneyname());
		JButton MoneyButton_3 = new JButton(Money_Array.MoneyL.get(2).getMoneyname() + " �߰�");
		Money_Number_3.add(new JLabel(new ImageIcon(9 + ".png")));
		MoneyButton_3.setForeground(new Color(0, 0, 255));
		MoneyButton_3.setBackground(new Color(255, 255, 255));
		Money_Number_3.add(Money_Label_3);
		Money_Number_3.add(MoneyButton_3);
		M.add(Money_Number_3);
		Money_Number_3.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_4 = new JPanel();
		JLabel Money_Label_4 = new JLabel(Money_Array.MoneyL.get(3).getMoneyname());
		JButton MoneyButton_4 = new JButton(Money_Array.MoneyL.get(3).getMoneyname() + " �߰�");
		Money_Number_4.add(new JLabel(new ImageIcon(10 + ".png")));
		MoneyButton_4.setForeground(new Color(0, 0, 255));
		MoneyButton_4.setBackground(new Color(255, 255, 255));
		Money_Number_4.add(Money_Label_4);
		Money_Number_4.add(MoneyButton_4);
		M.add(Money_Number_4);
		Money_Number_4.setBackground(new Color(236, 251, 255));

		JPanel Money_Number_5 = new JPanel();
		JLabel Money_Label_5 = new JLabel(Money_Array.MoneyL.get(4).getMoneyname());
		JButton MoneyButton_5 = new JButton(Money_Array.MoneyL.get(4).getMoneyname() + " �߰�");
		Money_Number_5.add(new JLabel(new ImageIcon(7 + ".png")));
		MoneyButton_5.setForeground(new Color(0, 0, 255));
		MoneyButton_5.setBackground(new Color(255, 255, 255));
		Money_Number_5.add(Money_Label_5);
		Money_Number_5.add(MoneyButton_5);
		M.add(Money_Number_5);
		Money_Number_5.setBackground(new Color(236, 251, 255));
		// ==========================================================

		// ���� ��ư ����
		JButton ENDButton = new JButton("����");
		ENDButton.setBounds(1, 1, 1, 1);
		ENDButton.setForeground(new Color(0, 0, 255));
		ENDButton.setBackground(new Color(255, 255, 255));
		M.add(ENDButton);

		// ���� ������ �⺻ gui ����
		M.setBackground(new Color(236, 251, 255));
		this.setContentPane(M);
		setSize(400, 450);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// ========================================================================
		// ���� �߰� ��ư ����

		MoneyButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(0).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "10�� 1���� �߰��߽��ϴ�");
			}
		});

		MoneyButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(1).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "50�� 1���� �߰��߽��ϴ�");
			}
		});

		MoneyButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(2).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "100�� 1���� �߰��߽��ϴ�");
			}
		});

		MoneyButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(3).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "500�� 1���� �߰��߽��ϴ�");
			}
		});

		MoneyButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Money_Array.MoneyL.get(4).Moneyinsert(1);
				JOptionPane.showMessageDialog(null, "1000�� 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ��ư ����
		ENDButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Vending_Admin_Setting(ppww);
				dispose();
			}
		});

	}

}
