package junit.tutorial.ex01.e03;

public class Counter {

	private static int count;
	
	public Counter() {
		count = 0;
	}
	
	public static int increment() {
		return ++count;
	}

	public static int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
