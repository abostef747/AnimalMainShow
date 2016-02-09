package com.example.bhkfghhdf.animalmainshow;

import java.util.ArrayList;

public class ListOfAnimal {
    //instansVariabel
    private ArrayList<Animal> animals = new ArrayList<>();

    //Konstruktor
    public ListOfAnimal() {
        Animal ape = new Animal(R.drawable.ape, "Ape", "The ape steals ur stuff");
        Animal eagle = new Animal(R.drawable.eeagle, "Eagle", "Eagles are the most dangrous birds");
        Animal owl = new Animal(R.drawable.owl, "Owl", "Owls could see in the dark");
        Animal lion = new Animal(R.drawable.lion, "Lion", "He is the king and the only king");
        Animal tiger = new Animal(R.drawable.tiger, "Tiger", "Tiger can be scarier than the kind at times");

        animals.add(ape);       // index = 0
        animals.add(eagle);     // index = 1
        animals.add(owl);       // index = 2
        animals.add(lion);      // index = 3
        animals.add(tiger);     // index = 4


    }

    //Instansmetod
    public Animal getAnimal(String whichAnimal) {

        int index = -1;

        // Hur kan vi hämta rätt djur?
        switch (whichAnimal) {
            case "panda":
                index = 0;
                break;
            case "red panda":
                index = 1;
                break;
            case "fox":
                index = 2;
                break;
            case "elk":
                index = 3;
                break;
        }

        // Om vi inte kunde hitta djuret, returnera null
        if (index == -1) {
            return null;
        } else {
            return animals.get(index);
        }
    }
}
