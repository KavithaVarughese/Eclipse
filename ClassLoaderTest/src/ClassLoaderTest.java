
public class ClassLoaderTest {
	public static void main(String[] args) {
		System.out.println("Class Loader for Hashmap" + java.util.HashMap.class.getClassLoader());
		System.out.println("Class loader for DNS name service" + sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
		System.out.println("Class loader for this class" + ClassLoaderTest.class.getClassLoader());
		System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
	}
}
