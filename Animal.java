package com.example.bhkfghhdf.animalmainshow;

/**
 * Created by bhkfghhdf on 2016-02-04.
 */
public class Animal {



    // Instansvariabler
    private int imageId;
    private String animalName;
    private String description;

    // Klassvariabler

    // Konstruktorer
        public Animal(){

        }
        public Animal(int imageId, String animalName, String description){
            this.imageId=imageId;
            this.animalName=animalName;
            this.description=description;
        }
        // Kod för ett "standarddjur"/"placeholderdjur"


    // Instansmetoder
    public int getImageId() {
        return imageId;
    }

    public String getDescription() {
        return description;
    }

    public String getAnimalName() {
        return animalName;
    }


    // Klassmetoder

}
