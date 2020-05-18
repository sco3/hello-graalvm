import java.io.File;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

public class LlvmCall {

	static Context ctx = Context.newBuilder().allowAllAccess(true).build();

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

	public static void main(String[] argv) throws Exception {
		if (argv.length > 0) {
			int n = Integer.parseInt(argv[0]);

			Source source = Source.newBuilder("llvm", new File("src/main/c/rand.bc")).build();
			Value lib = ctx.eval(source);
			System.out.println(lib);
			Value parser = ctx.getBindings("llvm").getMember("parseDouble");
			System.out.println(parser);

			Value parser2 = ctx.getBindings("llvm").getMember("parseDouble2");
			System.out.println(parser2);

			Cstring s = new Cstring();

			double d = 0;

			long took = 0;

			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {
				String dblStr = genDouble(sb);
				s.set(dblStr);
				long st = System.nanoTime();
				d = parser.execute(s.getPtr()).asDouble();
				took += (System.nanoTime() - st);
			}
			System.out.println("" + //
					n + " conversions took " //
					+ took / 1000000.0 //
					+ " ms. " + s + " " + d//
			);
			String dblStr = "";
			for (int i = 0; i < n; i++) {
				dblStr = genDouble(sb);
				long st = System.nanoTime();
				d = parser2.execute(dblStr).asDouble();
				took += (System.nanoTime() - st);
			}
			System.out.println("" + //
					n + " conversions took " //
					+ took / 1000000.0 //
					+ " ms. " + dblStr + " " + d//
			);
			if (Double.isNaN(d)) {
				System.out.println("wrong value");
			}
		}
	}

}
