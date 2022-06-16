package CertificationItems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// scanner로 사용자에게 값을 받아 search하면 search한 값이 출력하는 클래스
public class CiSearchService {

	public void selectSearch() throws IOException {
		while (true) {
			CiBoardList bl = new CiBoardList();
			CiController cc = new CiController();
			Scanner scan = new Scanner(System.in);
			System.out.println(bl.menu_1);
			String input = scan.nextLine();
			int num = Integer.parseInt(input);

			if (num == 1) {
				cc.searchNo();
			} else if (num == 2) {
				cc.searchTypeName();
			} else if (num == 3) {
				cc.searchFarm();
			} else if (num == 4) {
				cc.searchItemName();
			} else if (num == 5) {
				cc.searchArea();
			} else if (num == 6) {
				cc.searchPlannedAmount();
			} else if (num == 7) {
				cc.searchPeriodStart();
			} else if (num == 8) {
				cc.searchPeriodEnd();
			} else if (num == 0) {
				System.out.println(bl.menu0_exit);
				break;
			} else {
				System.out.println(bl.menu0_re);
			}
		}
	} // selectSearch()
}
