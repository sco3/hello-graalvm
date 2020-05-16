
public class Hello {
	public static void main(String[] argv) {
		System.out.println(System.getProperty("java.vm.name"));
		System.out.println("Hello, grailvm native image!");
		if (argv.length > 0) {
			long start = System.currentTimeMillis();
			try {
				int n = Integer.parseInt(argv[0]);
				double[] d = new double[n];
				String[] s = new String[n];
				for (int i = 0; i < n; i++) {
					s[i] = Double.toString(Math.random());
					d[i] = Double.parseDouble(s[i]);
				}
				System.out.println("" + //
						n + " conversions took " //
						+ (System.currentTimeMillis() - start)//
						+ " ms."//
				);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}