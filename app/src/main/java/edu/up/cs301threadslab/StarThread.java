package edu.up.cs301threadslab;

import android.util.Log;

import java.util.Random;

public class StarThread extends Thread {
    StarAnimation sa;

    public StarThread(StarAnimation sa){
        this.sa = sa;
    }

    @Override
    public void run(){
        Random random = new Random();
            try {
                while (true) {
                    Thread.sleep(2);
                    if (random.nextBoolean()) {
                        sa.addStar();
                    } else {
                        sa.removeStar();
                    }
                }
            } catch (Exception e) {
                Log.e("AnimationThread", "run: Invalidate", e);
            }

    }
}
