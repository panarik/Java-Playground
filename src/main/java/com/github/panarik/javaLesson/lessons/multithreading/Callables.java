package com.github.panarik.javaLesson.lessons.multithreading;

import java.util.concurrent.*;

// Получение результата из потока: Callable + FutureTask.
// Runnable.run() ничего не возвращает, а Callable.call() возвращает значение
// и может бросать checked-исключения.
// FutureTask оборачивает Callable, чтобы его можно было отдать в Thread,
// а результат потом забрать через get().
public class Callables {

    // Задача работает 3с, а ждём результат максимум 2с — поэтому будет "timeout".
    // Сам поток при этом не останавливается и доработает до конца.
    public static void main(String[] args) {

        //вытаскиваем объект из потока
        //1.создаём метод возвращающий объект
        FutureTask<String> task = new FutureTask<>(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "Hello";
            }
        });

        //2. создаём новый поток и в нём метод
        Thread t1 = new Thread(task);
        t1.start();
        try {
            //возврат результата работы метода в отдельном потоке
            String result = task.get(2, TimeUnit.SECONDS); //ждем макс 2 секунды пока выполнится поток
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            // ExecutionException — call() упал с исключением
            // InterruptedException — прервали поток main, пока он ждал
            e.printStackTrace();
        } catch (TimeoutException e) {
            // результат не готов за отведённое время
            System.out.println("timeout");
            e.printStackTrace();
        }
    }
}
