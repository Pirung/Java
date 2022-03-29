package vending;
//====================================================================================

//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 11�� 25��
//Ŭ���� ����: ���Ǳ� ���α׷��� ������ ����� ���� Ŭ����
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

// ����� Ŭ���� ����
public class Admin_Drink extends JFrame {

	// ������ ����
	public Admin_Drink(String ppww) {
		JPanel Beverage = new JPanel(new GridLayout(3, 3)); // �г� 3*3 ����
		Beverage.setPreferredSize(new Dimension(450, 400)); // �г� ũ�� ����
		Beverage.setForeground(new Color(0, 0, 0)); // �г� ��ġ ����
		Beverage.setBackground(new Color(255, 255, 255)); // �г� ���ȭ�� ����

		// �г� 1���� 1�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_1 = new JPanel();
		JLabel DrinkLabel_1 = new JLabel(Drink_Array.DrinkL.get(0).getDrinkPrice() + "��");
		JButton DrinkButton_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_1_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_1_1_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_1.add(new JLabel(new ImageIcon(1 + ".png")));
		DrinkButton_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1.setBackground(new Color(255, 255, 255));
		DrinkButton_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1_1.setBackground(new Color(255, 255, 255));
		DrinkButton_1_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_1_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_1.add(DrinkLabel_1);
		DrinkNumber_1.add(DrinkButton_1);
		DrinkNumber_1.add(DrinkButton_1_1);
		DrinkNumber_1.add(DrinkButton_1_1_1);
		Beverage.add(DrinkNumber_1);
		DrinkNumber_1.setBackground(new Color(236, 251, 255));

		// �г� 2���� 2�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_2 = new JPanel();
		JLabel DrinkLabel_2 = new JLabel(Drink_Array.DrinkL.get(1).getDrinkPrice() + "��");
		JButton DrinkButton_2 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_2_1 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_2_1_1 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_2.add(new JLabel(new ImageIcon(2 + ".png")));
		DrinkButton_2.setForeground(new Color(0, 0, 255));
		DrinkButton_2.setBackground(new Color(255, 255, 255));
		DrinkButton_2_1.setForeground(new Color(0, 0, 255));
		DrinkButton_2_1.setBackground(new Color(255, 255, 255));
		DrinkButton_2_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_2_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_2.add(DrinkLabel_2);
		DrinkNumber_2.add(DrinkButton_2);
		DrinkNumber_2.add(DrinkButton_2_1);
		DrinkNumber_2.add(DrinkButton_2_1_1);
		Beverage.add(DrinkNumber_2);
		DrinkNumber_2.setBackground(new Color(236, 251, 255));

		// �г� 3���� 3�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_3 = new JPanel();
		JLabel DrinkLabel_3 = new JLabel(Drink_Array.DrinkL.get(2).getDrinkPrice() + "��");
		JButton DrinkButton_3 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_3_1 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_3_1_1 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_3.add(new JLabel(new ImageIcon(3 + ".png")));
		DrinkButton_3.setForeground(new Color(0, 0, 255));
		DrinkButton_3.setBackground(new Color(255, 255, 255));
		DrinkButton_3_1.setForeground(new Color(0, 0, 255));
		DrinkButton_3_1.setBackground(new Color(255, 255, 255));
		DrinkButton_3_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_3_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_3.add(DrinkLabel_3);
		DrinkNumber_3.add(DrinkButton_3);
		DrinkNumber_3.add(DrinkButton_3_1);
		DrinkNumber_3.add(DrinkButton_3_1_1);
		Beverage.add(DrinkNumber_3);
		DrinkNumber_3.setBackground(new Color(236, 251, 255));

		// �г� 4���� 4�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_4 = new JPanel();
		JLabel DrinkLabel_4 = new JLabel(Drink_Array.DrinkL.get(3).getDrinkPrice() + "��");
		JButton DrinkButton_4 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_4_1 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_4_1_1 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_4.add(new JLabel(new ImageIcon(4 + ".png")));
		DrinkButton_4.setForeground(new Color(0, 0, 255));
		DrinkButton_4.setBackground(new Color(255, 255, 255));
		DrinkButton_4_1.setForeground(new Color(0, 0, 255));
		DrinkButton_4_1.setBackground(new Color(255, 255, 255));
		DrinkButton_4_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_4_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_4.add(DrinkLabel_4);
		DrinkNumber_4.add(DrinkButton_4);
		DrinkNumber_4.add(DrinkButton_4_1);
		DrinkNumber_4.add(DrinkButton_4_1_1);
		Beverage.add(DrinkNumber_4);
		DrinkNumber_4.setBackground(new Color(236, 251, 255));

		// �г� 5���� 5�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_5 = new JPanel();
		JLabel DrinkLabel_5 = new JLabel(Drink_Array.DrinkL.get(4).getDrinkPrice() + "��");
		JButton DrinkButton_5 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_5_1 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_5_1_1 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_5.add(new JLabel(new ImageIcon(5 + ".png")));
		DrinkButton_5.setForeground(new Color(0, 0, 255));
		DrinkButton_5.setBackground(new Color(255, 255, 255));
		DrinkButton_5_1.setForeground(new Color(0, 0, 255));
		DrinkButton_5_1.setBackground(new Color(255, 255, 255));
		DrinkButton_5_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_5_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_5.add(DrinkLabel_5);
		DrinkNumber_5.add(DrinkButton_5);
		DrinkNumber_5.add(DrinkButton_5_1);
		DrinkNumber_5.add(DrinkButton_5_1_1);
		Beverage.add(DrinkNumber_5);
		DrinkNumber_5.setBackground(new Color(236, 251, 255));

		// �г� 6���� 6�� ���ῡ ���� ����(���� �̸�, ����, ���� ��)
		JPanel DrinkNumber_6 = new JPanel();
		JLabel DrinkLabel_6 = new JLabel(Drink_Array.DrinkL.get(5).getDrinkPrice() + "��");
		JButton DrinkButton_6 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " �߰�"); // ���� �߰� ��ư ����
		JButton DrinkButton_6_1 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " ���� ����"); // ���� ���� ��ư ����
		JButton DrinkButton_6_1_1 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName() + " �̸� ����"); // �̸� ���� ��ư ����
		DrinkNumber_6.add(new JLabel(new ImageIcon(6 + ".png")));
		DrinkButton_6.setForeground(new Color(0, 0, 255));
		DrinkButton_6.setBackground(new Color(255, 255, 255));
		DrinkButton_6_1.setForeground(new Color(0, 0, 255));
		DrinkButton_6_1.setBackground(new Color(255, 255, 255));
		DrinkButton_6_1_1.setForeground(new Color(0, 0, 255));
		DrinkButton_6_1_1.setBackground(new Color(255, 255, 255));
		DrinkNumber_6.add(DrinkLabel_6);
		DrinkNumber_6.add(DrinkButton_6);
		DrinkNumber_6.add(DrinkButton_6_1);
		DrinkNumber_6.add(DrinkButton_6_1_1);
		Beverage.add(DrinkNumber_6);
		DrinkNumber_6.setBackground(new Color(236, 251, 255));

		// ���� ��ư ����
		JButton ENDButton = new JButton("����");
		ENDButton.setBounds(1, 1, 1, 1);
		ENDButton.setForeground(new Color(0, 0, 255));
		ENDButton.setBackground(new Color(255, 255, 255));
		Beverage.add(ENDButton);

		Beverage.setBackground(new Color(236, 251, 255));
		this.setContentPane(Beverage);
		setSize(800, 800);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		// ========================================================================
		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(0).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(0).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(0);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(0);
			}
		});

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(1).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(1).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(1);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(1);
			}
		});

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(2).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(2).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(2);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(2);
			}
		});

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(3).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(3).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(3);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_4_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(3);
			}
		});

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(4).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(4).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(4);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_5_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(4);
			}
		});

		// ���� �߰� ��ư�� ������ �߻��ϴ� �̺�Ʈ, ������ 1���� �߰���
		DrinkButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Drink_Array.DrinkL.get(5).Drinkinsert(1);
				JOptionPane.showMessageDialog(null, Drink_Array.DrinkL.get(5).getDrinkName() + " 1���� �߰��߽��ϴ�");
			}
		});

		// ���� ���� ���� ��ư�� ������ ���� ���� �޼ҵ� ȣ��
		DrinkButton_6_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change_Price(5);
			}
		});

		// ���� �̸� ���� ��ư�� ������ �̸� ���� �޼ҵ� ȣ��
		DrinkButton_6_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Drink_Change(5);
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
