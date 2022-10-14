package projekt_jabberwocky;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
	//Datei Objekt erstellen (Ella)

		File datei = new File("Text.txt");

	//Text aus Datei auslesen (Ella)
		Scanner scan = null;
		try{
			scan = new Scanner(datei);
		}catch (FileNotFoundException e){
			System.out.println("File not found!");
		}
		while (scan.hasNext()){
			System.out.println(scan.nextLine());
		}
	}
}
