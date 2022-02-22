package com.anand.practice;

public class DogDoor {
    private boolean opened;

    public void open() {
        opened = true;
    }

    public void close() {
        opened = false;
    }

     public boolean isOpen() {
        return opened;
     }
}
