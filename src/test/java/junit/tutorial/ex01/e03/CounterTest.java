package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

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

	@Test
	// ������ԂŁAincrement���\�b�h�����s�����1���Ԃ��Ă��邩�ǂ����e�X�g
	void test1() {
		assertEquals(1, Counter.increment(), "�G���[:������Ԃ�1�ł͂���܂���");
	}
	
	@Test
	// increment���\�b�h��1����s������ԂŁAincrement���\�b�h�����s�����2���Ԃ��Ă���@1�O�̃e�X�g�����������p���ł��܂��Ă���
	void test2() {
		assertEquals(2, Counter.increment(), "�G���[:2�ł͂���܂���");
	}
	
	@Test
	// increment���\�b�h��50����s������ԂŁAincrement���\�b�h�����s�����51���Ԃ��Ă���@����܂ł̃e�X�g�����������p���ł��܂��Ă���
	void test3() {
		// �e�X�g����Counter�N���X�̕ϐ�count��0�Ƀ��Z�b�g������
		for(int i = 0; i <= 47; i++) {
			Counter.increment();
		}
		assertEquals(51, Counter.increment(), "�G���[:51�ł͂���܂���");
	}

}
