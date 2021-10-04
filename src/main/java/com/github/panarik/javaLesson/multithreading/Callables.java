package com.github.panarik.javaLesson.multithreading;

import java.util.concurrent.*;

public class Callables {

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
            e.printStackTrace();
        } catch (TimeoutException e) {
            System.out.println("timeout");
            e.printStackTrace();
        }
    }
}
