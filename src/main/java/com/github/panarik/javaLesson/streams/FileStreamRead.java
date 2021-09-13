package com.github.panarik.javaLesson.streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileStreamRead {

    public static void main(String[] args) throws IOException, InterruptedException {

        //читаем файл по байтам
        long startByte = System.currentTimeMillis();
        try (FileInputStream file = new FileInputStream("src/main/resources/helloString.txt")) {
            int x;
            while ((x = file.read() /* читаем по байтам из файла, складываем значение в виде int*/) > -1 /* пока не дочитаем до конца*/) {
                System.out.print((char) x);
            }
        }
        System.out.println("Read on Byte: " + (System.currentTimeMillis() - startByte));
        Thread.sleep(2000);

        //читаем чайл с буфером
        long startBuf = System.currentTimeMillis();
        byte[] buf = new byte[32];
        try (FileInputStream fis = new FileInputStream("src/main/resources/helloString.txt")) {
            int x;
            while ((x = fis.read(buf) /*читаем по буферам из файла*/) > 0 /* пока буферов не останется*/) {
                System.out.print(new String(buf));
            }
        }
        System.out.println("Read on Buffer: " + (System.currentTimeMillis() - startBuf));
        Thread.sleep(2000);

        //читаем с помощью BufferedInputStream
        long startBufferedStream = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/helloString.txt"))) {
            int x;
            while ((x = bis.read()) >= 0) {
                System.out.print((char) x);
            }
        }
        System.out.println("Read on BufferedInputStream: " + (System.currentTimeMillis() - startBufferedStream));

    }

}
