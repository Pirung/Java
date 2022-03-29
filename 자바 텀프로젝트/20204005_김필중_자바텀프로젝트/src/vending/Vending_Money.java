package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 10월 27일
//클래스 목적: 자판기 프로그램의 돈 클래스
//저작권: 20204005 김필중
//====================================================================================

// 돈 클래스 선언
public class Vending_Money {
	// 필요 변수 선언
	private String Money_name; // 돈 이름
	private int Money_price; // 돈의 가치
	private int Money_number; // 돈의 개수
	protected static int total; // 돈의 총 합
	private int Money; // 돈

	// 돈의 생성자 선언
	public Vending_Money(String name, int price, int number) {
		this.Money_name = name; // 돈의 이름을 정한다
		this.Money_price = price; // 돈의 가치를 정한다
		this.Money_number = number; // 돈의 개수를 정하낟
	}

	// 아무것도 없으면 초기화
	public Vending_Money() {
		Money = 0;
		total = 0;
	}

	// 돈의 이름 반환 메소드
	public String getMoneyname() {
		return this.Money_name;
	}

	// 돈의 가격 반환 메소드
	public int getMoneyprice() {
		return this.Money_price;
	}

	// 돈의 개수 반환 메소드
	public int getMoneynumber() {
		return this.Money_number;
	}

	// 돈 개수 줄이기 메소드
	public void Moneyextraction(int cnt) {
		this.Money_number = this.Money_number - cnt;
	}

	// 돈 개수 늘리기 메소드
	public void Moneyinsert(int cnt) {
		this.Money_number = this.Money_number + cnt;
	}

	// 돈 추가 메소드
	public void Moneyinsert2(int cnt) {
		total = cnt;
	}

	// 돈 개수 설정 메소드
	void setnum(int n) {
		this.Money_price = n;
	}

	// 10원 돈이 들어갔을때 5000원이 넘는지 확인하느 메소드
	boolean insert_Money_10(int money_10) {
		int m = 0;
		m += money_10 * 10;

		total += m;
		// 만약 5000원이 넘어가면 빼고 false 반환
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 50원 돈이 들어갔을때 5000원이 넘는지 확인하느 메소드
	boolean insert_Money_50(int money_50) {
		int m = 0;
		m += money_50 * 50;

		total += m;
		// 만약 5000원이 넘어가면 빼고 false 반환
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 100원 돈이 들어갔을때 5000원이 넘는지 확인하느 메소드
	boolean insert_Money_100(int money_100) {
		int m = 0;
		m += money_100 * 100;

		total += m;
		// 만약 5000원이 넘어가면 빼고 false 반환
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 500원 돈이 들어갔을때 5000원이 넘는지 확인하느 메소드
	boolean insert_Money_500(int money_500) {
		int m = 0;
		m += money_500 * 500;

		total += m;
		// 만약 5000원이 넘어가면 빼고 false 반환
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 1000원 돈이 들어갔을때 5000원이 넘는지 확인하느 메소드
	boolean insert_Money_1000(int money_1000) {
		int m = 0;
		m += money_1000 * 1000;

		total += m;
		// 만약 5000원이 넘어가면 빼고 false 반환
		if (total > 5000) {
			total -= m;
			return false;
		}
		return true;
	}

	// 1000원이 넘으면 -1000 메소드
	void over_1000() {
		total -= 1000;
	}

	int returnMoney() // 현재 금액을 반환하는 메소드
	{
		return total;
	}

	void cal_Money(int m) // 현재 금액을 반환하는 메소드
	{
		total = total - m;
	}

	// 잔돈 반환 메소드들
	// 천원 반환 메소드
	int return_1000() {

		int r_1000 = 0;
		// 만약 총 금약이 0이상일 경우
		if (total > 0) {
			// 만약 1000원 돈이 1개 이하일 0 반환
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// 총 금액이 1000원 이상일 경우
			if (total >= 1000) {
				// 1000원 가능한 만큼 반환
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 1000;
					this.Moneyextraction(1);
					total = aMoney;

					// 아닐경우는 종료
					if (total < 1000) {
						r_1000 = i + 1;
						break;
					}
				}
			}
		}

		return r_1000;
	}

	// 오백원 반환 메소드
	int return_500() {

		int r_500 = 0;

		// 만약 총 금약이 0이상일 경우
		if (total > 0) {
			// 만약 500원 돈이 1개 이하일 0 반환
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// 총 금액이 500원 이상일 경우
			if (total >= 500) {
				// 개수가 1개 이상일 경우 500원 가능한 만큼 반환
				for (int i = 0; i <= this.getMoneynumber(); i++) {
					int aMoney = total - 500;
					this.Moneyextraction(1);
					total = aMoney;

					// 아닐경우는 종료
					if (total < 500) {
						r_500 = i + 1;
						break;
					}
				}
			}

		}

		return r_500;
	}

	// 백원 반환 메소드
	int return_100() {

		int r_100 = 0;

		// 만약 총 금약이 0이상일 경우
		if (total > 0) {
			// 만약 100원 돈이 1개 이하일 0 반환
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// 총 금액이 100원 이상일 경우 와 개수가 1개 이상일 경우
			if (total >= 100 && this.getMoneynumber() > 0) {
				// 100원 가능한 만큼 반환
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

	// 오십원 반환 메소드
	int return_50() {

		int r_50 = 0;

		// 만약 총 금약이 0이상일 경우
		if (total > 0) {
			// 만약 50원 돈이 1개 이하일 0 반환
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// 총 금액이 50원 이상일 경우 와 개수가 1개 이상일 경우
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

	// 십원 반환 메소드
	int return_10() {

		int r_10 = 0;

		// 만약 총 금약이 0이상일 경우
		if (total > 0) {
			if (this.getMoneynumber() < 1) {
				return 0;
			}
			// 만약 10원원 돈이 1개 이하 와 개수가 1개 이상일 경우 반복
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
