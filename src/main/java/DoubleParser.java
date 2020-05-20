public class DoubleParser {
	public static void main(String[] argv) {
		System.out.println();
		int n = 1000000;
		if (argv.length > 0) {
			n = Integer.parseInt(argv[0]);
		}
		long start = System.currentTimeMillis();
		double d = 0;
		String s = "";

		for (int i = 0; i < n; i++) {
			s = Double.toString(Math.random());
			d = Double.parseDouble(s.toString());
		}
		System.out.println("With " //
				+ System.getProperty("java.vm.name") //
				+ " " + n + " conversions took " //
				+ (System.currentTimeMillis() - start) //
				+ " ms. Sample: (" + s + " " + d + ")"//
		);

	}
}
