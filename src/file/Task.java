package file;

import java.io.File;
import java.io.IOException;

public class Task {
	public static void main(String[] args) {
		File f=new File("C:\\Users\\hp\\OneDrive\\Desktop\\File\\JAVA_A4");
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		//System.out.println(f.mkdir());
		
	}
	

}
