package com.journalapplication.journal_application.newpackagetesting.runnablecallable;

import java.util.concurrent.*;

public class ThreadClassImplementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Runnable r = () ->
        {
            System.out.println("This is another thread "+ Thread.currentThread().getName());
        };

        Thread thread = new Thread(r);
        thread.start();
        System.out.println("This is main thread "+ Thread.currentThread().getName());

        Callable<Integer> call = ()->{
            return 10 + 20;
        };

        ExecutorService execute = Executors.newFixedThreadPool(2);

        Future<Integer> submit = execute.submit(call);
        System.out.println(submit.get());

        execute.shutdown();
    }
}
