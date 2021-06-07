package com.github.panarik.javaLesson.lang.massive;

public class MassiveInt {


    public static void main(String[] args) {

        int[] intMassive = new int[5];
        intMassive[0] = 10;
        intMassive[1] = 9000;
        intMassive[2] = 5;
        intMassive[3] = 55;
        intMassive[4] = -200;



        //суммируем
        int sum = 0;
        for (int i = 0; i < intMassive.length; i++) {
            sum = sum + intMassive[i];
            System.out.println("sum [" + i + "] = " + sum);
        }
        System.out.println("ИТОГО: " + sum);

        //ищем значение
        for (int i = 0; i < intMassive.length; i++) {
            System.out.println("перебираю элемент["+i+"]: = "+intMassive[i]);
            if (intMassive[i] == 5) {
                System.out.println("в элементе №"+i+" Нашел 5!");
                break;
            }
        }
        System.out.println("ГОТОВО!");


        // по условию пропускаем итерации в цикле.
        // тут нати ошибку. Скорее всего в условии поставить вместо номера само значение в текущем элементе
        for (int i = 0; i< intMassive.length; i++) {
            if (i % 2 != 0) continue;
            System.out.println("Число "+intMassive[i]+" - четное");
        }



    }


}
