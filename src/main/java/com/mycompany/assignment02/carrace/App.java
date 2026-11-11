package com.mycompany.assignment02.carrace;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 * GitHub Link:
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // 1. Instantiate the View
        CarRaceView view = new CarRaceView();

        // 2. Instantiate the Model
        CarRaceModel model = new CarRaceModel();

        // 3. Instantiate the Controller, connecting Model and View together
        CarRaceController controller = new CarRaceController(model, view);

        // 4. Create the Scene with the View object as the root layout
        Scene scene = new Scene(view, 800, 600);
        
        
        stage.setScene(scene);
        stage.setTitle("Car Race Simulation");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}