package com.github.panarik.javaLesson.lessons.streams;

//создание, удаление, перемещение, операции с файлами

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;

public class FileStreamExec {

    public static void main(String[] args) throws IOException, InterruptedException {


        File file = new File("src/main/resources/test_file.txt");
        //проверяем, существует ли этот файл
        if (!file.exists()) {
            System.out.println("file test_file.txt not exist.");
            //создаём файл
            file.createNewFile();
        }
        else {
            System.out.println("file test_file.txt already exist.");
        }
        System.out.println("file test_file.txt exist or not? - " + file.exists());
        Thread.sleep(2000);

        //удаляем файл
        file.delete();
        System.out.println("file test_file.txt has been deleted");
        System.out.println("file test_file.txt exist or not? - " + file.exists());
        Thread.sleep(2000);

        //создаем директорию
        File dir = new File("src/main/resources/test");
        if(!dir.exists()) {
            //создаём директорию
            dir.mkdir();
            System.out.println("after create dir test exist or not? - " + dir.exists());
        }
        Thread.sleep(2000);

        //удаляем директорию
        if (dir.exists()) {
            dir.delete();
        }
        System.out.println("after delete dir test exist or not? - " + dir.exists());

        //создать несколько директорий
        File dirs = new File("src/main/resources/test/1/2/3/4/5");
        if(!dirs.exists()) {
            dirs.mkdirs();
        }
        System.out.println("dirs test/1/2/3/4/5 exist or not? - " + dirs.exists());
        //удаляем все папки
        File dirTest = new File("src/main/resources/test");
        File dir1 = new File("src/main/resources/test/1");
        File dir2 = new File("src/main/resources/test/1/2");
        File dir3 = new File("src/main/resources/test/1/2/3");
        File dir4 = new File("src/main/resources/test/1/2/3/4");
        File dir5 = new File("src/main/resources/test/1/2/3/4/5");

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
        dir5.delete();
        dir4.delete();
        dir3.delete();
        dir2.delete();
        dir1.delete();
        dirTest.delete();

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
