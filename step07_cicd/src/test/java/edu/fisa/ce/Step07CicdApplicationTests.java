package edu.fisa.ce;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
// 또는
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5

@SpringBootTest
class Step07CicdApplicationTests {

	@Test
	void contextLoads() {
		int result = 12 + 3;
		System.out.println("****비교 전****");
		
		assertEquals(1, result); // 성공: 5 == 5
		System.out.println("****비교 후****");
	}
}
