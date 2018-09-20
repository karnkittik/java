import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class ReadWriteFiles20 {

	public static void main(String[] args) throws IOException {
		Scanner infile = new Scanner(new File("src/Hello.java"));
		PrintStream outfile = new PrintStream(new File("src/Hello.bak"));
		while (infile.hasNextLine()) {
			String line = infile.nextLine();
			outfile.println(line);
		}
		infile.close();

	}

}
