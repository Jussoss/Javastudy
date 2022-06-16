package CertificationItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//itemlist���� �˻������ ��ü ������  �޾ƿ��� Ŭ����
public class CiController {

	public void searchNo() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_no);
		System.out.println("�˻� : ");
		String noStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream() // collect�� ���͸��� ��� ���� ��, toList()�� ��ȯ
				.filter(certificationItem -> certificationItem.getNo().equals(noStr)).collect(Collectors.toList());

		// �˻��� ������ �� ���� Ȯ��
		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(noStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchTypeName() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_typeName);
		System.out.println("�˻� : ");
		String tnStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getTypeName().equals(tnStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getTypeName().equals(tnStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchFarm() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_farm);
		System.out.println("�˻� : ");
		String farmStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getFarm().equals(farmStr)).collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(farmStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchItemName() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_itemName);
		System.out.println("�˻� : ");
		String inStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getItemName().equals(inStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getItemName().equals(inStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchArea() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_area);
		System.out.println("�˻� : ");
		String areaStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getArea().equals(areaStr)).collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(areaStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchPlannedAmount() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_plannedAmount);
		System.out.println("�˻� : ");
		String paStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPlannedAmount().equals(paStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream()
				.filter(certificationItem -> certificationItem.getPlannedAmount().equals(paStr)).count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchPeriodStart() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_periodStart);
		System.out.println("�˻� : ");
		String psStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodStart().equals(psStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodStart().equals(psStr)).count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

	public void searchPeriodEnd() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_periodEnd);
		System.out.println("�˻� : ");
		String peStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodEnd().equals(peStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getPeriodEnd().equals(peStr))
				.count();
		System.out.println("�˻��� ������ " + count + "�� �Դϴ�.");

	}

} // CiController class
