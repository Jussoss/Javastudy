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

// 테스트 순서
// JUnit5 내부 로직에 따라 테스트 순서 변경될 수 있음 -> 순서에 대한 이유 명확하지 않음
// 단위 테스트는 독립적으로 실행 가능해야 함, 의존성이 없어야 함
public class JUnitTest1 {

	@Test // Test 메서드를 나타내는 어노테이션(Annotation). JUnit4와 다르게 어떠한 속성도 선언하지 않음.
	void test() {
		fail("Not yet implemented");
	}
	
	@BeforeAll // 반드시 static void method로 정의해야함. 테스트클래스가 실행되기전 한번만 실행됨
	static void beforAll() {
		System.out.println("beforeAll");
	}
	
	 @AfterAll // 반드시 static void method로 정의해야함. 테스트메서드가 모두 종료된 후 실행됨.
	 static void afterAll() {
	    System.out.println("afterAll");
	 }

	 @BeforeEach // 테스트 메서드가 실행되기전 실행됨.
	 void beforeEach() {
		 System.out.println("beforeEach");
	 }

	 @AfterEach // 테스트 메서드가 실행된후 실행됨.
	 void afterEach() {
		 System.out.println("afterEach");
	 }

	 @Test
	@DisplayName("테스트1") /* 해당 테스트 메서드의 DisplayName을 정의.
								어떤 테스트인지 쉽게 표현할 수 있도록 해주는 어노테이션.
								공백, Emoji, 특수문자 등을 모두 지원. */	 
	 void test1() {
		 System.out.println("test1");
	 }

	 @Test
	 @DisplayName("테스트2")
	 void test2() {
		 System.out.println("test2");
	 }

	 @Test
	 @Disabled // 해당 테스트 메서드는 무시한다. 주석처리 없이 문제 해결 가능. 테스트를 하고싶지 않은 클래스나 메서드에 붙이는 어노테이션.
	 void disabled() {
		 System.out.println("disabled");
	 }

	 
	 @Test
	 void assertEquals() { // 기대한 값과 실제 값이 같은지 확인
		 int actual = 1;
		 Assertions.assertEquals(1, actual);
	 }
	 
	 @Test
	 void assertNotNull() { // 실제 값이 null이 아닌지 확인
	     Integer actual = 1;
	     Assertions.assertNotNull(actual);
	 }
	 
	 @Test
	 void assertTrue() { // 조건이 참인지 확인
	     boolean b = 3 > 5;
	     Assertions.assertTrue(b);
	 }
	 
	 @Test
	    void assertThrows() { // 예외 발생을 확인하는 테스트
	        RuntimeException runtimeException = Assertions.assertThrows(RuntimeException.class, new Executable() {
				public void execute() throws Throwable {
				    if (1 == 1) {
				        throw new RuntimeException("런타임익셉션..");
				    }
				}
			});
	        Assertions.assertEquals("런타임익셉션..", runtimeException.getMessage());
	    }
	 
	 @Test
	    void assertTimeout() { // 특정 시간 안에 실행이 완료되는지 확인
	    	System.out.println("start");
	        Assertions.assertTimeout(Duration.ofSeconds(3), new Executable() {
				public void execute() throws Throwable {
					System.out.println("good");
				    try {
				        TimeUnit.SECONDS.sleep(4);
				    } catch (Throwable e) { }
				}
			}); // 같은 스레드에서 실행됨.
	    }
}