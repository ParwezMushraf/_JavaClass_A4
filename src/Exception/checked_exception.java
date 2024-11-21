package Exception;

import java.io.File;
import java.io.IOException;

public class checked_exception {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\hp\\OneDrive\\Desktop\\file\\checked_exception");
		System.out.println(f.createNewFile());
	}
}
