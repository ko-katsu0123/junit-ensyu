package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	// ��{�̌^�@assertEquals("���Ғl", "���ۂ̌���", "�G���[���b�Z�[�W");
	@Test
	void test1() {
		assertEquals("aaa", StringUtils.toSnakeCase("aaa"), "�G���[:aaa���s");
	}
	
	@Test
	void test2() {
		assertEquals("hello_world", StringUtils.toSnakeCase("HelloWorld"), "�G���[:HelloWorld���s");
	}
	
	@Test
	void test3() {
		assertEquals("practice_junit", StringUtils.toSnakeCase("practiceJunit"), "�G���[:practiceJunit���s");
	}
}
