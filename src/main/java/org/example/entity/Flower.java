package org.example.entity;
// класс Цветок

public class Flower extends Plant {
    private int height;	    // высота цветка (нет в Plant)
    private double cost;		// стоимость цветка (нет в Plant)

    public Flower(String plantTitle, int growthRate, PotColor myColor, int waterСonsumption, int height, double cost) {
        super(plantTitle, growthRate, waterСonsumption, myColor);
        this.height = height;
        this.cost = cost;
    }

    public String whatColor() {             // узнаем цвет горшка и красим текст
        if (myColor == PotColor.RED) {
            return "\u001B[31m" + "Red " + "\u001B[0m" ;
        } else if (myColor == PotColor.GREEN) {
            return "\u001B[32m" + "Green" + "\u001B[0m";
        } else if (myColor == PotColor.BLUE) {
            return "\u001B[34m" + "Blue" + "\u001B[0m";
        } else {
            return "Black/White";
        }
    }

    @Override
    public String toString(){               // переопределенный стандартный метод печати свойств
        return "Flower description: " +
                "plantTitle " + getPlantTitle() + ", " +
                "growthRate " + getGrowthRate() + ", " +
                "PotColor: " + whatColor() + ", " +
                "waterСonsumption " + getWaterСonsumption() + ", " +
                "height " + height + ", " +
                "cost " + cost ;

    }
    public void goBloom() {
        System.out.print("Its time to bloom!" + "\n" + "\u001B[33m" +
        "$$$$(¯`v´¯)" + "\n" +
        "___(¯`(♥)´¯)" + "\n" +
        "___$(_.^._)$$$$" + "\n" + "\u001B[0m");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
