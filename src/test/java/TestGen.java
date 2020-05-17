import org.junit.Test;

public class TestGen {
	@Test
	public void test() {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 100; i++) {
			System.out.println(Hello.genDouble(s));
		}
	}

}
