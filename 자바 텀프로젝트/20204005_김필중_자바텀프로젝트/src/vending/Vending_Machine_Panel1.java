package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 10�� 30��
//Ŭ���� ����: ���Ǳ� ���α׷��� �ǳ� ��� Ŭ����
//���۱�: 20204005 ������
//====================================================================================

// �ʿ��� ������� ����
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// ���Ǳ� �ǳ� Ŭ���� ����
public class Vending_Machine_Panel1 extends JPanel {

	// �ʿ��� ���� ����
	JTextField Spend_User_Money; // ��ĭ gui ����
	int all_m = 0;
	int c = 0;

	// �ǳ� ������ ����
	public Vending_Machine_Panel1() {
		ArrayList<Integer> UserMoney = new ArrayList<Integer>(); // �� �޴� �����Ҵ� ����
		// ���� �����Ҵ� ������ŭ ����� �� �����Ҵ�
		for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
			UserMoney.add(i);
		}

		setPreferredSize(new Dimension(320, 500)); // ũ�� ����
		JPanel Money_Panel = new JPanel(); // �ǳ� GUI ����
		setBackground(new Color(216, 141, 186)); // �ǳ� ��� ���� ����
		Money_Panel.setBackground(new Color(182, 243, 186)); // �Ӵ� �ǳ� ��� ����'�� ����

		// ============================================================== ���� GUI�� ����,
		// ����, �� �⺻���� ��� ���� �κ�
		// ���Ǳ� ����κ� �⺻ GUI ����
		JPanel Beverage = new JPanel(new GridLayout(2, 3));
		Beverage.setPreferredSize(new Dimension(450, 400));
		Beverage.setForeground(new Color(0, 0, 0));
		Beverage.setBackground(new Color(255, 255, 255));

		JPanel canNumber_1 = new JPanel(); // ĵ 1�� �ǳ��� ����
		JLabel canLabel_1 = new JLabel(Drink_Array.DrinkL.get(0).getDrinkPrice() + "��"); // ĵ 1���� ���� ���� �� ����
		JButton canButton_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName()); // ĵ ��ư ����
		canButton_1.setForeground(new Color(0, 0, 255));
		canButton_1.setBackground(new Color(255, 255, 255));
		canNumber_1.add(canLabel_1);
		canNumber_1.add(canButton_1);
		Beverage.add(canNumber_1);
		canNumber_1.add(new JLabel(new ImageIcon(1 + ".png")));
		canNumber_1.setBackground(new Color(236, 251, 255));

		JPanel canNumber_2 = new JPanel();
		JLabel canLabel_2 = new JLabel(Drink_Array.DrinkL.get(1).getDrinkPrice() + "��");
		JButton canButton_2 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName());
		canButton_2.setForeground(new Color(0, 0, 255));
		canButton_2.setBackground(new Color(255, 255, 255));
		canNumber_2.add(canLabel_2);
		canNumber_2.add(canButton_2);
		Beverage.add(canNumber_2);
		canNumber_2.add(new JLabel(new ImageIcon(2 + ".png")));
		canNumber_2.setBackground(new Color(236, 251, 255));

		JPanel canNumber_3 = new JPanel();
		JLabel canLabel_3 = new JLabel(Drink_Array.DrinkL.get(2).getDrinkPrice() + "��");
		JButton canButton_3 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName());
		canButton_3.setForeground(new Color(0, 0, 255));
		canButton_3.setBackground(new Color(255, 255, 255));
		canNumber_3.add(canLabel_3);
		canNumber_3.add(canButton_3);
		Beverage.add(canNumber_3);
		canNumber_3.add(new JLabel(new ImageIcon(3 + ".png")));
		canNumber_3.setBackground(new Color(236, 251, 255));

		JPanel canNumber_4 = new JPanel();
		JLabel canLabel_4 = new JLabel(Drink_Array.DrinkL.get(3).getDrinkPrice() + "��");
		JButton canButton_4 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName());
		canButton_4.setForeground(new Color(0, 0, 255));
		canButton_4.setBackground(new Color(255, 255, 255));
		canNumber_4.add(canLabel_4);
		canNumber_4.add(canButton_4);
		Beverage.add(canNumber_4);
		canNumber_4.add(new JLabel(new ImageIcon(4 + ".png")));
		canNumber_4.setBackground(new Color(236, 251, 255));

		JPanel canNumber_5 = new JPanel();
		JLabel canLabel_5 = new JLabel(Drink_Array.DrinkL.get(4).getDrinkPrice() + "��");
		JButton canButton_5 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName());
		canButton_5.setForeground(new Color(0, 0, 255));
		canButton_5.setBackground(new Color(255, 255, 255));
		canNumber_5.add(canLabel_5);
		canNumber_5.add(canButton_5);
		Beverage.add(canNumber_5);
		canNumber_5.add(new JLabel(new ImageIcon(5 + ".png")));
		canNumber_5.setBackground(new Color(236, 251, 255));

		JPanel canNumber_6 = new JPanel();
		JLabel canLabel_6 = new JLabel(Drink_Array.DrinkL.get(5).getDrinkPrice() + "��");
		JButton canButton_6 = new JButton(Drink_Array.DrinkL.get(5).getDrinkName());
		canButton_6.setForeground(new Color(0, 0, 255));
		canButton_6.setBackground(new Color(255, 255, 255));
		canNumber_6.add(canLabel_6);
		canNumber_6.add(canButton_6);
		Beverage.add(canNumber_6);
		canNumber_6.add(new JLabel(new ImageIcon(6 + ".png")));
		canNumber_6.setBackground(new Color(236, 251, 255));
		// ==============================================================

		// ==============================================================
		// ���Ǳ⿡ ���Ե� �� ǥ�� �κ�
		JPanel Spend = new JPanel();
		Spend_User_Money = new JTextField(4);
		Spend_User_Money.setText("0");

		Spend_User_Money.setEditable(false);
		Spend_User_Money.setPreferredSize(new Dimension(80, 50));
		Spend.add(Spend_User_Money);
		Spend.setBackground(new Color(51, 255, 153));

		// ==============================================================
		// �ܵ� ��ȯ �κ�
		JButton Return_Money = new JButton("��ȯ");
		Return_Money.setPreferredSize(new Dimension(80, 50));
		Return_Money.setBorder(BorderFactory.createEmptyBorder());
		Return_Money.setContentAreaFilled(true);
		// ��ư�� ��������
		Return_Money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// ���� ������ ������ ǥ��
				if (all_m < 10) {
					JOptionPane.showMessageDialog(null, "���� �� ���� �����ϴ�");
					// �ƴ� ���� �� ��ȯ
				} else {
					int copy = all_m;
					int a_1000 = Money_Array.MoneyL.get(4).return_1000();
					int a_500 = Money_Array.MoneyL.get(3).return_500();
					int a_100 = Money_Array.MoneyL.get(2).return_100();
					int a_50 = Money_Array.MoneyL.get(1).return_50();
					int a_10 = Money_Array.MoneyL.get(0).return_10();
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					if (all_m != 0) {
						JOptionPane.showMessageDialog(null, "�Ž������� �����մϴ�\n �����ڿ��� �����ϼ���");
						Money_Array.MoneyL.get(0).Moneyinsert2(copy);
						all_m = copy;
						Spend_User_Money.setText(String.valueOf(all_m));
					} else {
						Spend_User_Money.setText(String.valueOf(all_m));
						JOptionPane.showMessageDialog(null, "�Ž������� ��ȯ�Ǿ����ϴ�");
						JOptionPane.showMessageDialog(null, "�Ž����� 1000�� : " + a_1000 + "\n�Ž����� 500�� : " + a_500
								+ "\n�Ž����� 100�� : " + a_100 + "\n�Ž����� 50�� : " + a_50 + "\n�Ž����� 10�� : " + a_10);
						c = 0;
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i);
						}
					}

				}

			}

		});
		// �ǳڿ� �߰�
		Spend.add(Return_Money);

		Money_Panel.add(Spend); // �ǳڿ� �߰�

		// ============================================================== ���Ǳ� �� ����
		JPanel insert = new JPanel();
		JButton m_10 = new JButton("10��");
		JButton m_50 = new JButton("50��");
		JButton m_100 = new JButton("100��");
		JButton m_500 = new JButton("500��");
		JButton m_1000 = new JButton("1000��");
		m_1000.setBackground(new Color(229, 204, 255));
		m_10.setBackground(new Color(229, 204, 255));
		m_50.setBackground(new Color(229, 204, 255));
		m_100.setBackground(new Color(229, 204, 255));
		m_500.setBackground(new Color(229, 204, 255));
		insert.setBackground(new Color(51, 255, 153));

		// 10�� ��ư�� ������ ���
		m_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(0).insert_Money_10(1);
				// 5000���� ������ ����
				if (check == false)
					JOptionPane.showMessageDialog(null, "5000���� �Ѱ���ϴ�");
				else {
					JOptionPane.showMessageDialog(null, "10���� �־����ϴ�");
					// �����Ҵ�
					UserMoney.add(0, 1);
					Money_Array.MoneyL.get(0).Moneyinsert(UserMoney.get(0));
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					// �� �ݾ׿� �´� ������ ���� ǥ�� �κ�
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		m_50.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(1).insert_Money_50(1);
				if (check == false)
					JOptionPane.showMessageDialog(null, "5000���� �Ѱ���ϴ�");
				else {
					JOptionPane.showMessageDialog(null, "50���� �־����ϴ�");
					UserMoney.add(1, 1);
					Money_Array.MoneyL.get(1).Moneyinsert(UserMoney.get(1));
					all_m = Money_Array.MoneyL.get(1).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		m_100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(2).insert_Money_100(1);
				if (check == false)
					JOptionPane.showMessageDialog(null, "5000���� �Ѱ���ϴ�");
				else {
					JOptionPane.showMessageDialog(null, "100���� �־����ϴ�");
					UserMoney.add(2, 1);
					Money_Array.MoneyL.get(2).Moneyinsert(UserMoney.get(2));
					all_m = Money_Array.MoneyL.get(2).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		m_500.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(3).insert_Money_500(1);
				if (check == false)
					JOptionPane.showMessageDialog(null, "5000���� �Ѱ���ϴ�");
				else {
					JOptionPane.showMessageDialog(null, "500���� �־����ϴ�");
					UserMoney.add(3, 1);
					Money_Array.MoneyL.get(3).Moneyinsert(UserMoney.get(3));
					all_m = Money_Array.MoneyL.get(3).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		m_1000.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(4).insert_Money_1000(1);
				if (check == false) {
					JOptionPane.showMessageDialog(null, "5000���� �Ѱ���ϴ�");
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
				}

				else if (c > 2) {
					JOptionPane.showMessageDialog(null, "1000�� ����� 3����� ���� �� �ֽ��ϴ�");
					Money_Array.MoneyL.get(4).over_1000();
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
				} else {
					JOptionPane.showMessageDialog(null, "1000���� �־����ϴ�");
					UserMoney.add(4, 1);
					Money_Array.MoneyL.get(4).Moneyinsert(UserMoney.get(4));
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}

					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
					c++;
				}

			}
		});

		// �ǳڿ� ��ư �߰�
		insert.add(m_10);
		insert.add(m_50);
		insert.add(m_100);
		insert.add(m_500);
		insert.add(m_1000);

		Money_Panel.add(insert);
		// ���� ���� ����
		// ==============================================================

		canButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(0).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(0).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(0).Drinkextraction(1);
					Money_Array.MoneyL.get(0).cal_Money(Drink_Array.DrinkL.get(0).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "���� ���Խ��ϴ�");
					if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
						canLabel_1.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}

					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		canButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(1).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(1).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(1).Drinkextraction(1);
					Money_Array.MoneyL.get(1).cal_Money(Drink_Array.DrinkL.get(1).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(1).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "Ŀ�ǰ� ���Խ��ϴ�");
					if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
						canLabel_2.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		canButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(2).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(2).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(2).Drinkextraction(1);
					Money_Array.MoneyL.get(2).cal_Money(Drink_Array.DrinkL.get(3).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(2).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "�̿� ���ᰡ ���Խ��ϴ�");
					if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
						canLabel_3.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		canButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(3).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(3).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(3).Drinkextraction(1);
					Money_Array.MoneyL.get(3).cal_Money(Drink_Array.DrinkL.get(3).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(3).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "��� Ŀ�ǰ� ���Խ��ϴ�");
					if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
						canLabel_4.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		canButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(4).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(4).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(4).Drinkextraction(1);
					Money_Array.MoneyL.get(4).cal_Money(Drink_Array.DrinkL.get(4).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "ź�� ���ᰡ ���Խ��ϴ�");
					if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
						canLabel_5.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		canButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(5).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "��� �����ϴ�");
				else if (Drink_Array.DrinkL.get(5).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "���� �����ϴ�");
				} else {
					Drink_Array.DrinkL.get(5).Drinkextraction(1);
					Money_Array.MoneyL.get(4).cal_Money(Drink_Array.DrinkL.get(5).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "��� ���ᰡ ���Խ��ϴ�");
					System.out.println(Drink_Array.DrinkL.get(5).getDrinkNumber());
					if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
						canLabel_6.setText("ǰ��");
					}
					if (all_m == 0) {
						c = 0;
						for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
							UserMoney.add(i, null);
						}
					}
					if (all_m >= Drink_Array.DrinkL.get(0).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 255, 255));
						} else {
							canButton_1.setForeground(new Color(0, 0, 255));
							canButton_1.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_1.setForeground(new Color(0, 0, 255));
						canButton_1.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(1).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 255, 255));
						} else {
							canButton_2.setForeground(new Color(0, 0, 255));
							canButton_2.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_2.setForeground(new Color(0, 0, 255));
						canButton_2.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(2).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 255, 255));
						} else {
							canButton_3.setForeground(new Color(0, 0, 255));
							canButton_3.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_3.setForeground(new Color(0, 0, 255));
						canButton_3.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(3).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 255, 255));
						} else {
							canButton_4.setForeground(new Color(0, 0, 255));
							canButton_4.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_4.setForeground(new Color(0, 0, 255));
						canButton_4.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(4).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 255, 255));
						} else {
							canButton_5.setForeground(new Color(0, 0, 255));
							canButton_5.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_5.setForeground(new Color(0, 0, 255));
						canButton_5.setBackground(new Color(255, 255, 255));
					}
					if (all_m >= Drink_Array.DrinkL.get(5).getDrinkPrice()) {
						if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 255, 255));
						} else {
							canButton_6.setForeground(new Color(0, 0, 255));
							canButton_6.setBackground(new Color(255, 128, 0));
						}
					} else {
						canButton_6.setForeground(new Color(0, 0, 255));
						canButton_6.setBackground(new Color(255, 255, 255));
					}
				}

			}
		});

		add(Money_Panel, BorderLayout.CENTER);
		add(Beverage, BorderLayout.NORTH);
	}
}
