package Test_InOut;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class StrTest {
	;
	public static void main(String[] args) {
		
		
		try {
			OutputStream output = new FileOutputStream("C:/Testing/result.txt");
			Scanner scanner = new Scanner(System.in);
			String sep = "\n";
			
			for(int i=0; i<5; i++) {
				System.out.println("ÀÔ·ÂÇØ");
				String talk = scanner.nextLine();
				
				byte[] content = talk.getBytes();
				output.write(content);
				
				byte[] enter = sep.getBytes();
				output.write(enter);
				
				
			}
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		
		
		
//		String talk ="";
		
		
	}

}
