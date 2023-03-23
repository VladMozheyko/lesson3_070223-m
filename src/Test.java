import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    /*
    Основная тема - взаимодействие с пользователем
    План занятия
    1) Повторение
    2) Консольный ввод в Java - класс Scanner
    3) Манипуляции с пользовательским вводом
    4) Переполнение типа
    5*) Глобальные и локальные переменные
     */

    /*
    Теория
    В Java блоки задаются фигурными скобками. Класс содержит в себе переменные и методы. Методов в классе может быть несколько.
    Если переменная определена(декларирована) в методе, то она называется локальной и видна только в методе, если переменная
    определена(декларирована) в классе, то она видна всем методам этого класса и называется глобальной.
    Если метод в своей сигнатуре имеет слово static, значит он может вызывать только такие же методы со словом static и
    использовать только такие же переменные со cловом static
    Перед классом находится импорт(import) библиотек, которые использует класс

    String в Java это исключение - т.е. другие сслыочне типа создаются по конструкции:

    Тип  названиае переменной = new Тип() - Конструктор;
                              Параметр
    Scanner sc = new Scanner(System.in)

    Scanner - класс для чтения ввода из консоли

    System.out.printf("тип и количество символов выводимого значения", сами значения)  -  оператор форматированного
    вывода
    \n - в тексте означает инструкция перейти на следующую строку
     */

    /*
    Заметки
    Метод main всегда cтатический, чтобы иметь доступ к глобальным переменным, мы должны объявлять их статическими
    new - выделение памяти под объект
     */

    /*
    Доп. задания
    1) Перевести из двоичную системы в десятичную
    2) Перевести из десятичной системы в троичную
    3) Через if обработать некорректный ввод
     */

    static Scanner sc = new Scanner(System.in); // Создаем переменную sc типа Scanner для чтения ввода из консоли
    public static void main(String[] args) {    // Точка входа. Никогда не меняется сигнатура
          byte b = 5;           // 00010101
          int i = 1000;

         // b = i;    неявно преобразовать нельзя, т.к. int больше byte
        b = (byte) i;            // Преобращование возможно, но ответсвенность за корректность этого преобразования несет программист

        System.out.println(b);   // Случай когда число не вместилось в byte - произоизошло перемполнение

        int d = 120;

        b = (byte)d;             // Случай когда число вместилось в byte

        System.out.println(b);

        int a = 1000000000 + 2000000000; // В int не вмещается  3 млрд, поэтому происходит переполнение типа и мы получаем отрицательное число

        System.out.println(a);

        long l = 1000000000l + 2000000000l;  // Выделяем больше память для каждого числа и записываем сумму в long

        System.out.println(l);

//        System.out.println("Введите строку: "); // Вывожу приглашение ввести строку
//        String str = sc.nextLine();                 // Считывание строки
//        System.out.println("Вы ввели: " + str); // Вывод введенной строки

//        System.out.println("Введите возраст: " );
//        int age = sc.nextInt();
//        System.out.println("Возраст: " + age);

//        System.out.println("Введите вес: ");
//        float weight = sc.nextFloat();
//        System.out.println("Вес: " + weight);


//        System.out.println("Введите Ваш пол:");
//        char gender = sc.next().charAt(0);
//        System.out.println("Ваш пол: " + gender);

//        System.out.println("Введите возраст: ");
//        byte age = sc.nextByte();
//        System.out.println("Ваш возраст: " + age);

//        System.out.println("Введите дату рождения: ");
//        String str = sc.next();
//        System.out.println("Дата рождения: "+str);
//
//        System.out.println("Введите возраст:");
//        short age = sc.nextShort();
//        System.out.println("Введите вес:");
//        float weight = sc.nextFloat();
//        System.out.println("Введите имя: ");
//        String name = sc.next();
//        System.out.println("|-----------|------------|---------|");
//        System.out.println("|---Имя-----|----Вес-----|-Возраст-|");
//        System.out.println("|-" +name+"-|---" + weight + "-----|---" + age + "----|");
//        System.out.println("|-----------|------------|---------|");
//
//        System.out.println("Таблица созданная форматированием: ");
//
//        System.out.println("|-----------|-------|---------|");
//        System.out.println("|---Имя-----|--Вес--|-Возраст-|");
//        System.out.printf("|%11s| %6.2f| %8d|\n", name, weight, age);
//        System.out.println("|-----------|-------|---------|");

        //Задача Сделать распиание: Дисциплина, продолжительность занятия, преподаватель  и стоимость


        /*
        Дз в Скиллдеск
        1) Создать декларировать все примитивные типы как глобальные переменные и как локальные переменные
        2) Считать из консоли каждый примитивный тип и присвоить его переменной.
        3) Вывести все типы в таблицу при помощи println() и printf()
         */


    }
}

