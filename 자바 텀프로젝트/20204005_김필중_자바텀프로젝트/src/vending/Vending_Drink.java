package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 10월 27일
//클래스 목적: 자판기 프로그램의 음료수에 대한 클래스 담당
//저작권: 20204005 김필중
//====================================================================================

// 음료수 클래스 선언
public class Vending_Drink {
	// 필요한 변수 선언
	private String Drink_name; // 음료수 이름
	private int price; // 음료 가격
	private int number; // 음료 개수

	// 음료 생성자 선언
	public Vending_Drink(String name, int price, int number) {
		this.Drink_name = name; // 음료 이름 정한다
		this.price = price; // 음료 가격 정한다
		this.number = number; // 음료 개수 정한다
	}

	// 음료 이름 반환 메소드
	public String getDrinkName() {
		return this.Drink_name;
	}

	// 음료 가격 반환 메소드
	public int getDrinkPrice() {
		return this.price;
	}

	// 음료 개수 반환 메소드
	public int getDrinkNumber() {
		return this.number;
	}

	// 음료 개수 빼는 메소드
	public void Drinkextraction(int cnt) {
		this.number = this.number - cnt;
	}

	// 음료 개수 추가 메소드
	public void Drinkinsert(int cnt) {
		this.number = this.number + cnt;
	}

	// 음료 개수가 있는지 확인
	public boolean check_drink() {
		if (this.getDrinkNumber() < 1)
			return false;
		else
			return true;
	}

	// 음료 이름 변경 메소드
	public void setName(String name) {
		this.Drink_name = name;
	}

	// 음료 가격 변경 메소드
	public void setPrice(int p) {
		this.price = p;
	}
}
