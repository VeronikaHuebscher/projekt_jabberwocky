package FileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		
	File datei = new File("Gedicht.txt");
	
	//Überprüfen ob die Datei vorhanden ist, es muss True rauskommen
	//System.out.println(datei.isFile());
	
	//Datei einlesen 
	Scanner scan = null; 
	try {
		scan = new Scanner(datei);
	} catch (FileNotFoundException e) {
		System.out.println("File Not Found");
	}
	
	// While Schleife damit der ganze Text ausgegeben wird
	while(scan.hasNext()) {
	System.out.println(scan.nextLine());
		}
	}

}
