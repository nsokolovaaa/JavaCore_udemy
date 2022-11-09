package Concurrency;

import Collections.CustomLinkList;

public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, thread");

            }

        });
        thread.start();
        SequenceGenerator sequenceGenerator = new SequenceGenerator();
        System.out.println("Hello [2], thread");
        for(int i = 0; i< 30; i++ ) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(Thread.currentThread().getName() + " " +
                                sequenceGenerator.generate());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }).start();

        }


        }


            }



