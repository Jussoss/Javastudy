package artifactTest;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName; 
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;

// �׽�Ʈ ����
// JUnit5 ���� ������ ���� �׽�Ʈ ���� ����� �� ���� -> ������ ���� ���� ��Ȯ���� ����
// ���� �׽�Ʈ�� ���������� ���� �����ؾ� ��, �������� ����� ��
public class JUnitTest1 {

	@Test // Test �޼��带 ��Ÿ���� ������̼�(Annotation). JUnit4�� �ٸ��� ��� �Ӽ��� �������� ����.
	void test() {
		fail("Not yet implemented");
	}
	
	@BeforeAll // �ݵ�� static void method�� �����ؾ���. �׽�ƮŬ������ ����Ǳ��� �ѹ��� �����
	static void beforAll() {
		System.out.println("beforeAll");
	}
	
	 @AfterAll // �ݵ�� static void method�� �����ؾ���. �׽�Ʈ�޼��尡 ��� ����� �� �����.
	 static void afterAll() {
	    System.out.println("afterAll");
	 }

	 @BeforeEach // �׽�Ʈ �޼��尡 ����Ǳ��� �����.
	 void beforeEach() {
		 System.out.println("beforeEach");
	 }

	 @AfterEach // �׽�Ʈ �޼��尡 ������� �����.
	 void afterEach() {
		 System.out.println("afterEach");
	 }

	 @Test
	@DisplayName("�׽�Ʈ1") /* �ش� �׽�Ʈ �޼����� DisplayName�� ����.
								� �׽�Ʈ���� ���� ǥ���� �� �ֵ��� ���ִ� ������̼�.
								����, Emoji, Ư������ ���� ��� ����. */	 
	 void test1() {
		 System.out.println("test1");
	 }

	 @Test
	 @DisplayName("�׽�Ʈ2")
	 void test2() {
		 System.out.println("test2");
	 }

	 @Test
	 @Disabled // �ش� �׽�Ʈ �޼���� �����Ѵ�. �ּ�ó�� ���� ���� �ذ� ����. �׽�Ʈ�� �ϰ���� ���� Ŭ������ �޼��忡 ���̴� ������̼�.
	 void disabled() {
		 System.out.println("disabled");
	 }

	 
	 @Test
	 void assertEquals() { // ����� ���� ���� ���� ������ Ȯ��
		 int actual = 1;
		 Assertions.assertEquals(1, actual);
	 }
	 
	 @Test
	 void assertNotNull() { // ���� ���� null�� �ƴ��� Ȯ��
	     Integer actual = 1;
	     Assertions.assertNotNull(actual);
	 }
	 
	 @Test
	 void assertTrue() { // ������ ������ Ȯ��
	     boolean b = 3 > 5;
	     Assertions.assertTrue(b);
	 }
	 
	 @Test
	    void assertThrows() { // ���� �߻��� Ȯ���ϴ� �׽�Ʈ
	        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, new Executable() {
				public void execute() throws Throwable {
				    if (1 == 1) {
				        throw new RuntimeException("��Ÿ���ͼ���..");
				    }
				}
			});
	        Assertions.assertEquals("��Ÿ���ͼ���..", runtimeException.getMessage());
	    }
	 
	 @Test
	    void assertTimeout() { // Ư�� �ð� �ȿ� ������ �Ϸ�Ǵ��� Ȯ��
	    	System.out.println("start");
	        Assertions.assertTimeout(Duration.ofSeconds(3), new Executable() {
				public void execute() throws Throwable {
					System.out.println("good");
				    try {
				        TimeUnit.SECONDS.sleep(4);
				    } catch (Throwable e) { }
				}
			}); // ���� �����忡�� �����.
	    }
}