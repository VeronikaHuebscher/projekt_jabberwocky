package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader {
	File datei;

	public TextReader() {
		datei = new File("Gedicht.txt");
		
		if (!datei.isFile()) {
			throw new RuntimeException("File not found!");
		}
	}

	/**
	 * Lese Inhalt von File aus und mache alles in Kleinbuchstaben.
	 * 
	 * @return Inhalt in Kleinbuchstaben
	 */
	public String readContent() {
		
		String result = "";
		
		// Datei einlesen
		try (Scanner scan = new Scanner(datei);) { // try(withResource) => schliesst den scanner automatisch
			
			// While Schleife damit der ganze Text ausgegeben wird
			while (scan.hasNext()) {
				result += scan.nextLine(); // result = result + scan.nextLine(); 
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("File not found!");
		}
		
		
		return result;
		 
	}

}
