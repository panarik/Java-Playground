package com.github.panarik.javaLesson.lessons.multithreading;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    public static void main(String[] args) {

        //по одному
        singleThreads();

        //несколько сразу
        ExecutorService service1 = Executors.newFixedThreadPool(4); //задаём 4 потока
        runTasks(service1);

        //несколько с подготовкой потоков перед запуском
        ExecutorService service2 = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public Thread newThread(@NotNull Runnable r) {
                Thread t = new Thread(r);
                t.setName("tasks");
                return t;
            }
        });
        runTasks(service2);

        //Все сразу
        ExecutorService service3 = Executors.newCachedThreadPool();
        runTasks(service3);

    }

    private static void singleThreads() {
        //Single (запускаем потоки по порядку)
        ExecutorService service = Executors.newSingleThreadExecutor();
        runTasks(service);

    }

    private static void runTasks(ExecutorService service) {
        for (int i = 0; i < 10; i++) {
            int current = i;
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.printf("Task %d started. Thread name %s\n", current, Thread.currentThread());
                    try {
                        Thread.sleep((long) (200 + 1500 * Math.random()));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(current + " finished.");
                }
            });
        }
        System.out.println("Tasks are given.");

        //не получать новые задачи
        service.shutdown();

        //завершить работу после выполнения только текущей задачи
        //если есть задачи в очереди, то вернуть их в список
//        List<Runnable> uncompletedTasks = service.shutdownNow();

        //ждем завершения работы
        try {
            service.awaitTermination(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Готово!");
    }



}
