package Planner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FactorioPlanner extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        //Load .fxml and start window with default Parameters
        Parent root = FXMLLoader.load(getClass().getResource("mainFXML.fxml"));

        primaryStage.setTitle("Factorio Planner");
        primaryStage.setScene(new Scene(root, 1240, 740));
        primaryStage.show();
    }


    public static void main(String[] args)
    {
        //Launch the Application
        launch(args);
    }
}
