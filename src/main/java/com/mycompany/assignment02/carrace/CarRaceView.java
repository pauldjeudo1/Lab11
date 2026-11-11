/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment02.carrace;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Paul Djeudo
 */
public class CarRaceView extends BorderPane {
    private ImageView imageView;
    private Label greetingLabel;
    
    public CarRaceView() {
        greetingLabel = new Label("Welcome to the Car Race Simulation!");
        imageView = new ImageView();
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);
        
        this.setTop(greetingLabel);
        this.setCenter(imageView);
    }
    
    public void updateImageView(Image image) {
        imageView.setImage(image);
    }

    public void setGreetingText(String text) {
        greetingLabel.setText(text);
    }
    
}
