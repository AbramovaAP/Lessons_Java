package Lesson2;

public class Program_2 {
    public static void main(String[] args) {
    String[] name = { "C", "е", "р", "г", "е", "й" };
    String sk = "СЕРГЕЙ КА.";
    System.out.println(sk.toLowerCase()); // сергей ка.
    System.out.println(String.join("", name)); 
    System.out.println(String.join("", "C", "е", "р", "г", "е", "й"));// Cергей
    System.out.println(String.join(",", "C", "е", "р", "г", "е", "й"));// C,е,р,г,е,й
    }
    }