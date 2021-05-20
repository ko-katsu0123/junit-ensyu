package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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

	// ������Ԃ�getNum�����s�����0���Ԃ��Ă���B(�w�肵��Item�I�u�W�F�N�g���Ȃ�����)
	@Test
	void test1() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock(); 
		assertEquals(0, is.getNum(item), "�G���[:0���Ԃ��Ă��Ă��Ȃ�");
	}
	
	// ������ԂŁAadd��Item��ǉ������getNum�łP���擾�ł���
	@Test
	void test2() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(1, is.getNum(item), "�G���[:1���Ԃ��Ă��Ă��Ȃ�");
	}
	
	
	// Item���P�ǉ�����Ă����ԂŁAgetNum�łP���擾�ł���
	@Test
	void test3() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		assertEquals(1, is.getNum(item), "�G���[:1���Ԃ��Ă��Ă��Ȃ�");
	}
	
	
	// Item���P�ǉ�����Ă����ԂŁAadd�œ���Item�I�u�W�F�N�g��ǉ������getNum�łQ���擾�ł���
	@Test
	void test4() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(2, is.getNum(item), "�G���[:2���Ԃ��Ă��Ă��Ȃ�");
	}
	
	// Item���P�ǉ�����Ă����ԂŁAadd�ňقȂ�Item�I�u�W�F�N�g��ǉ������getNum�łP���擾�ł���
	@Test
	void test5() {
		Item item = new Item("cd", 1000);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(1, is.getNum(item), "�G���[:1���Ԃ��Ă��Ă��Ȃ�");
	}
	

}
