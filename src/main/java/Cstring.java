
import static java.nio.charset.StandardCharsets.UTF_8;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Cstring {
	public static final java.lang.reflect.Field mAddress;
	static {
		java.lang.reflect.Field addr = null;
		try {
			addr = Buffer.class.getDeclaredField("address");
			addr.setAccessible(true);
		} catch (Exception e) {
			throw new RuntimeException("ByteBuffer address is not available");
		}
		mAddress = addr;
	}

	public long getPtr(ByteBuffer b) {
		try {
			return (Long) mAddress.get(b);
		} catch (Exception e) {
			throw new RuntimeException("ByteBuffer address is not available");
		}
	}

	public void set(String s) {
		str = s;
		byte[] buf = s.getBytes(UTF_8);
		int len = buf.length + 1;
		if (b == null || b.capacity() < len) {

			int capacity = len;
			System.out.println("Allocate: " + capacity);
			b = ByteBuffer.allocateDirect(capacity);
			ptr = getPtr(b);
		}
//		((Buffer) b).rewind();
//		b.put(buf, 0, buf.length);
//		b.put(buf.length, (byte) 0);
		for (int i = 0; i < buf.length; i++) {
			b.put(i, buf[i]);
		}
		b.put(buf.length, (byte) 0);
	}

	private ByteBuffer b;
	private long ptr;
	private String str;

	public long getPtr() {
		return ptr;
	}

	public String toString() {
		return str;
	}

}
