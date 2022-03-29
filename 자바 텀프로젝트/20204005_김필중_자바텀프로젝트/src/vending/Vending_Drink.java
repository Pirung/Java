package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 10�� 27��
//Ŭ���� ����: ���Ǳ� ���α׷��� ������� ���� Ŭ���� ���
//���۱�: 20204005 ������
//====================================================================================

// ����� Ŭ���� ����
public class Vending_Drink {
	// �ʿ��� ���� ����
	private String Drink_name; // ����� �̸�
	private int price; // ���� ����
	private int number; // ���� ����

	// ���� ������ ����
	public Vending_Drink(String name, int price, int number) {
		this.Drink_name = name; // ���� �̸� ���Ѵ�
		this.price = price; // ���� ���� ���Ѵ�
		this.number = number; // ���� ���� ���Ѵ�
	}

	// ���� �̸� ��ȯ �޼ҵ�
	public String getDrinkName() {
		return this.Drink_name;
	}

	// ���� ���� ��ȯ �޼ҵ�
	public int getDrinkPrice() {
		return this.price;
	}

	// ���� ���� ��ȯ �޼ҵ�
	public int getDrinkNumber() {
		return this.number;
	}

	// ���� ���� ���� �޼ҵ�
	public void Drinkextraction(int cnt) {
		this.number = this.number - cnt;
	}

	// ���� ���� �߰� �޼ҵ�
	public void Drinkinsert(int cnt) {
		this.number = this.number + cnt;
	}

	// ���� ������ �ִ��� Ȯ��
	public boolean check_drink() {
		if (this.getDrinkNumber() < 1)
			return false;
		else
			return true;
	}

	// ���� �̸� ���� �޼ҵ�
	public void setName(String name) {
		this.Drink_name = name;
	}

	// ���� ���� ���� �޼ҵ�
	public void setPrice(int p) {
		this.price = p;
	}
}
