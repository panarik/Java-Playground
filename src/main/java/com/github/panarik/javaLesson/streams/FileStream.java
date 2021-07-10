package com.github.panarik.javaLesson.streams;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileStream {

    public static void main(String[] args) throws IOException {

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
        System.out.println("files name startWith jira: "+ Arrays.toString(list));


    }


}
