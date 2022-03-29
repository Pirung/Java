package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 10월 30일
//클래스 목적: 자판기 프로그램의 판넬 담당 클래스
//저작권: 20204005 김필중
//====================================================================================

// 필요한 헤더파일 선언
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

// 자판기 판넬 클래스 선언
public class Vending_Machine_Panel1 extends JPanel {

	// 필요한 변수 선언
	JTextField Spend_User_Money; // 빈칸 gui 설정
	int all_m = 0;
	int c = 0;

	// 판넬 생성자 설정
	public Vending_Machine_Panel1() {
		ArrayList<Integer> UserMoney = new ArrayList<Integer>(); // 돈 받는 동적할당 선언
		// 돈의 동적할당 개수만큼 사용자 돈 동적할당
		for (int i = 0; i < Money_Array.MoneyL.size(); i++) {
			UserMoney.add(i);
		}

		setPreferredSize(new Dimension(320, 500)); // 크기 설정
		JPanel Money_Panel = new JPanel(); // 판넬 GUI 설정
		setBackground(new Color(216, 141, 186)); // 판넬 배경 색상 설정
		Money_Panel.setBackground(new Color(182, 243, 186)); // 머니 판넬 배경 색사'ㅇ 설정

		// ============================================================== 음료 GUI와 가격,
		// 개수, 등 기본적인 요소 설정 부분
		// 자판기 음료부분 기본 GUI 설정
		JPanel Beverage = new JPanel(new GridLayout(2, 3));
		Beverage.setPreferredSize(new Dimension(450, 400));
		Beverage.setForeground(new Color(0, 0, 0));
		Beverage.setBackground(new Color(255, 255, 255));

		JPanel canNumber_1 = new JPanel(); // 캔 1번 판넬을 선언
		JLabel canLabel_1 = new JLabel(Drink_Array.DrinkL.get(0).getDrinkPrice() + "원"); // 캔 1번에 대한 가격 라벨 설정
		JButton canButton_1 = new JButton(Drink_Array.DrinkL.get(0).getDrinkName()); // 캔 버튼 설정
		canButton_1.setForeground(new Color(0, 0, 255));
		canButton_1.setBackground(new Color(255, 255, 255));
		canNumber_1.add(canLabel_1);
		canNumber_1.add(canButton_1);
		Beverage.add(canNumber_1);
		canNumber_1.add(new JLabel(new ImageIcon(1 + ".png")));
		canNumber_1.setBackground(new Color(236, 251, 255));

		JPanel canNumber_2 = new JPanel();
		JLabel canLabel_2 = new JLabel(Drink_Array.DrinkL.get(1).getDrinkPrice() + "원");
		JButton canButton_2 = new JButton(Drink_Array.DrinkL.get(1).getDrinkName());
		canButton_2.setForeground(new Color(0, 0, 255));
		canButton_2.setBackground(new Color(255, 255, 255));
		canNumber_2.add(canLabel_2);
		canNumber_2.add(canButton_2);
		Beverage.add(canNumber_2);
		canNumber_2.add(new JLabel(new ImageIcon(2 + ".png")));
		canNumber_2.setBackground(new Color(236, 251, 255));

		JPanel canNumber_3 = new JPanel();
		JLabel canLabel_3 = new JLabel(Drink_Array.DrinkL.get(2).getDrinkPrice() + "원");
		JButton canButton_3 = new JButton(Drink_Array.DrinkL.get(2).getDrinkName());
		canButton_3.setForeground(new Color(0, 0, 255));
		canButton_3.setBackground(new Color(255, 255, 255));
		canNumber_3.add(canLabel_3);
		canNumber_3.add(canButton_3);
		Beverage.add(canNumber_3);
		canNumber_3.add(new JLabel(new ImageIcon(3 + ".png")));
		canNumber_3.setBackground(new Color(236, 251, 255));

		JPanel canNumber_4 = new JPanel();
		JLabel canLabel_4 = new JLabel(Drink_Array.DrinkL.get(3).getDrinkPrice() + "원");
		JButton canButton_4 = new JButton(Drink_Array.DrinkL.get(3).getDrinkName());
		canButton_4.setForeground(new Color(0, 0, 255));
		canButton_4.setBackground(new Color(255, 255, 255));
		canNumber_4.add(canLabel_4);
		canNumber_4.add(canButton_4);
		Beverage.add(canNumber_4);
		canNumber_4.add(new JLabel(new ImageIcon(4 + ".png")));
		canNumber_4.setBackground(new Color(236, 251, 255));

		JPanel canNumber_5 = new JPanel();
		JLabel canLabel_5 = new JLabel(Drink_Array.DrinkL.get(4).getDrinkPrice() + "원");
		JButton canButton_5 = new JButton(Drink_Array.DrinkL.get(4).getDrinkName());
		canButton_5.setForeground(new Color(0, 0, 255));
		canButton_5.setBackground(new Color(255, 255, 255));
		canNumber_5.add(canLabel_5);
		canNumber_5.add(canButton_5);
		Beverage.add(canNumber_5);
		canNumber_5.add(new JLabel(new ImageIcon(5 + ".png")));
		canNumber_5.setBackground(new Color(236, 251, 255));

		JPanel canNumber_6 = new JPanel();
		JLabel canLabel_6 = new JLabel(Drink_Array.DrinkL.get(5).getDrinkPrice() + "원");
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
		// 자판기에 투입된 돈 표시 부분
		JPanel Spend = new JPanel();
		Spend_User_Money = new JTextField(4);
		Spend_User_Money.setText("0");

		Spend_User_Money.setEditable(false);
		Spend_User_Money.setPreferredSize(new Dimension(80, 50));
		Spend.add(Spend_User_Money);
		Spend.setBackground(new Color(51, 255, 153));

		// ==============================================================
		// 잔돈 반환 부분
		JButton Return_Money = new JButton("반환");
		Return_Money.setPreferredSize(new Dimension(80, 50));
		Return_Money.setBorder(BorderFactory.createEmptyBorder());
		Return_Money.setContentAreaFilled(true);
		// 버튼을 눌렀을때
		Return_Money.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// 돈이 없으면 돈없음 표시
				if (all_m < 10) {
					JOptionPane.showMessageDialog(null, "투입 된 돈이 없습니다");
					// 아닐 경우는 돈 반환
				} else {
					int copy = all_m;
					int a_1000 = Money_Array.MoneyL.get(4).return_1000();
					int a_500 = Money_Array.MoneyL.get(3).return_500();
					int a_100 = Money_Array.MoneyL.get(2).return_100();
					int a_50 = Money_Array.MoneyL.get(1).return_50();
					int a_10 = Money_Array.MoneyL.get(0).return_10();
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					if (all_m != 0) {
						JOptionPane.showMessageDialog(null, "거스름돈이 부족합니다\n 관리자에게 문의하세요");
						Money_Array.MoneyL.get(0).Moneyinsert2(copy);
						all_m = copy;
						Spend_User_Money.setText(String.valueOf(all_m));
					} else {
						Spend_User_Money.setText(String.valueOf(all_m));
						JOptionPane.showMessageDialog(null, "거스름돈이 반환되었습니다");
						JOptionPane.showMessageDialog(null, "거스름돈 1000원 : " + a_1000 + "\n거스름돈 500원 : " + a_500
								+ "\n거스름돈 100원 : " + a_100 + "\n거스름돈 50원 : " + a_50 + "\n거스름돈 10원 : " + a_10);
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
		// 판넬에 추가
		Spend.add(Return_Money);

		Money_Panel.add(Spend); // 판넬에 추가

		// ============================================================== 자판기 돈 투입
		JPanel insert = new JPanel();
		JButton m_10 = new JButton("10원");
		JButton m_50 = new JButton("50원");
		JButton m_100 = new JButton("100원");
		JButton m_500 = new JButton("500원");
		JButton m_1000 = new JButton("1000원");
		m_1000.setBackground(new Color(229, 204, 255));
		m_10.setBackground(new Color(229, 204, 255));
		m_50.setBackground(new Color(229, 204, 255));
		m_100.setBackground(new Color(229, 204, 255));
		m_500.setBackground(new Color(229, 204, 255));
		insert.setBackground(new Color(51, 255, 153));

		// 10원 버튼을 눌렀을 경우
		m_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Money_Array.MoneyL.get(0).insert_Money_10(1);
				// 5000원이 넘으면 거절
				if (check == false)
					JOptionPane.showMessageDialog(null, "5000원을 넘겼습니다");
				else {
					JOptionPane.showMessageDialog(null, "10원을 넣었습니다");
					// 동적할당
					UserMoney.add(0, 1);
					Money_Array.MoneyL.get(0).Moneyinsert(UserMoney.get(0));
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					// 총 금액에 맞는 가능한 음료 표시 부분
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
					JOptionPane.showMessageDialog(null, "5000원을 넘겼습니다");
				else {
					JOptionPane.showMessageDialog(null, "50원을 넣었습니다");
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
					JOptionPane.showMessageDialog(null, "5000원을 넘겼습니다");
				else {
					JOptionPane.showMessageDialog(null, "100원을 넣었습니다");
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
					JOptionPane.showMessageDialog(null, "5000원을 넘겼습니다");
				else {
					JOptionPane.showMessageDialog(null, "500원을 넣었습니다");
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
					JOptionPane.showMessageDialog(null, "5000원을 넘겼습니다");
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
				}

				else if (c > 2) {
					JOptionPane.showMessageDialog(null, "1000원 지폐는 3장까지 받을 수 있습니다");
					Money_Array.MoneyL.get(4).over_1000();
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
				} else {
					JOptionPane.showMessageDialog(null, "1000원을 넣었습니다");
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

		// 판넬에 버튼 추가
		insert.add(m_10);
		insert.add(m_50);
		insert.add(m_100);
		insert.add(m_500);
		insert.add(m_1000);

		Money_Panel.add(insert);
		// 음료 구매 설정
		// ==============================================================

		canButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean check = Drink_Array.DrinkL.get(0).check_drink();
				if (check == false)
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(0).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(0).Drinkextraction(1);
					Money_Array.MoneyL.get(0).cal_Money(Drink_Array.DrinkL.get(0).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(0).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "물이 나왔습니다");
					if (Drink_Array.DrinkL.get(0).getDrinkNumber() == 0) {
						canLabel_1.setText("품절");
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
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(1).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(1).Drinkextraction(1);
					Money_Array.MoneyL.get(1).cal_Money(Drink_Array.DrinkL.get(1).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(1).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "커피가 나왔습니다");
					if (Drink_Array.DrinkL.get(1).getDrinkNumber() == 0) {
						canLabel_2.setText("품절");
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
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(2).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(2).Drinkextraction(1);
					Money_Array.MoneyL.get(2).cal_Money(Drink_Array.DrinkL.get(3).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(2).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "이온 음료가 나왔습니다");
					if (Drink_Array.DrinkL.get(2).getDrinkNumber() == 0) {
						canLabel_3.setText("품절");
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
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(3).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(3).Drinkextraction(1);
					Money_Array.MoneyL.get(3).cal_Money(Drink_Array.DrinkL.get(3).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(3).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "고급 커피가 나왔습니다");
					if (Drink_Array.DrinkL.get(3).getDrinkNumber() == 0) {
						canLabel_4.setText("품절");
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
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(4).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(4).Drinkextraction(1);
					Money_Array.MoneyL.get(4).cal_Money(Drink_Array.DrinkL.get(4).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "탄산 음료가 나왔습니다");
					if (Drink_Array.DrinkL.get(4).getDrinkNumber() == 0) {
						canLabel_5.setText("품절");
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
					JOptionPane.showMessageDialog(null, "재고가 없습니다");
				else if (Drink_Array.DrinkL.get(5).getDrinkPrice() > all_m) {
					JOptionPane.showMessageDialog(null, "돈이 없습니다");
				} else {
					Drink_Array.DrinkL.get(5).Drinkextraction(1);
					Money_Array.MoneyL.get(4).cal_Money(Drink_Array.DrinkL.get(5).getDrinkPrice());
					all_m = Money_Array.MoneyL.get(4).returnMoney();
					Spend_User_Money.setText(String.valueOf(all_m));
					JOptionPane.showMessageDialog(null, "비싼 음료가 나왔습니다");
					System.out.println(Drink_Array.DrinkL.get(5).getDrinkNumber());
					if (Drink_Array.DrinkL.get(5).getDrinkNumber() == 0) {
						canLabel_6.setText("품절");
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
