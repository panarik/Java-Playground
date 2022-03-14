package com.github.panarik.javaLesson.lessons.logging;

import org.apache.logging.log4j.*;

public class Log4jExample {

    //подключаем логгеры к классу
    private static final Logger log = LogManager.getLogger(); //вызываем рутовый
    private static final Logger logRoot1 = LogManager.getLogger("root"); //вызываем рутовый
    private static final Logger logRoot2 = LogManager.getLogger(Log4jExample.class); //вызываем рутовый
    private static final Logger log1 = LogManager.getLogger("name1"); //вызываем кастомный логгер
    private static final Logger log3 = LogManager.getLogger("admins"); //вызываем кастомный логгер
    //подключаем маркеты для логгеров к классу
    private static final Marker ADMIN = MarkerManager.getMarker("ADMIN");

    public static void main(String[] args) {

        try {
            logging();
        } catch (Throwable t) {
            log.throwing(Level.ERROR, t);
            System.exit(-1);
        }
    }

    private static void logging() {
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info log");
        log.warn("Warn log");
        log.error("Error log");
        log.fatal("Fatal log");
        log3.info("User has authorized");
        log3.warn(ADMIN, "Admin has authorized"); //лог с маркером
        new Thread(()-> log.warn("From thread")).start();

        //обработка ошибок в логе
        try {
            throw new RuntimeException("EXCEPTION");
        } catch (RuntimeException e) {
            log.throwing(Level.ERROR, e);
        }

        //параметризованный лог
        int a = 5;
        String s = "hello";
        log.info("some objects: int - {}, String - {}", a, s);

        throw new StackOverflowError();
    }


}
