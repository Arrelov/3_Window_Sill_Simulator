package org.example.entity;

//Импорт не нужен, пока все файлы с классами в одной папке с main
//import org.example.entity.Plant;
//import org.example.entity.PotColor;
//import org.example.entity.Flower;


public class Application {
    public static void main(String[] args) {
            // создаем Розу
        //Plant rose = new Plant("Rose",10,5); // этот метод работал до Plant -> abstract
        //rose.plantDescription();             // классический вывод
        //System.out.println(rose);             // стандартный вывод
            // создаем Магнолию
        Flower magnolia = new Flower("Magnolia",4, PotColor.RED,8, 80, 4.39);
        //magnolia.plantDescription();          // классический вывод
        System.out.println(magnolia);
        //System.out.println(magnolia.whatColor()); // какой цвет
        System.out.println("");
        //System.out.println("\u001B[31m" + "This text is red!" + "\u001B[0m"); // цветной текст
            // создаем Ландыш
        Flower lily = new Flower("Lily",6, PotColor.GREEN,8, 118, 9.99);
        System.out.println(lily);
        lily.goBloom();                 // Лилия: *расцветает*
        System.out.println("");
            // создаем Тюльпан (объявляя его через Plant)
        Plant tulip = new Flower("tulip",8, PotColor.BLUE,3, 40, 6.69);
        System.out.println(tulip);
        System.out.println("");
            // создаем Ромашку
        Flower сhamomile = new Flower("Chamomile",8, PotColor.BLUE,3, 40, 6.69);
        System.out.println(сhamomile);

    }
}
