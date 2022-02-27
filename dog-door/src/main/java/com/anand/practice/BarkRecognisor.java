package com.anand.practice;

public class BarkRecognisor {

    private DogDoor dogDoor;
    public BarkRecognisor() {
        this.dogDoor = new DogDoor();
    }

    public void recognise() {
        this.dogDoor.open();
    }
}
