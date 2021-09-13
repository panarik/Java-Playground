package com.github.panarik.javaLesson.streams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileStreamWrite {

    public static void main(String[] args) throws InterruptedException {

        //записываем строку в файл
        byte[] hello = "Hello world!".getBytes(StandardCharsets.UTF_8); //преобразовываем в байты
        try (FileOutputStream file = new FileOutputStream("src/main/resources/hello.txt")) { //путь к файлику (с созданием файлика)
            file.write(hello);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file = new File("src/main/resources/hello.txt");
        //удаляем файлик
        file.delete();
        System.out.println("Cleanup: "+!file.exists());
        Thread.sleep(3000);

        //записываем байты в файл в цикле
        try (FileOutputStream file2 = new FileOutputStream("src/main/resources/helloByte.txt")) { //путь к файлику (с созданием файлика)
            for (int i = 0; i < 100; i++) {
                file2.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //дописываем в существующий файл текст
        byte[] hello3 = "Hello world!".getBytes(StandardCharsets.UTF_8); //преобразовываем в байты
        try (FileOutputStream file3 = new FileOutputStream("src/main/resources/helloByte.txt", true)) {
            file3.write(hello3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
