package vending;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

class pp extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	}
}

// 어드민 클래스 설정
public class Vending_Admin_Setting extends JFrame {

	// 메뉴, 달, 일 설정
	private String[] Drink_List = { "전체 매출", "물", "커피", "이온음료", "고급커피", "탄산음료" };
	private String[] Month = { "1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월" };
	private String[] day = { "1일", "2일", "3일", "4일", "5일", "6일", "7일", "8일", "9일", "10일", "11일", "12일", "13일", "14일",
			"15일", "16일", "17일", "18일", "19일", "20일", "21일", "22일", "23일", "24일", "25일", "26일", "27일", "28일", "29일",
			"30일", "31일" };

	private JPanel Mpanel = new JPanel(null); // 패널 설정
	private pp panel = new pp(); // 매니저 패널 설정
	private JScrollPane jscroll = new JScrollPane(panel); // 스크롤 설정

	private JLabel DayName = new JLabel("일별 매출"); // 일매출 라벨 설정
	private JComboBox<String> DayMonth = new JComboBox<String>(Month); // 일 매출의 월 박스 설정
	private JComboBox<String> DayDay = new JComboBox<String>(day); // 일 매출의 일 박스 설정
	private JTextField DayResult = new JTextField(20); // 일 매출 표시
	private JButton DayButton = new JButton("출력"); // 출력 버튼 설정

	private JLabel MonthName = new JLabel("월별 매출"); // 월매출 라벨 설정
	private JComboBox<String> MonthDrink = new JComboBox<String>(Drink_List); // 월 매출의 월 박스 설정
	private JComboBox<String> MonthMonth = new JComboBox<String>(Month); // 월 매출의 일 박스 설정
	private JTextField MonthResult = new JTextField(20); // 월 매출 표시
	private JButton MonthButton = new JButton("출력"); // 출력 버튼 설정

	private JButton ResetPw = new JButton("비밀 번호 변경"); // 비밀번호 버튼 설정

	private JButton Drink_Manage = new JButton("음료 관리"); // 음료 관리 버튼 설저ㅇ

	private JButton Collection = new JButton("수금"); // 수금 버튼 설정

	private JButton ManagerExit = new JButton("관리자 메뉴 종료"); // 종료 버튼 설정

	private JButton Coin_Manage = new JButton("잔돈 재고 조회"); // 조회 설정

	private JButton InsertMoney = new JButton("잔돈 개수 추가"); // 추가 설정

	private JButton Drink_inquiry = new JButton("음료 재고 조회"); // 조회 설정

	private JLabel Stock = new JLabel("『재고』"); // 자판기 현환 라벨 설정
	private String Coin_List[] = { "10원", "50원", "100원", "500원", "1000원" }; // 돈 리스트 설정
	private DefaultTableModel coin = new DefaultTableModel(Coin_List, 1); // 행 열 설정
	private JTable coinStock = new JTable(coin); // 테이블 설정
	private JScrollPane jc = new JScrollPane(coinStock); // 스크롤패널 설정

	// drink_list_combo에서 이름 설정
	private String drink_list_combo[] = { Drink_Array.DrinkL.get(0).getDrinkName(),
			Drink_Array.DrinkL.get(1).getDrinkName(), Drink_Array.DrinkL.get(2).getDrinkName(),
			Drink_Array.DrinkL.get(3).getDrinkName(), Drink_Array.DrinkL.get(4).getDrinkName(),
			Drink_Array.DrinkL.get(5).getDrinkName() };
	private DefaultTableModel drink = new DefaultTableModel(drink_list_combo, 1); // 행 열 설정
	private JTable drinkStock = new JTable(drink); // 테이블 설정
	private JScrollPane jd = new JScrollPane(drinkStock); // 스크롤 팬 설정

	Admin_Money_get get;

	// 생성저 선언
	Vending_Admin_Setting(String ppww) {

		setTitle("관리자 메뉴"); // 이름 설정

		// 위에서 만든 gui들의 위치와 다양한 설정을 해준다
		jscroll.setBounds(0, 0, 900, 500);

		DayName.setBounds(20, 18, 60, 30);
		DayMonth.setBounds(90, 18, 80, 30);
		DayDay.setBounds(190, 18, 80, 30);
		DayResult.setBounds(35, 58, 145, 40);
		DayButton.setBounds(190, 58, 60, 40);

		MonthName.setBounds(360, 18, 60, 30);
		MonthDrink.setBounds(425, 18, 100, 30);
		MonthMonth.setBounds(540, 18, 100, 30);
		MonthResult.setBounds(375, 58, 145, 40);
		MonthButton.setBounds(530, 58, 60, 40);

		Stock.setBounds(165, 130, 400, 40);

		jc.setBounds(20, 180, 400, 40);
		coinStock.setFillsViewportHeight(true);
		jd.setBounds(20, 275, 400, 40);
		drinkStock.setFillsViewportHeight(true);

		// 잔돈 표시 버튼 설정
		// ===========================================================================================
		Coin_Manage.setBounds(20, 225, 150, 40);
		Coin_Manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coin.setValueAt("  " + Money_Array.MoneyL.get(0).getMoneynumber() + "개", 0, 0);
				coin.setValueAt("  " + Money_Array.MoneyL.get(1).getMoneynumber() + "개", 0, 1);
				coin.setValueAt("  " + Money_Array.MoneyL.get(2).getMoneynumber() + "개", 0, 2);
				coin.setValueAt("  " + Money_Array.MoneyL.get(3).getMoneynumber() + "개", 0, 3);
				coin.setValueAt("  " + Money_Array.MoneyL.get(4).getMoneynumber() + "개", 0, 4);
			}
		});
		Mpanel.add(Coin_Manage);
		// ===========================================================================================

		// 돈 삽입 버튼 설정
		// ===========================================================================================
		InsertMoney.setBounds(270, 225, 150, 40);
		InsertMoney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Money(ppww);
				dispose();
			}
		});
		Mpanel.add(InsertMoney);
		// ===========================================================================================

		// 돈 조회 버튼 ㄴ설정
		// ===========================================================================================
		Drink_inquiry.setBounds(20, 320, 150, 40);
		Drink_inquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink.setValueAt("  " + Drink_Array.DrinkL.get(0).getDrinkNumber() + "개", 0, 0);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(1).getDrinkNumber() + "개", 0, 1);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(2).getDrinkNumber() + "개", 0, 2);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(3).getDrinkNumber() + "개", 0, 3);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(4).getDrinkNumber() + "개", 0, 4);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(5).getDrinkNumber() + "개", 0, 5);
			}
		});
		Mpanel.add(Drink_inquiry);
		// ===========================================================================================

		// 비밀번호 변경 버튼 설정
		// ===========================================================================================
		ResetPw.setBounds(495, 132, 150, 45);
		ResetPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Change_pw(ppww);
				dispose();
			}
		});
		// ===========================================================================================

		// 음료 관리 버튼 설정
		// ===========================================================================================
		Drink_Manage.setBounds(495, 195, 150, 45);
		Drink_Manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Admin_Drink(ppww);
			}
		});
		Mpanel.add(Drink_Manage);
		// ===========================================================================================

		// 수금 버튼 설정
		// ===========================================================================================
		Collection.setBounds(495, 260, 150, 45);
		Collection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get = new Admin_Money_get(Vending_Admin_Setting.this, "수금");
				get.setVisible(true);
			}
		});
		// ===========================================================================================

		// 종료 버튼 설정
		// ===========================================================================================
		ManagerExit.setBounds(495, 325, 150, 45);
		ManagerExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Vending_Frame(ppww);
			}
		});
		Mpanel.add(ManagerExit);
		// ===========================================================================================

		// 일 매출 조회 버튼 설정
		// ===========================================================================================
		DayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_FILE print = new Admin_FILE();
				DayResult.setText(
						print.Admin_day(DayMonth.getSelectedItem().toString(), DayDay.getSelectedItem().toString()));
			}
		});
		// ===========================================================================================

		// 월 매출 조회 버튼 설정
		// ===========================================================================================
		MonthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_FILE print = new Admin_FILE();
				MonthResult.setText(print.Admin_Month(MonthDrink.getSelectedItem().toString(),
						MonthMonth.getSelectedItem().toString()));
			}
		});
		// ===========================================================================================

		// 패널에 추가
		Mpanel.add(DayName);
		Mpanel.add(DayMonth);
		Mpanel.add(DayDay);
		Mpanel.add(DayResult);
		Mpanel.add(DayButton);

		Mpanel.add(MonthName);
		Mpanel.add(MonthDrink);
		Mpanel.add(MonthMonth);
		Mpanel.add(MonthResult);
		Mpanel.add(MonthButton);

		Mpanel.add(Stock);
		Mpanel.add(jc);

		Mpanel.add(jd);

		Mpanel.add(ResetPw);

		Mpanel.add(Collection);

		Mpanel.add(jscroll);

		setBounds(300, 200, 675, 425);
		add(Mpanel);
		setVisible(true);

	}

}
