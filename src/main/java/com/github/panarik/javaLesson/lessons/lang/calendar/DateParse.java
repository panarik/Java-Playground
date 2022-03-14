package com.github.panarik.javaLesson.lessons.lang.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateParse {

    public static void main(String[] args) {
        parse("MAY 13 1990");
    }

    //парсим строку в Calendar
    private static void parse(String date) {
        Date dateInput = new Date();
        try {
            dateInput = new SimpleDateFormat("MMMM dd yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInput);
        System.out.println(calendar.getTime());
    }


}
