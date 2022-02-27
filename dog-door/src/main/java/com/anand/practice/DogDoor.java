package com.anand.practice;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
    private boolean opened;

    public void open() {
        opened = true;

        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                close();
                timer.cancel();
            }
        }, 5000);
    }

    public void close() {
        opened = false;
    }

     public boolean isOpen() {
        return opened;
     }
}
