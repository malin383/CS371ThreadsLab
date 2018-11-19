package edu.up.cs301threadslab;

import android.util.Log;

public class AnimationThread extends Thread {
    AnimationView av;

    public AnimationThread(AnimationView av){
        this.av = av;
    }

    @Override
    public void run(){
            try {
                while (true) {
                    av.postInvalidate();
                    Thread.sleep(50);
                }
            } catch (Exception e) {
                Log.e("AnimationThread", "run: Invalidate", e);
            }
    }
}
