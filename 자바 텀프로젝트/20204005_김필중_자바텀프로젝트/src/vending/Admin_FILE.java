package vending;

//====================================================================================
//최초 작성자: 20204005 김필중
//최초 작성일: 21년 12월 10일
//클래스 목적: 자판기 프로그램의 파일 입출력 클래스
//저작권: 20204005 김필중
//====================================================================================
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// 어드민 파일 클래스
public class Admin_FILE {

	// 일별 매출 메소드
	String Admin_day(String a, String b) {
		String line = "";
		// 예외 처리 함수
		try {
			// 파일 객체 생성
			File file = new File("일별매출\\" + a + " " + b + ".txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);

			// 라인을 읽고 반환
			while ((line = bufReader.readLine()) != null) {
				return (line);
			}
			// 파일 닫는다
			bufReader.close();
			// 파일이 없으면 오류
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			// 오류 발생시 종료
		} catch (IOException e) {
			System.out.println(e);
		}
		// 파일에서 읽은 값을 반환
		return (line);
	}

	// 월별 매출 메소드
	String Admin_Month(String a, String b) {
		String line = "";
		// 예외 처리 함수
		try {
			// 파일 객체 생성
			File file = new File("월별매출\\" + a + " " + b + ".txt");
			// 입력 스트림 생성
			FileReader filereader = new FileReader(file);
			// 입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);

			// 라인을 읽고 반환
			while ((line = bufReader.readLine()) != null) {
				return (line);
			}
			// 파일 닫는다
			bufReader.close();
			// 파일이 없으면 오류
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			// 오류 발생시 종료
		} catch (IOException e) {
			System.out.println(e);
		}
		// 파일에서 읽은 값을 반환
		return (line);
	}
}
