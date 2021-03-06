package com.javarush.test.level20.lesson04.task05;

import java.io.*;

/* Как сериализовать что-то свое?
Сделайте так, чтобы сериализация класса Object была возможной
*/
public class Solution implements Serializable{
    public static class Object implements Serializable{
        public String string1;
        public String string2;
        public static void serializeStatic(ObjectOutputStream oos) throws IOException {

                           oos.writeObject(countStrings);
                       }
                       public static void deserializeStatic(ObjectInputStream ois) throws IOException, ClassNotFoundException {
                           Solution.countStrings = (int) ois.readObject();
                       }

    }

    public static int countStrings;

    public static class String implements Serializable{
        private final int number;

        public String() {
            number = ++countStrings;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }




}
