package junit.tutorial.ex01.e04;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

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
	
	// 10‚ð—^‚¦‚é‚Ætrue‚ð•Ô‚·
	@Test
	void test1() {
		assertTrue(NumberUtils.isEven(10));
	}
	
	// 7‚ð—^‚¦‚é‚Æfalse‚ª•Ô‚Á‚Ä‚­‚é
	@Test
	void test2() {
		assertFalse(NumberUtils.isEven(7));
	}
}
