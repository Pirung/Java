package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 10�� 27��
//Ŭ���� ����: ���Ǳ� ���α׷��� �� Ŭ����
//���۱�: 20204005 ������
//====================================================================================

// �� Ŭ���� ����
public class Vending_Money {
	// �ʿ� ���� ����
	private String Money_name; // �� �̸�
	private int Money_price; // ���� ��ġ
	private int Money_number; // ���� ����
	protected static int total; // ���� �� ��
	private int Money; // ��

	// ���� ������ ����
	public Vending_Money(String name, int price, int number) {
		this.Money_name = name; // ���� �̸��� ���Ѵ�
		this.Money_price = price; // ���� ��ġ�� ���Ѵ�
		this.Money_number = number; // ���� ������ ���ϳ�
	}

	// �ƹ��͵� ������ �ʱ�ȭ
	public Vending_Money() {
		Money = 0;
		total = 0;
	}

	// ���� �̸� ��ȯ �޼ҵ�
	public String getMoneyname() {
		return this.Money_name;
	}

	// ���� ���� ��ȯ �޼ҵ�
	public int getMoneyprice() {
		return this.Money_price;
	}

	// ���� ���� ��ȯ �޼ҵ�
	public int getMoneynumber() {
		return this.Money_number;
	}

	// �� ���� ���̱� �޼ҵ�
	public void Moneyextraction(int cnt) {
		this.Money_number = this.Money_number - cnt;
	}

	// �� ���� �ø��� �޼ҵ�
	public void Moneyinsert(int cnt) {
		this.Money_number = this.Money_number + cnt;
	}

	// �� �߰� �޼ҵ�
	public void Moneyinsert2(int cnt) {
		total = cnt;
	}

	// �� ���� ���� �޼ҵ�
	void setnum(int n) {
		this.Money_price = n;
	}

	// 10�� ���� ������ 5000���� �Ѵ��� Ȯ���ϴ� �޼ҵ�
	boolean insert_Money_10(int money_10) {
		int m = 0;
		m += money_10 * 10;

		total += m;
		// ���� 5000���� �Ѿ�� ���� false ��ȯ
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 50�� ���� ������ 5000���� �Ѵ��� Ȯ���ϴ� �޼ҵ�
	boolean insert_Money_50(int money_50) {
		int m = 0;
		m += money_50 * 50;

		total += m;
		// ���� 5000���� �Ѿ�� ���� false ��ȯ
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 100�� ���� ������ 5000���� �Ѵ��� Ȯ���ϴ� �޼ҵ�
	boolean insert_Money_100(int money_100) {
		int m = 0;
		m += money_100 * 100;

		total += m;
		// ���� 5000���� �Ѿ�� ���� false ��ȯ
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 500�� ���� ������ 5000���� �Ѵ��� Ȯ���ϴ� �޼ҵ�
	boolean insert_Money_500(int money_500) {
		int m = 0;
		m += money_500 * 500;

		total += m;
		// ���� 5000���� �Ѿ�� ���� false ��ȯ
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 1000�� ���� ������ 5000���� �Ѵ��� Ȯ���ϴ� �޼ҵ�
	boolean insert_Money_1000(int money_1000) {
		int m = 0;
		m += money_1000 * 1000;

		total += m;
		// ���� 5000���� �Ѿ�� ���� false ��ȯ
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 1000���� ������ -1000 �޼ҵ�
	void over_1000() {
		total -= 1000;
	}

	int returnMoney() // ���� �ݾ��� ��ȯ�ϴ� �޼ҵ�
	{
		return total;
	}

	void cal_Money(int m) // ���� �ݾ��� ��ȯ�ϴ� �޼ҵ�
	{
		total = total - m;
	}

	// �ܵ� ��ȯ �޼ҵ��
	// õ�� ��ȯ �޼ҵ�
	int return_1000() {

		int r_1000 = 0;
		// ���� �� �ݾ��� 0�̻��� ���
		if (total > 0) {
			// ���� 1000�� ���� 1�� ������ 0 ��ȯ
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// �� �ݾ��� 1000�� �̻��� ���
			if (total >= 1000) {
				// 1000�� ������ ��ŭ ��ȯ
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 1000;
					this.Moneyextraction(1);
					total = aMoney;

					// �ƴҰ��� ����
					if (total < 1000) {
						r_1000 = i + 1;
						break;
					}
				}
			}
		}

		return r_1000;
	}

	// ����� ��ȯ �޼ҵ�
	int return_500() {

		int r_500 = 0;

		// ���� �� �ݾ��� 0�̻��� ���
		if (total > 0) {
			// ���� 500�� ���� 1�� ������ 0 ��ȯ
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// �� �ݾ��� 500�� �̻��� ���
			if (total >= 500) {
				// ������ 1�� �̻��� ��� 500�� ������ ��ŭ ��ȯ
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 500;
					this.Moneyextraction(1);
					total = aMoney;

					// �ƴҰ��� ����
					if (total < 500) {
						r_500 = i + 1;
						break;
					}
				}
			}

		}

		return r_500;
	}

	// ��� ��ȯ �޼ҵ�
	int return_100() {

		int r_100 = 0;

		// ���� �� �ݾ��� 0�̻��� ���
		if (total > 0) {
			// ���� 100�� ���� 1�� ������ 0 ��ȯ
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// �� �ݾ��� 100�� �̻��� ��� �� ������ 1�� �̻��� ���
			if (total >= 100 && this.getMoneynumber() > 0) {
				// 100�� ������ ��ŭ ��ȯ
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 100;
					this.Moneyextraction(1);
					total = aMoney;

					if (total < 100) {
						r_100 = i + 1;
						break;
					}
				}
			}
		}

		return r_100;
	}

	// ���ʿ� ��ȯ �޼ҵ�
	int return_50() {

		int r_50 = 0;

		// ���� �� �ݾ��� 0�̻��� ���
		if (total > 0) {
			// ���� 50�� ���� 1�� ������ 0 ��ȯ
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// �� �ݾ��� 50�� �̻��� ��� �� ������ 1�� �̻��� ���
			if (total >= 50 && this.getMoneynumber() > 0) {
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 50;
					this.Moneyextraction(1);
					total = aMoney;

					if (total < 50) {
						r_50 = i + 1;
						break;
					}
				}
			}
		}

		return r_50;
	}

	// �ʿ� ��ȯ �޼ҵ�
	int return_10() {

		int r_10 = 0;

		// ���� �� �ݾ��� 0�̻��� ���
		if (total > 0) {
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// ���� 10���� ���� 1�� ���� �� ������ 1�� �̻��� ��� �ݺ�
			if (total >= 10 && this.getMoneynumber() > 0) {
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 10;
					this.Moneyextraction(1);
					total = aMoney;

					if (total < 10) {
						r_10 = i + 1;
						break;
					}
				}
			}

		}

		return r_10;
	}
}
