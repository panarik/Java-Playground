package com.github.panarik.javaLesson.lessons.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println("Cleanup: " + !file.exists());
        Thread.sleep(3000);

        //вариант Byte
        try (FileOutputStream file2 = new FileOutputStream("src/main/resources/helloByte.txt")) { //путь к файлику (с созданием файлика)
            for (int i = 0; i < 300; i++) {
                file2.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //вариант String
        byte[] hello3 = "1-2-3 Hello world!".getBytes(StandardCharsets.UTF_8); //преобразовываем в байты
        try (FileOutputStream file3 = new FileOutputStream("src/main/resources/helloByte.txt", true)) {
            file3.write(hello3);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //вариант Character
        List<Character> list = new ArrayList<>(Arrays.asList('1', '2', '3', '4'));
        File fileList = new File("src/main/resources/fromList");
        try (OutputStream out = new FileOutputStream(fileList)) {
            for (Character ch : list) {
                out.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
