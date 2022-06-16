package artifactTest;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import artifactTest.BeforAll;

@interface FastTest {} // @FastTest ����
@interface SlowTest {} // @SlowTest ����
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // �׽�Ʈ ������ �����ִ� ������̼�. OrderAnnotation ������̼����� ������ ���ϴ� ���
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // ������̼����� ������ ����Ŭ�� Ŭ���� ������ ����
// JUnit5���� Ŭ���� �� �ν��Ͻ� �ϳ��� ���� ��� �����ϰԲ� ����


public class JUnitTest2 {
		
		int value = 1;
			@Test
			@Order(2) // Order(n), n�� ���� ������� ����
			@FastTest
		    @DisplayName("FastTest")
		    void fastTest() {
		        System.out.println(this);
		        System.out.println(value++);
		    }
			
			@Order(1) //JUnit�� �����ϴ� �� ���(Spring�� �����ϴ� �� X)
		    @SlowTest
		    @DisplayName("SlowTest")
		    void slowTest() {
		        System.out.println(this);
		        System.out.println(value++);
		    }
		    @Order(3)
		    @BeforAll
		    void beforeAll() {
		        System.out.println("before all");
		    }
		    
		    @AfterAll
		    void afterAll() {
		        System.out.println("after all");
		    }
		    // Ŭ���� �� �ν��Ͻ� �ϳ��� �����ϱ� ������ @BeforeAll, @AfterAll �޼��忡 static ����
		    // ���� �ν��Ͻ� �ؽ��� ���, value �� 1, 2 ���
		    
		    
}// JUnitTest2
