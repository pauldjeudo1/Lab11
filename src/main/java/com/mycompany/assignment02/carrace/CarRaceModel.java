/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment02.carrace;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.image.Image;

/**
 * @author Paul Djeudo
 */
public class CarRaceModel {
    private List<Image> carImages;
    private int currentSlideIdx = 0;

    public CarRaceModel() {
        carImages = new ArrayList<>();
        
        carImages.add(new Image(getClass().getResourceAsStream("car_images/1.png")));
        carImages.add(new Image(getClass().getResourceAsStream("car_images/2.png")));
        carImages.add(new Image(getClass().getResourceAsStream("car_images/3.png")));
        carImages.add(new Image(getClass().getResourceAsStream("car_images/4.png")));
    }
    
    public Image getCurrentCarImage() {
        return carImages.isEmpty() ? null : carImages.get(currentSlideIdx);
    }

    public void nextSlide() {
        currentSlideIdx = (currentSlideIdx + 1) % carImages.size();
    }

    public boolean isLastSlide() {
        return currentSlideIdx == carImages.size() - 1;
    }
    
}
