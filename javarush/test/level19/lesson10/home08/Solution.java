package com.javarush.test.level19.lesson10.home08;

/* Перевертыши
1 Считать с консоли имя файла.
2 Для каждой строки в файле:
2.1 переставить все символы в обратном порядке
2.2 вывести на экран
3 Закрыть поток

Пример тела входного файла:
я - программист.
Амиго

Пример результата:
.тсиммаргорп - я
огимА
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();
        reader = new BufferedReader(new FileReader(filename));

        while (reader.ready())
        {
            String data = reader.readLine();
            StringBuilder sb = new StringBuilder(data);
           String rezult = sb.reverse().toString();
            System.out.println(rezult);


        }
        reader.close();

    }
}
