package com.github.panarik.javaLesson.primitives;

public class BooleanExpression {

    public static void main(String[] args) {

        /* шаг 1: Перебор объектов с помощью графов в комбинаторных задачах
          - вносим в метод boolianExpression все возможные варианты переменных в параметре (a, b, c, d)
        */
        boolean TTTT = boolianExpression(true, true, true, true);
        boolean TTTF = boolianExpression(true, true, true, false);
        boolean TTFT = boolianExpression(true, true, false, true);
        boolean TTFF = boolianExpression(true, true, false, false);
        boolean TFTT = boolianExpression(true, false, true, true);
        boolean TFTF = boolianExpression(true, false, true, false);
        boolean TFFT = boolianExpression(true, false, false, true);
        boolean TFFF = boolianExpression(true, false, false, false);
        boolean FTTT = boolianExpression(false, true, true, true);
        boolean FTTF = boolianExpression(false, true, true, false);
        boolean FTFT = boolianExpression(false, true, false, true);
        boolean FTFF = boolianExpression(false, true, false, false);
        boolean FFTT = boolianExpression(false, false, true, true);
        boolean FFTF = boolianExpression(false, false, true, false);
        boolean FFFT = boolianExpression(false, false, false, true);
        boolean FFFF = boolianExpression(false, false, false, false);

        /* Шаг 2. отображаем в реальном времени все возможные варианты комбинаций
          - на каждый из всех вариантов ввода переменных (a, b, c, d) получаем актуальный result метода
        */
        System.out.println("TTTT " + TTTT);  //1
        System.out.println("TTTF " + TTTF);  //2
        System.out.println("TTFT " + TTFT);  //3
        System.out.println("TTFF " + TTFF + " <- to te TRUE");  //4
        System.out.println("TFTT " + TFTT);  //5
        System.out.println("TFTF " + TFTF + " <- to te TRUE");  //6
        System.out.println("TFFT " + TFFT + " <- to te TRUE");  //7
        System.out.println("TFFF " + TFFF);  //8
        System.out.println("FTTT " + FTTT);  //9
        System.out.println("FTTF " + FTTF + " <- to te TRUE");  //10
        System.out.println("FTFT " + FTFT + " <- to te TRUE");  //11
        System.out.println("FTFF " + FTFF);  //12
        System.out.println("FFTT " + FFTT + " <- to te TRUE");  //13
        System.out.println("FFTF " + FFTF);  //14
        System.out.println("FFFT " + FFFT);  //15
        System.out.println("FFFF " + FFFF);  //16

        //одной строкой все варинты, которые должны возвращать TRUE
        System.out.println("\nMUST BE TRUE: " + TTFF + " " + TFTF + " " + TFFT + " " + FTTF + " " + FTFT + " " + FFTT);


    }

    //Метод выводящий общий boolean
    private static boolean boolianExpression(boolean a, boolean b, boolean c, boolean d) {

        /*Шаг 4. Для всех MUST BE TRUE вариантов пишем формулу возвращающую TRUE:
        Пример:
          - Набор: TTFF
          - формула: (a & b & (!c) & (!d))
          - описание: переменные, которые на входе FALSE мы переводим в TRUE c помощью (!)
         */


        /* Шаг 5. Все MUST BE TRUE варианты проверяем на методе boolianExpression()
          - Проверенные result записываем в общую формулу, разделяем их (||)
        */

        /* Должны получится такие формулы:
        1. TTFF: ((a) & (b) & (!c) & (!d))
        2. TFTF: ((a) & (!b) & (c) & (!d))
        3. TFFT: ((a) & (!b) & (!c) & (d))
        4. FTTF: ((!a) & (b) & (c) & (!d))
        5. FTFT: ((!a) & (b) & (!c) & (d))
        6. FFTT: ((!a) & (!b) & (c) & (d))
        */

        /*
        ИТОГО: TTFF: ((a) & (b) & (!c) & (!d)) || ((a) & (!b) & (c) & (!d)) || ((a) & (!b) & (!c) & (d)) || ((!a) & (b) & (c) & (!d)) || ((!a) & (b) & (!c) & (d)) || ((!a) & (!b) & (c) & (d))
         */


        boolean result = ((a) & (b) & (!c) & (!d)) || ((a) & (!b) & (c) & (!d)) || ((a) & (!b) & (!c) & (d)) || ((!a) & (b) & (c) & (!d)) || ((!a) & (b) & (!c) & (d)) || ((!a) & (!b) & (c) & (d));

        /*
            != - отрицание
            && - И
            || - ИЛИ
            ^ - исключающее или
        */

        return (result);
    }
}
