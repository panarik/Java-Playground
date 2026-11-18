package com.github.panarik.javaLesson.lessons.multithreading;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

// Пулы потоков (ExecutorService).
// Вместо ручного new Thread() мы отдаём задачи пулу, а он сам решает,
// в каком потоке их выполнить. Потоки переиспользуются — это дешевле,
// чем создавать новый поток на каждую задачу.
public class ExecutorServiceExample {

    // Прогоняет одни и те же 10 задач через 4 разных пула и сравнивает поведение.
    public static void main(String[] args) {

        //по одному
        // singleThreads();

        //несколько сразу
        ExecutorService service1 = Executors.newFixedThreadPool(4); //задаём 4 потока
        //runTasks(service1);

        //несколько с подготовкой потоков перед запуском.
        //ThreadFactory решает, как создавать потоки пула (здесь — задаёт им имя)
        ExecutorService service2 = Executors.newFixedThreadPool(4, new ThreadFactory() {
            @Override
            public Thread newThread(@NotNull Runnable r) {
                Thread t = new Thread(r);
                t.setName("tasks");
                return t;
            }
        });
        //runTasks(service2);

        //Все сразу: пул без ограничения, создаёт новый поток, если свободного нет
        ExecutorService service3 = Executors.newCachedThreadPool();
        runTasks(service3);

    }

    // Пул из одного потока: задачи выполняются строго по очереди.
    private static void singleThreads() {
        //Single (запускаем потоки по порядку)
        ExecutorService service = Executors.newSingleThreadExecutor();
        runTasks(service);

    }

    // Отдаёт пулу 10 задач (каждая спит 0.2–1.7с), закрывает пул и ждёт,
    // пока все задачи выполнятся (но не дольше 30с).
    private static void runTasks(ExecutorService service) {
        for (int i = 0; i < 10; i++) {
            int current = i; // копия i: в лямбде/анонимном классе можно использовать только effectively final
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.printf("Job %d started. Thread name %s\n", current, Thread.currentThread());
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

        //не получать новые задачи. Уже принятые (и из очереди) будут выполнены.
        //Без shutdown() потоки пула живут и программа не завершится.
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
