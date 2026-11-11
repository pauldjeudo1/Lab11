/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment02.carrace;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

/**
 * @author Paul Djeudo
 */
public class CarRaceController {
    private CarRaceModel model;
    private CarRaceView view;
    private Timeline slideshowTimeline;
    private MediaPlayer mediaPlayer;

    public CarRaceController(CarRaceModel model, CarRaceView view) {
        this.model = model;
        this.view = view;
        
//        initAudio();
        startSlideshow();
    }

//    private void initAudio() {
//        try {
//            // Optional: Play a sound file during the slideshow using JavaFX Media
//            String soundPath = getClass().getResource("/sounds/intro.mp3").toExternalString();
//            Media media = new Media(soundPath);
//            mediaPlayer = new MediaPlayer(media);
//        } catch (Exception e) {
//            System.out.println("Audio file not found or could not be loaded: " + e.getMessage());
//        }
//    }

    public void startSlideshow() {
        // Play audio if available
        if (mediaPlayer != null) {
            mediaPlayer.play();
        }

        // Display the initial image
        view.updateImageView(model.getCurrentCarImage());

        // Create a timeline that triggers every 2 seconds to change the slide
        slideshowTimeline = new Timeline(new KeyFrame(new Duration(3250), event -> {
            if (!model.isLastSlide()) {
                model.nextSlide();
                view.updateImageView(model.getCurrentCarImage());
            } else {
                // Slideshow is finished; stop timeline and start the race simulation
                slideshowTimeline.stop();
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
                transitionToRaceSimulation();
            }
        }));
        
        slideshowTimeline.setCycleCount(Timeline.INDEFINITE);
        slideshowTimeline.play();
    }

    private void transitionToRaceSimulation() {
        view.setGreetingText("Race starting now!");
        // Logic to clear slideshow components and load the racetrack UI/animations
    }
}
