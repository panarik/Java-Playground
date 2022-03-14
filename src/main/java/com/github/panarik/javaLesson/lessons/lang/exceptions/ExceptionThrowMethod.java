package com.github.panarik.javaLesson.lessons.lang.exceptions;

//Пример обработки эксепшена в методе с дальнейшем пробросом далее
public class ExceptionThrowMethod {

    public static void main(String[] args) throws ClassNotFoundException {
        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {
            log(e); //обрабатываем
            throw e; //пробрасываем далее
        }
    }

    public static void log(Exception exception) {
        System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
    }

}
