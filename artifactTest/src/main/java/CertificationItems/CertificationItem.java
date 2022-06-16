package CertificationItems;

import static java.util.stream.Collectors.partitioningBy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

/*
 * 국립농산물품질관리원 친환경인증 인증품목을 가져왔다. 
 * 각각의 정보들 1~8에 담고 각각의 순서대로 조회
 */

// CertificationItem data값을 따로 사용하기 위한 클래스
public class CertificationItem {
	// 필드
	String no; // 인증번호
	String typeName; // 인증종류명
	String farm; // 인증농가
	String itemName; // 인증품목명
	String area; // 재배(작업장)면적(사육두수)
	String plannedAmount; // 생산(수입)계획량
	String periodStart; // 인증기간(시작일)
	String periodEnd; // 인증기간(종료일)

	// super() : 자식 클래스에서 부모 클래스 개체를 가져오는데 사용하는 참조 변수
	// this() : 현재 클래스 안의 개체를 가져오는 참조 변수
	public CertificationItem(String no, String typeName, String farm, String itemName, String area,
			String plannedAmount, String periodStart, String periodEnd) {
		this.no = no;
		this.typeName = typeName;
		this.farm = farm;
		this.itemName = itemName;
		this.area = area;
		this.plannedAmount = plannedAmount;
		this.periodStart = periodStart;
		this.periodEnd = periodEnd;

	}

	public String getNo() {
		return no;
	}

	public String getTypeName() {
		return typeName;
	}

	public String getFarm() {
		return farm;
	}

	public String getItemName() {
		return itemName;
	}

	public String getArea() {
		return area;
	}

	public String getPlannedAmount() {
		return plannedAmount;
	}

	public String getPeriodStart() {
		return periodStart;
	}

	public String getPeriodEnd() {
		return periodEnd;
	}

	// toString override 부모 클래스에 있는 메소드를 자식 클래스에서 재정의
	// CertificationItem 인스턴스의 문자열을 반환
	@Override
	public String toString() {
		return "[인증번호 : " + no + ", 인증종류명 : " + typeName + ", 인증농가 : " + farm + ", 인증품목명 : " + itemName + ", 재배면적 : "
				+ area + ", 생산계획량 : " + plannedAmount + ", 인증기간(시작일)" + periodStart + ", 인증기간(종료일)" + periodEnd + "]";
	}

} // class CertificationItem
