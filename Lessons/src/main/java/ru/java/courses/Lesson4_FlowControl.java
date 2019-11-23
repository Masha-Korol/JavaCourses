package ru.java.courses;

import java.sql.SQLOutput;

public class Lesson4_FlowControl {

    /**
     * В рамках задания необходимо найти в полученном массиве строк самую длинную
     * и вернуть ее в результате выполнени метода.
     * Если таких строк окажется несколько - возвращаем первую найденную.
     * <p>
     * Например, для массива {"Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души"}
     * ответом будет "Вишнеый сад".
     * <p>
     * Подсказка: массив может быть пустой
     *
     * @param strings массив строк случайной длины
     *
     * @return самую длинную строку из полученного массива
     */
    public static String task1(String[] strings)
    {
        if(strings.length==0)
            return "";

        String str=strings[0];
        int max_length=strings[0].length();
        for(int i=1;i<strings.length;i++)
            if(strings[i].length()>max_length)
            {
                max_length=strings[i].length();
                str=strings[i];
            }
        return str;
    }

    /**
     * В рамках задания необходимо реализовать микро-калькулятор.
     *  В качестве входных параметров будут два числа i и k, а так же символ указывающий на операцию:
     * + - сложение i и k
     * - - вычитание k из i
     * * - умножение i на k
     * / - деление i на k
     * % - остаток от деления i на k
     * <p>
     * Как мы помним, на 0 делить нельзя. В этом случае просто возвращаем 0.
     * <p>
     * Подсказка: переданный символ операции может быть не из списка выше
     *
     * @param i         первый числовой параметр
     * @param k         второй числовой параметр
     * @param operation символ, указывающий на операцию
     *
     * @return целочисленный результат выполнения операции
     */
    public static int task2(int i, int k, char operation)
    {
        switch (operation)
        {
            case('+'):
                return i+k;
            case('-'):
                return i-k;
            case('*'):
                return i*k;
            case('/'):
                return k==0 ? 0 : i/k;
            case('%'):
                return k==0 ? 0 : i%k;
            default:
                System.out.println("Введенного оператора нет, повторите ввод");
        }
        return 0;
    }
}
