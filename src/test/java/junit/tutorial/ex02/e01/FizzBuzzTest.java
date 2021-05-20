package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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

	@Test // 16���w�肷��
	void test() {
		FizzBuzz fz = new FizzBuzz();
		List<String> expected = fz.createFizzBuzzList(16);
		List<String> list = new ArrayList<>(); // �z��A�������Ⴄ�\����
				list.add("1");
				list.add("2");
				list.add("Fizz");
				list.add("4");
				list.add("Buzz");
				list.add("Fizz");
				list.add("7");
				list.add("8");
				list.add("Fizz");
				list.add("Buzz");
				list.add("11");
				list.add("Fizz");
				list.add("13");
				list.add("14");
				list.add("FizzBuzz");
				list.add("16");
		assertIterableEquals(expected, list); // ���X�g���m�̗v�f��r
	}

}
