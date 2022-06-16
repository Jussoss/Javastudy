package CertificationItems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class CertificationItemTest {

	@Test
	void test() throws IOException {
		CiSearchService ss = new CiSearchService();
		ss.selectSearch();
	}

}
