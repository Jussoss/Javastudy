package CertificationItems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// txt���� �ҷ����� ������ ����ϴ� Ŭ����
public class CiTextFileReader {
	// CertificationItem Ÿ�Ը� ���� �� �ִ� arraylist ��ü ����
	static ArrayList<CertificationItem> itemlist = new ArrayList<CertificationItem>();
	static File f = new File("C:\\Users\\lsz12\\Desktop\\test files\\CertificationItem.txt");

	// �ؽ�Ʈ ������ �о itemlist�� ���
	public static ArrayList<CertificationItem> getTxt() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = br.readLine();

			while (str != null) {
				str = br.readLine(); // �� �� �� �о����
				String[] strArray = str.split("\t"); // ������ �ڸ���

				// arraylist ������ itemlist ������ �ֱ� ���� add �Լ� ���
				itemlist.add(new CertificationItem(strArray[0], strArray[1], strArray[2], strArray[3], strArray[4],
						strArray[5], strArray[6], strArray[7]));
				
			} // �ؽ�Ʈ ���� �� �����͸� �� �� �� ����

		} catch (NullPointerException e) { // null�� ���� ���
			e.getStackTrace();
		} catch (FileNotFoundException e) { // ������ ã�� �� ���� ���
			e.getStackTrace();
		} catch (IOException e) { // ���� �б� �� ������ �߻��� ���
			e.getStackTrace();
		}
		return itemlist;
	} // getTxt

	// itemlist ���� ����ϱ�
	public static void printItemList() {
		// ���� for�� (�ڷ��� ������ : �迭��)
		for (CertificationItem certificationItem : itemlist) {
			System.out.println(certificationItem);
		}
	} // printItemList

	public static void main(String[] args) throws IOException {
		
		  getTxt(); 
		  printItemList();
		 

	} // main

} // class ciTextFileReader
