package com.sunxipeng.myapplication;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2016/8/25.
 */
public class TradtionalTimerTest {

    public static void main(String[] args) {


        new Timer().schedule(new MyTimerTask(), 1000);

        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new Date().getSeconds());
            } catch (Exception e) {

            }

        }

    }


    static class MyTimerTask extends TimerTask {


        @Override
        public void run() {

            System.out.println("boming");
            new Timer().schedule(new MyTimerTask(), 1000);
        }
    }
}
