package Exception;
import java.io.File;
import java.io.IOException;
public class Case_1 {
	
	public static void demo() throws IOException {
		File f1=new File("C:\\Users\\hp\\OneDrive\\Desktop\\File\\hello.apk");
		boolean flag=f1.createNewFile();
		System.out.println(flag);
	}
	public static void main(String[] args) throws IOException {
		demo();
	}
}
