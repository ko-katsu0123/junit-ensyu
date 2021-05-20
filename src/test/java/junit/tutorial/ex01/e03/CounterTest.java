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
	// 初期状態で、incrementメソッドを実行すると1が返ってくるかどうかテスト
	void test1() {
		assertEquals(1, Counter.increment(), "エラー:初期状態が1ではありません");
	}
	
	@Test
	// incrementメソッドを1回実行した状態で、incrementメソッドを実行すると2が返ってくる　1つ前のテスト処理を引き継いでしまっている
	void test2() {
		assertEquals(2, Counter.increment(), "エラー:2ではありません");
	}
	
	@Test
	// incrementメソッドを50回実行した状態で、incrementメソッドを実行すると51が返ってくる　これまでのテスト処理を引き継いでしまっている
	void test3() {
		// テスト毎にCounterクラスの変数countを0にリセットしたい
		for(int i = 0; i <= 47; i++) {
			Counter.increment();
		}
		assertEquals(51, Counter.increment(), "エラー:51ではありません");
	}

}
