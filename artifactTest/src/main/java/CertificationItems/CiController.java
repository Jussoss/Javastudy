package CertificationItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//itemlist에서 검색결과와 전체 개수를  받아오는 클래스
public class CiController {

	public void searchNo() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_no);
		System.out.println("검색 : ");
		String noStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream() // collect로 필터링한 요소 수집 후, toList()로 반환
				.filter(certificationItem -> certificationItem.getNo().equals(noStr)).collect(Collectors.toList());

		// 검색된 정보의 총 개수 확인
		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(noStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchTypeName() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_typeName);
		System.out.println("검색 : ");
		String tnStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getTypeName().equals(tnStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getTypeName().equals(tnStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchFarm() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_farm);
		System.out.println("검색 : ");
		String farmStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getFarm().equals(farmStr)).collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(farmStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchItemName() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_itemName);
		System.out.println("검색 : ");
		String inStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getItemName().equals(inStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getItemName().equals(inStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchArea() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_area);
		System.out.println("검색 : ");
		String areaStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getArea().equals(areaStr)).collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getNo().equals(areaStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchPlannedAmount() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_plannedAmount);
		System.out.println("검색 : ");
		String paStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPlannedAmount().equals(paStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream()
				.filter(certificationItem -> certificationItem.getPlannedAmount().equals(paStr)).count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchPeriodStart() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_periodStart);
		System.out.println("검색 : ");
		String psStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodStart().equals(psStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodStart().equals(psStr)).count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

	public void searchPeriodEnd() throws IOException {
		CiTextFileReader tr = new CiTextFileReader();
		ArrayList<CertificationItem> itemlist = tr.getTxt();
		CiBoardList bl = new CiBoardList();
		Scanner scan = new Scanner(System.in);
		System.out.println(bl.menu1_periodEnd);
		System.out.println("검색 : ");
		String peStr = scan.nextLine();
		List<CertificationItem> resultItems = itemlist.stream()
				.filter(certificationItem -> certificationItem.getPeriodEnd().equals(peStr))
				.collect(Collectors.toList());

		Stream<CertificationItem> ciStr = resultItems.stream();
		ciStr.map(CertificationItem::toString).forEach(System.out::println);
		int count = (int) itemlist.stream().filter(certificationItem -> certificationItem.getPeriodEnd().equals(peStr))
				.count();
		System.out.println("검색된 정보는 " + count + "개 입니다.");

	}

} // CiController class
