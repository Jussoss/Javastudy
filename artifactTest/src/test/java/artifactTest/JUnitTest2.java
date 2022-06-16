package artifactTest;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import artifactTest.BeforAll;

@interface FastTest {} // @FastTest 적용
@interface SlowTest {} // @SlowTest 적용
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // 테스트 순서를 정해주는 어노테이션. OrderAnnotation 어노테이션으로 순서를 정하는 방법
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // 어노테이션으로 라이프 사이클을 클래스 단위로 설정
// JUnit5에서 클래스 내 인스턴스 하나만 만들어서 사용 가능하게끔 변경


public class JUnitTest2 {
		
		int value = 1;
			@Test
			@Order(2) // Order(n), n값 작은 순서대로 실행
			@FastTest
		    @DisplayName("FastTest")
		    void fastTest() {
		        System.out.println(this);
		        System.out.println(value++);
		    }
			
			@Order(1) //JUnit이 제공하는 것 사용(Spring이 제공하는 것 X)
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
		    // 클래스 당 인스턴스 하나만 생성하기 때문에 @BeforeAll, @AfterAll 메서드에 static 제거
		    // 같은 인스턴스 해쉬값 출력, value 값 1, 2 출력
		    
		    
}// JUnitTest2
