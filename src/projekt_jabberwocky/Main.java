package projekt_jabberwocky;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
<<<<<<< HEAD
		// 1.0.0.1 Veronika Hübscher Erstellung
	//private Model model;
	
		// 1.0.0.2 eine Methode um auf das Gedicht zuzugreifen
		//ArrayList<>
		
		
		
=======
		// Datei Objekt erstellen (Ella)
		File datei = new File("Text.txt");
>>>>>>> branch 'main' of https://gitlab.fhnw.ch/veronika.huebscher/projekt_jabberwocky.git

		// Text aus datei auslesen (Ella)
		Scanner scan = null;
		try {
			scan = new Scanner(datei);
		} catch(FileNotFoundException e){
			System.out.println("File not found!");
		}
		while (scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
	}

}
