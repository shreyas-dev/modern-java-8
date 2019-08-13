package dev.shreyas.modern.java.part02Lambdas;

public class Chapter01RunnableLambdaExample {

    public static void main(String[] args) {
        /*
               Prior to Java8,
               How to create a runnable instance
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };

        // Pass Runnable instance to the thread
        new Thread(runnable).start();

        /*
            Creating a runnable instance and passing to thread using
            java 8.

            U don't need a curly braces if u are executing one statement

            THis is an example for anonomous class
        */
        new Thread(()->System.out.println("Inside Runnable 2")).start();


        /*
               Java 8 long way
         */
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 3");
        };

        new Thread(runnableLambda).start();

    }

}
