import java.net.URL;

public class Hello {
	public static void main(String[] argv) {
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println("Hello, grailvm native image!");
		if (argv.length > 0) {
			StringBuilder s = new StringBuilder();
			try {
				URL r = Hello.class.getResource("test.txt");

				System.out.println("Resource: " + r);

				long start = System.currentTimeMillis();

				int n = Integer.parseInt(argv[0]);
				double d = 0;

				for (int i = 0; i < n; i++) {
					genDouble(s);
					d = Double.parseDouble(s.toString());
				}
				System.out.println("" + //
						n + " conversions took " //
						+ (System.currentTimeMillis() - start)//
						+ " ms. " + s + " " + d//
				);

			} catch (Exception e) {
				System.out.println(s);
				e.printStackTrace();
			}
		}
	}

	public static String genDouble(StringBuilder s) {
		s.setLength(0);

		for (int j = 0; j < 8; j++) {
			s.append(getDigit());
		}
		s.append('.');
		for (int j = 0; j < 8; j++) {
			s.append(getDigit());
		}
		return s.toString();
	}

	private static char getDigit() {
		return (char) ((int) '0' + (int) (System.nanoTime() % 10));
	}
}