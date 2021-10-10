package com.github.panarik.javaLesson.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Log4jExample {

    //подключаем логгеры к классу
    private static final Logger log = LogManager.getLogger(); //вызываем рутовый
    private static final Logger log2 = LogManager.getLogger("name1"); //вызываем кастомный логгер
    private static final Logger log3 = LogManager.getLogger("admins");
    //подключаем маркеты для логгеров к классу
    private static final Marker ADMIN = MarkerManager.getMarker("ADMIN");

    public static void main(String[] args) {
        log.trace("Trace log");
        log.debug("Debug log");
        log.info("Info log");
        log.warn("Warn log");
        log.error("Error log");
        log.fatal("Fatal log");
        log3.info("User has authorized");
        log3.warn(ADMIN, "Admin has authorized");
    }
}
