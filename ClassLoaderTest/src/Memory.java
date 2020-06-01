
// This code is to understand the memory allocation followed in Java.
public class Memory {
	
	public static void main(String[] args) {
		int i = 1;
		Object obj = new Object();
		Memory mem = new Memory(); 
		mem.foo(obj);
	
	}
	
	private void foo(Object param) {
		String str = param.toString();
		System.out.println(str);
	}
}


