package com.github.panarik.javaLesson.streams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileStream {

    public static void main(String[] args) throws IOException {

//        fileEx(); //создание, удаление, перемещение, операции с файлами
//        fileWrite(); //запись в файл
        fileRead(); //чтение из файла



    }

    private static void fileRead() throws IOException {
        //читаем файл по байтам
        long startByte = System.currentTimeMillis();
        try (FileInputStream fis = new FileInputStream("src/main/resources/helloString.txt")) {
            int x;

            while ((x = fis.read() /* читаем по байтам из файла, складываем значение в виде int*/) > -1 /* пока не дочитаем до конца*/) {
                System.out.print((char) x);
            }
        }
//        System.out.println("Read on Byte: " + (System.currentTimeMillis() - startByte));

        //читаем чайл с буфером
        long startBuf = System.currentTimeMillis();
        byte[] buf = new byte[32];
        try (FileInputStream fis = new FileInputStream("src/main/resources/helloString.txt")) {
            int x;
            while ((x = fis.read(buf) /*читаем по буферам из файла*/) > 0 /* пока буферов не останется*/) {
//                System.out.print(new String(buf));
            }
        }
//        System.out.println("Read on Buffer: " + (System.currentTimeMillis() - startBuf));

        //читаем с помощью BufferedInputStream
        long startBufferedStream = System.currentTimeMillis();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/resources/helloString.txt"))) {
            int x;
            while ((x = bis.read()) >= 0) {
//                System.out.print((char) x);
            }
        }
//        System.out.println("Read on BufferedInputStream: " + (System.currentTimeMillis() - startBufferedStream));
    }

    private static void fileWrite() {
        //записываем строку в файл
        byte[] hello = "Hello world!".getBytes(StandardCharsets.UTF_8); //преобразовываем в байты
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/hello.txt")) { //путь к файлику (с созданием файлика)
            fos.write(hello);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //записываем байты в файл в цикле
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/helloByte.txt")) { //путь к файлику (с созданием файлика)
            for (int i = 0; i < 100; i++) {
                fos.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //дописываем в существующий файл текст
        byte[] hello3 = "Hello world!".getBytes(StandardCharsets.UTF_8); //преобразовываем в байты
        try (FileOutputStream fos = new FileOutputStream("src/main/resources/helloByte.txt", true)) {
            fos.write(hello3);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void fileEx() throws IOException {
        File file = new File("src/main/resources/test_file.txt");
        //проверяем, существует ли этот файл
        System.out.println("file test_file.txt exist or not? - " + file.exists());
        //создаём файл
        file.createNewFile();
        System.out.println("file test_file.txt exist or not? - " + file.exists());
        //удалаем файл
        file.delete();
        System.out.println("file test_file.txt exist or not? - " + file.exists());

        //создаем директорию
        File dir = new File("src/main/resources/test");
        System.out.println("dir test exist or not? - " + dir.exists());
        //создаём директорию
        dir.mkdir();
        System.out.println("after create dir test exist or not? - " + dir.exists());
        //удаляем директорию
        dir.delete();
        System.out.println("after delete dir test exist or not? - " + dir.exists());

        //создать несколько директорий
        File dirs = new File("src/main/resources/test/1/2/3/4/5");
        dirs.mkdirs();
        System.out.println("dirs test/1/2/3/4/5 exist or not? - " + dir.exists());

        //перемещаем файл
        File moveFrom = new File("src/main/resources/test/move.txt");
        File moveTo = new File("src/main/resources/test/1/2/3/4/5/move.txt");
        moveFrom.createNewFile();
        System.out.println("file move in DIR test exist or not? - " + moveFrom.exists());
        moveFrom.renameTo(moveTo);
        System.out.println("file move in DIR test/1/2/3/4/5/move.txt exist or not? - " + moveFrom.exists());
        //clean
        moveFrom.delete();
        moveTo.delete();

        //получить список ИМЕН файлов в директории
        File dirRes = new File("src/main/resources/");
        String[] fileList = dirRes.list();
        for (String s : fileList) {
            System.out.println(s);
        }

        //получить список САМИХ файлов
        File[] dirResFiles = dirRes.listFiles();
        for (File f : dirResFiles) {
            System.out.println(f.getName());
        }

        //фильтр\поиск по файлам
        String[] list = dirRes.list(new FilenameFilter() {
                                        @Override
                                        public boolean accept(File dir, String name) {
                                            return name.startsWith("jira");
                                        }
                                    }
        );
        System.out.println("files name startWith jira: " + Arrays.toString(list));
    }


}
