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

	// 初期状態でgetNumを実行すると0が返ってくる。(指定したItemオブジェクトがないため)
	@Test
	void test1() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock(); 
		assertEquals(0, is.getNum(item), "エラー:0が返ってきていない");
	}
	
	// 初期状態で、addでItemを追加するとgetNumで１が取得できる
	@Test
	void test2() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(1, is.getNum(item), "エラー:1が返ってきていない");
	}
	
	
	// Itemが１つ追加されている状態で、getNumで１が取得できる
	@Test
	void test3() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		assertEquals(1, is.getNum(item), "エラー:1が返ってきていない");
	}
	
	
	// Itemが１つ追加されている状態で、addで同じItemオブジェクトを追加するとgetNumで２が取得できる
	@Test
	void test4() {
		Item item = new Item("book", 500);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(2, is.getNum(item), "エラー:2が返ってきていない");
	}
	
	// Itemが１つ追加されている状態で、addで異なるItemオブジェクトを追加するとgetNumで１が取得できる
	@Test
	void test5() {
		Item item = new Item("cd", 1000);
		ItemStock is = new ItemStock();
		is.add(item);
		assertEquals(1, is.getNum(item), "エラー:1が返ってきていない");
	}
	

}
