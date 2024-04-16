package projeto;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Relatorio {
	
	public static void escritor(String path) throws IOException {
		BufferWriter buffwrite = new bufferWriter(new filewriter(path)); 
		String linha ="";
		Scanner in = new Scanner(System.in);
		System.out.println("Deiby");
		linha= in.nextLine();
		buffwrite.append(linha + "/n");
		buffwrite.close();
		
	
	}

}
