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

// txt파일 불러오고 내용을 출력하는 클래스
public class CiTextFileReader {
	// CertificationItem 타입만 담을 수 있는 arraylist 객체 생성
	static ArrayList<CertificationItem> itemlist = new ArrayList<CertificationItem>();
	static File f = new File("C:\\Users\\lsz12\\Desktop\\test files\\CertificationItem.txt");

	// 텍스트 파일을 읽어서 itemlist에 담기
	public static ArrayList<CertificationItem> getTxt() {
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = br.readLine();

			while (str != null) {
				str = br.readLine(); // 한 줄 씩 읽어오기
				String[] strArray = str.split("\t"); // 데이터 자르기

				// arraylist 형식의 itemlist 변수에 넣기 위해 add 함수 사용
				itemlist.add(new CertificationItem(strArray[0], strArray[1], strArray[2], strArray[3], strArray[4],
						strArray[5], strArray[6], strArray[7]));
				
			} // 텍스트 파일 내 데이터를 한 줄 씩 읽음

		} catch (NullPointerException e) { // null이 있을 경우
			e.getStackTrace();
		} catch (FileNotFoundException e) { // 파일을 찾을 수 없는 경우
			e.getStackTrace();
		} catch (IOException e) { // 파일 읽기 중 에러가 발생한 경우
			e.getStackTrace();
		}
		return itemlist;
	} // getTxt

	// itemlist 내용 출력하기
	public static void printItemList() {
		// 향상된 for문 (자료형 변수명 : 배열명)
		for (CertificationItem certificationItem : itemlist) {
			System.out.println(certificationItem);
		}
	} // printItemList

	public static void main(String[] args) throws IOException {
		
		  getTxt(); 
		  printItemList();
		 

	} // main

} // class ciTextFileReader
