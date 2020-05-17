import java.io.File;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;

public class LlvmCall {

	static Context ctx = Context.newBuilder().allowAllAccess(true).build();

	public static void main(String[] argv) throws Exception {
		Source source = Source.newBuilder("llvm", new File("src/main/c/rand.bc")).build();
		Value lib = ctx.eval(source);
		System.out.println(lib);
		Value parser = ctx.getBindings("llvm").getMember("parseDouble");
		System.out.println(parser);

		Cstr s = new Cstr();

		double d = 0;
		long start = System.currentTimeMillis();

		for (int i = 0; i < 10000000; i++) {
			s.set("3.14");
			d = parser.execute(s.getPtr()).asDouble();
		}
		System.out.println("Took: " + (System.currentTimeMillis() - start) + " ms.");
		if (Double.isNaN(d)) {
			System.out.println("wrong value");
		}
		System.out.println(d);

	}

}
