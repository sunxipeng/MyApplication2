package com.sunxipeng.myapplication;

/**
 * Created by Administrator on 2016/8/25.
 */
public class TradtionalThreadTest {

    public static void main(String[] args) {

        final Output output = new Output();
        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    output.test("孙西朋");
                }

            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    output.test("哈哈哈");
                }
            }
        }).start();


    }


    static class Output {

        public synchronized void test(String name) {

            for (int i = 0; i < name.length(); i++) {

                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
