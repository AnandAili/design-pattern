package com.anand.practice;

public class Remote {

    private DogDoor dogDoor;

    public Remote() {
        this.dogDoor = new DogDoor();
    }

    public void pressButton() {
        if(dogDoor.isOpen()) {
            dogDoor.close();
        }else {
            dogDoor.close();
        }
    }
}
