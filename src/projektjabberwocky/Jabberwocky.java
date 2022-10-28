package projektjabberwocky;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jabberwocky extends Application {
	private JabberwockyView view;
	private JabberwockyController controller;
	private JabberwockyModel model;

	@Override
	public void start(Stage stage) throws Exception {
		//Objekte anlegen (Ella)
		model = new JabberwockyModel();
		view = new JabberwockyView(stage, model);
		controller = new JabberwockyController(model, view);
		view.start();
	}

	public static void main(String[]args){
		launch();

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
