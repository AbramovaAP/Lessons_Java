package Lesson5;

import java.util.*;
 
public class Ex001_HashMap {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();//коллекция МАР<тип ключа, тип значения> = имя коллекции
        db.putIfAbsent(1, "один"); 
        db.put(2, "два"); 
        db.put(null, "!null"); 
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44)); // null
        db.remove(null); // удаляем элемент со значением null
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true
        System.out.println(db.containsValue(1)); // false
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); //[1, 2]
        System.out.println(db.values()); // [один, два]
    }
}