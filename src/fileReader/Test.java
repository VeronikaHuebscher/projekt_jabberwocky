package fileReader;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.text.DecimalFormat;

public class Test extends Application {

    public void start(Stage stage) {


        //Creating Label
        Label fensterGrösse = new Label("Noch keine Fenstergrösse gewählt!");
        DecimalFormat df = new DecimalFormat("#0");

        //Creating Textausgabe



        //Creating a slider
        Slider slider= new Slider((int)2, (int)7, (int)1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(false);
        slider.setMajorTickUnit((int)1);
        slider.setBlockIncrement((int)1);

        // Add changeListener
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue <?extends Number>observable, Number
                    oldValue, Number newValue){
                //Setting the Change
                fensterGrösse.setText("Gewählte Fenstergrösse: "+df.format(newValue));
            }
        });

        //Creating a hbox to hold the  bar and progress indicator
        HBox hbox = new HBox(50);
        hbox.setPadding(new Insets(75, 150, 50, 60));
        hbox.getChildren().addAll(slider,fensterGrösse);
        //Setting the stage
        Group root = new Group(hbox);
        Scene scene = new Scene(root, 600, 200, Color.LIGHTBLUE);
        stage.setTitle("Jabberwocky");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String args[]){
        launch();
    }
}