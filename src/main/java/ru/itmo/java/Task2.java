package ru.itmo.java;

import java.util.Objects;

@SuppressWarnings("all")
public class Task2 {

    /**
     * Дано произвольное вещественное число. Выведите его дробную часть
     * <p>
     * Например
     * - дано 17.9
     * - вывод 0.9
     */
    double getFractionalPart(double realNumber) {
        int intpart = (int)(realNumber/1);
        return realNumber-intpart;
    }

    /**
     * Дан символ, верните его код. Не используйте явное приведение типов и любые библиотечные функции
     */
    int charCode(char c) {
        int res = c + 0;
        return res;
    }

    /**
     * Даны 2 целых числа. Проверьте равны ли они
     */
    boolean testIfIntsEqual(Integer a, Integer b) {
        return a.equals(b);
    }

    /**
     * Дано целое число. Выведите {@code true}, если оно входит в заданный диапазон или {@code false}
     * в иных случаях
     *
     * @param number      заданное число
     * @param leftBound   правая граница диапазона
     * @param rightBound  верхняя граница диапазона
     * @param inclusively входят ли границы в заданный даипазон
     */
    boolean numberInRange(Integer number, Integer leftBound, Integer rightBound, Boolean inclusively) {
        if (Objects.isNull(number) || Objects.isNull(leftBound) || Objects.isNull(rightBound) || Objects.isNull(inclusively)) return false;
        if (inclusively){
            if (number >= leftBound && number <= rightBound) return true;
            return false;
        }
        else
            if (number > leftBound && number< rightBound) return true;
            return false;
    }

    /**
     * Даны 3 символа. Определите является ли хотя бы один из них цифрой 1..9
     */
    boolean atLeastOneIsDigit(char c1, char c2, char c3) {
        return Character.isDigit(c1) | Character.isDigit(c2) | Character.isDigit(c3);
    }

    /**
     * Даны два вещественных числа. Определите равны ли они
     */
    boolean areRealNumbersEqual(double a, double b) {
        double c = 0.0001;
        return Math.abs(a-b) < c;
    }

    /**
     * Дано трехзначное число 100 <= N <= 999. Найдите сумму его чисел.
     */
    int sumOfDigits(int n) {
        int last = n % 10;
        int middle = (n / 10) % 10;
        int first = n/100;
        return last+middle+first;
    }

    /**
     * Дано натуральное число N <= 10000. Выведите следующее после N четное число. Например: N = 8, Result = 10
     */
    int nextEvenNumber(int n) {
        if (n%2 == 0)
            return n+2;
        else return n+1;
        }

    /**
     * Школа №32 решила создать 3 дополнительных физмат класса и укомплектовать кабинеты новыми партами.
     * За одной партой может сидеть 2 ученика. Кол-во учеников в каждом из классов известно (num1, num2, num3).
     * Выведите минимальное кол-во парт, которые нужно приобрести школе, при условии что каждый из классов сидит в
     * своем кабинете
     */
    int schoolDesks(int num1, int num2, int num3) {
        int res = 0;
        int[] studentsArr = new int[]{num1, num2, num3};
        for (int num:studentsArr
             ) {
            if (num % 2 == 0)
                res += num/2;
            else res+=num/2 + 1;
        }
        return res;
    }

    /**
     * Дано натуральное число N >= 10. Выведите результат применения XOR к последним 2-м цифрам числа N
     */
    int xorDigits(int N) {
        int last1 = N %10;
        int last2 = (N%100) /10;
        return last1^last2;
    }
}
