package vending;

//====================================================================================
//���� �ۼ���: 20204005 ������
//���� �ۼ���: 21�� 12�� 10��
//Ŭ���� ����: ���Ǳ� ���α׷��� ���� ����� Ŭ����
//���۱�: 20204005 ������
//====================================================================================
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// ���� ���� Ŭ����
public class Admin_FILE {

	// �Ϻ� ���� �޼ҵ�
	String Admin_day(String a, String b) {
		String line = "";
		// ���� ó�� �Լ�
		try {
			// ���� ��ü ����
			File file = new File("�Ϻ�����\\" + a + " " + b + ".txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);

			// ������ �а� ��ȯ
			while ((line = bufReader.readLine()) != null) {
				return (line);
			}
			// ���� �ݴ´�
			bufReader.close();
			// ������ ������ ����
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			// ���� �߻��� ����
		} catch (IOException e) {
			System.out.println(e);
		}
		// ���Ͽ��� ���� ���� ��ȯ
		return (line);
	}

	// ���� ���� �޼ҵ�
	String Admin_Month(String a, String b) {
		String line = "";
		// ���� ó�� �Լ�
		try {
			// ���� ��ü ����
			File file = new File("��������\\" + a + " " + b + ".txt");
			// �Է� ��Ʈ�� ����
			FileReader filereader = new FileReader(file);
			// �Է� ���� ����
			BufferedReader bufReader = new BufferedReader(filereader);

			// ������ �а� ��ȯ
			while ((line = bufReader.readLine()) != null) {
				return (line);
			}
			// ���� �ݴ´�
			bufReader.close();
			// ������ ������ ����
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			// ���� �߻��� ����
		} catch (IOException e) {
			System.out.println(e);
		}
		// ���Ͽ��� ���� ���� ��ȯ
		return (line);
	}
}
