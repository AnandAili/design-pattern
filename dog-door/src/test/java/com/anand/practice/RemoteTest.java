package com.anand.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class RemoteTest {

    @Test
    void pressButton() {

        DogDoor door  = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Open Door");
        remote.pressButton();

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals(false, door.isOpen());



    }

    @Test
    void pressButton_alternatepath() {

        DogDoor door  = new DogDoor();
        Remote remote = new Remote(door);
        System.out.println("Open Door");
        remote.pressButton();

        try {
            TimeUnit.SECONDS.sleep(6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Fido took long time...and barkig to open the door");
        remote.pressButton();
        System.out.println("Fido is back in now");



    }
}