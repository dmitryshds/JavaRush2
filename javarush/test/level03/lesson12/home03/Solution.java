package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {

    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String namber=reader.readLine();
        int nmb=Integer.parseInt(namber);

    System.out.print("Я буду зарабатывать $"+nmb+"  в час");
    }
}