package projektjabberwocky;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.*;

public class JabberwockyView {
	//Design Variablen anlegen (Ella)
	private Stage stage;
	private JabberwockyModel model;

	public JabberwockyView(Stage stage, JabberwockyModel model) { //Exception
		this.stage = stage;
		this.model = model;

		stage.setTitle("Jabberwocky Programm");
		Button button = new Button();
		Slider slider = new Slider(0,7,0);
		slider.isShowTickLabels();
		FileChooser fileCooser = new FileChooser();

		button.setLabel("Gedicht erstellen");
		BorderPane root = new BorderPane();
		HBox hBox = new HBox();


		Scene scene = new Scene(root);
		stage.setScene(scene);

	}
	public void start(){
		stage.show();
	}

}
