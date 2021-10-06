package org.example.entity;
// перечисление ЦветГоршка

public enum PotColor {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    GREEN("Green"),
    BLUE("Blue");

    private final String value;

    PotColor(String value) {
        this.value = value;
    }
}
