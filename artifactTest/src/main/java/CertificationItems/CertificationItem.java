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
 * ������깰ǰ�������� ģȯ������ ����ǰ���� �����Դ�. 
 * ������ ������ 1~8�� ��� ������ ������� ��ȸ
 */

// CertificationItem data���� ���� ����ϱ� ���� Ŭ����
public class CertificationItem {
	// �ʵ�
	String no; // ������ȣ
	String typeName; // ����������
	String farm; // ������
	String itemName; // ����ǰ���
	String area; // ���(�۾���)����(�����μ�)
	String plannedAmount; // ����(����)��ȹ��
	String periodStart; // �����Ⱓ(������)
	String periodEnd; // �����Ⱓ(������)

	// super() : �ڽ� Ŭ�������� �θ� Ŭ���� ��ü�� �������µ� ����ϴ� ���� ����
	// this() : ���� Ŭ���� ���� ��ü�� �������� ���� ����
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

	// toString override �θ� Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������
	// CertificationItem �ν��Ͻ��� ���ڿ��� ��ȯ
	@Override
	public String toString() {
		return "[������ȣ : " + no + ", ���������� : " + typeName + ", ������ : " + farm + ", ����ǰ��� : " + itemName + ", ������ : "
				+ area + ", �����ȹ�� : " + plannedAmount + ", �����Ⱓ(������)" + periodStart + ", �����Ⱓ(������)" + periodEnd + "]";
	}

} // class CertificationItem
