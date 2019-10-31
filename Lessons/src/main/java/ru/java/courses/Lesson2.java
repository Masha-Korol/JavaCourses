package ru.java.courses;

import java.util.Scanner;

class Lesson2 {

    /**
     * Нужно реализовать формулу y = √(13x + 13/x)
     * Подсказка: квадратный корень вычисляется функцией Math.sqrt()
     *
     * @param x на текущем этапе входное значение будет больше нуля
     *
     * @return возвращаем только целую часть от полученного результата,
     * хвост отбрасываем без откругления
     */

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        Lesson2 lesson=new Lesson2();

        System.out.print("Введите x = ");
        int answer=s.nextInt();
        Integer result=lesson.formula(answer);
        System.out.println("Ответ =  " + result);

        System.out.println("Введите ФИО: ");
        String new_string=s.nextLine();
        new_string=s.nextLine();
        //System.out.println(new_string);
        String result_string=lesson.initials(new_string);
        System.out.println("Инициалы: "+result_string);
    }

    static int formula(int x)
    {
        int result=(int)Math.sqrt(13*x+13/x);
        return result;
    }

    /**
     * Нужно привести строку с полным именем к инициалам.
     * Например, "Иванов Петр Александрович" → "И.П.А."
     * Подсказка:
     * разделение строки на части: .split(" ");
     * получение символа на определенной позиции: .charAt();
     * приведение к верхнему регистру: .toUpperCase();
     *
     * @param fullName на текущем этапе имена будут состоять из имени, фамили и отчества, разделяться пробелами.
     *                 Регистр букв во входном параметре может быть любым.
     *
     * @return возвращаем инициалы в верхнем регистре разделенные точкой, как в примере выше
     */
    static String initials(String fullName)
    {
        String result_string=new String();
        for(String current_string : fullName.split(" "))
        {
            result_string = result_string + current_string.charAt(0) + ".";
        }
        return result_string.toUpperCase();
    }
}
