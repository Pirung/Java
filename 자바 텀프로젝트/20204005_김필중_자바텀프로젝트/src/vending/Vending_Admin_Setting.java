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

// ���� Ŭ���� ����
public class Vending_Admin_Setting extends JFrame {

	// �޴�, ��, �� ����
	private String[] Drink_List = { "��ü ����", "��", "Ŀ��", "�̿�����", "���Ŀ��", "ź������" };
	private String[] Month = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��" };
	private String[] day = { "1��", "2��", "3��", "4��", "5��", "6��", "7��", "8��", "9��", "10��", "11��", "12��", "13��", "14��",
			"15��", "16��", "17��", "18��", "19��", "20��", "21��", "22��", "23��", "24��", "25��", "26��", "27��", "28��", "29��",
			"30��", "31��" };

	private JPanel Mpanel = new JPanel(null); // �г� ����
	private pp panel = new pp(); // �Ŵ��� �г� ����
	private JScrollPane jscroll = new JScrollPane(panel); // ��ũ�� ����

	private JLabel DayName = new JLabel("�Ϻ� ����"); // �ϸ��� �� ����
	private JComboBox<String> DayMonth = new JComboBox<String>(Month); // �� ������ �� �ڽ� ����
	private JComboBox<String> DayDay = new JComboBox<String>(day); // �� ������ �� �ڽ� ����
	private JTextField DayResult = new JTextField(20); // �� ���� ǥ��
	private JButton DayButton = new JButton("���"); // ��� ��ư ����

	private JLabel MonthName = new JLabel("���� ����"); // ������ �� ����
	private JComboBox<String> MonthDrink = new JComboBox<String>(Drink_List); // �� ������ �� �ڽ� ����
	private JComboBox<String> MonthMonth = new JComboBox<String>(Month); // �� ������ �� �ڽ� ����
	private JTextField MonthResult = new JTextField(20); // �� ���� ǥ��
	private JButton MonthButton = new JButton("���"); // ��� ��ư ����

	private JButton ResetPw = new JButton("��� ��ȣ ����"); // ��й�ȣ ��ư ����

	private JButton Drink_Manage = new JButton("���� ����"); // ���� ���� ��ư ������

	private JButton Collection = new JButton("����"); // ���� ��ư ����

	private JButton ManagerExit = new JButton("������ �޴� ����"); // ���� ��ư ����

	private JButton Coin_Manage = new JButton("�ܵ� ��� ��ȸ"); // ��ȸ ����

	private JButton InsertMoney = new JButton("�ܵ� ���� �߰�"); // �߰� ����

	private JButton Drink_inquiry = new JButton("���� ��� ��ȸ"); // ��ȸ ����

	private JLabel Stock = new JLabel("�����"); // ���Ǳ� ��ȯ �� ����
	private String Coin_List[] = { "10��", "50��", "100��", "500��", "1000��" }; // �� ����Ʈ ����
	private DefaultTableModel coin = new DefaultTableModel(Coin_List, 1); // �� �� ����
	private JTable coinStock = new JTable(coin); // ���̺� ����
	private JScrollPane jc = new JScrollPane(coinStock); // ��ũ���г� ����

	// drink_list_combo���� �̸� ����
	private String drink_list_combo[] = { Drink_Array.DrinkL.get(0).getDrinkName(),
			Drink_Array.DrinkL.get(1).getDrinkName(), Drink_Array.DrinkL.get(2).getDrinkName(),
			Drink_Array.DrinkL.get(3).getDrinkName(), Drink_Array.DrinkL.get(4).getDrinkName(),
			Drink_Array.DrinkL.get(5).getDrinkName() };
	private DefaultTableModel drink = new DefaultTableModel(drink_list_combo, 1); // �� �� ����
	private JTable drinkStock = new JTable(drink); // ���̺� ����
	private JScrollPane jd = new JScrollPane(drinkStock); // ��ũ�� �� ����

	Admin_Money_get get;

	// ������ ����
	Vending_Admin_Setting(String ppww) {

		setTitle("������ �޴�"); // �̸� ����

		// ������ ���� gui���� ��ġ�� �پ��� ������ ���ش�
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

		// �ܵ� ǥ�� ��ư ����
		// ===========================================================================================
		Coin_Manage.setBounds(20, 225, 150, 40);
		Coin_Manage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				coin.setValueAt("  " + Money_Array.MoneyL.get(0).getMoneynumber() + "��", 0, 0);
				coin.setValueAt("  " + Money_Array.MoneyL.get(1).getMoneynumber() + "��", 0, 1);
				coin.setValueAt("  " + Money_Array.MoneyL.get(2).getMoneynumber() + "��", 0, 2);
				coin.setValueAt("  " + Money_Array.MoneyL.get(3).getMoneynumber() + "��", 0, 3);
				coin.setValueAt("  " + Money_Array.MoneyL.get(4).getMoneynumber() + "��", 0, 4);
			}
		});
		Mpanel.add(Coin_Manage);
		// ===========================================================================================

		// �� ���� ��ư ����
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

		// �� ��ȸ ��ư ������
		// ===========================================================================================
		Drink_inquiry.setBounds(20, 320, 150, 40);
		Drink_inquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drink.setValueAt("  " + Drink_Array.DrinkL.get(0).getDrinkNumber() + "��", 0, 0);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(1).getDrinkNumber() + "��", 0, 1);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(2).getDrinkNumber() + "��", 0, 2);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(3).getDrinkNumber() + "��", 0, 3);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(4).getDrinkNumber() + "��", 0, 4);
				drink.setValueAt("  " + Drink_Array.DrinkL.get(5).getDrinkNumber() + "��", 0, 5);
			}
		});
		Mpanel.add(Drink_inquiry);
		// ===========================================================================================

		// ��й�ȣ ���� ��ư ����
		// ===========================================================================================
		ResetPw.setBounds(495, 132, 150, 45);
		ResetPw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Admin_Change_pw(ppww);
				dispose();
			}
		});
		// ===========================================================================================

		// ���� ���� ��ư ����
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

		// ���� ��ư ����
		// ===========================================================================================
		Collection.setBounds(495, 260, 150, 45);
		Collection.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				get = new Admin_Money_get(Vending_Admin_Setting.this, "����");
				get.setVisible(true);
			}
		});
		// ===========================================================================================

		// ���� ��ư ����
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

		// �� ���� ��ȸ ��ư ����
		// ===========================================================================================
		DayButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_FILE print = new Admin_FILE();
				DayResult.setText(
						print.Admin_day(DayMonth.getSelectedItem().toString(), DayDay.getSelectedItem().toString()));
			}
		});
		// ===========================================================================================

		// �� ���� ��ȸ ��ư ����
		// ===========================================================================================
		MonthButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Admin_FILE print = new Admin_FILE();
				MonthResult.setText(print.Admin_Month(MonthDrink.getSelectedItem().toString(),
						MonthMonth.getSelectedItem().toString()));
			}
		});
		// ===========================================================================================

		// �гο� �߰�
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
