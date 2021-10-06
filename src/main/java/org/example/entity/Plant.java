package org.example.entity;
// суперкласс Растение

public abstract class Plant {
    private String plantTitle;      // название растения
    private int growthRate;		    // скорость роста 0-10
    private int waterСonsumption; 	// потребление воды 0-10
    public PotColor myColor;		// цвет горшка из перечисления

    public void plantDescription() {        // классический метод для печати свойств Растения
        System.out.println("Plant description:");
        System.out.print("plantTitle: ");
        System.out.println(plantTitle);
        System.out.print("growthRate: ");
        System.out.println(growthRate);
        System.out.print("waterСonsumption: ");
        System.out.println(waterСonsumption);
        System.out.println("myColor: ");
        System.out.println(myColor);
            }

    @Override
    public String toString(){               // переопределенный стандартный метод печати свойств
        return "Plant description: " +
                "plantTitle " + plantTitle + ", " +
                "growthRate " + growthRate + ", " +
                "waterСonsumption " + waterСonsumption + ", " +
                "myColor: " + myColor;

    }

   public Plant(String plantTitle, int growthRate, int waterСonsumption, PotColor myColor) {
        this.plantTitle = plantTitle;
        this.growthRate = growthRate;
        this.waterСonsumption = waterСonsumption;
        this.myColor = myColor;
            }

    public String getPlantTitle() {
        return plantTitle;
    }

    public void setPlantTitle(String plantTitle) {
        this.plantTitle = plantTitle;
    }

    public int getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(int growthRate) {
        this.growthRate = growthRate;
    }

    public int getWaterСonsumption() {
        return waterСonsumption;
    }

    public void setWaterСonsumption(int waterСonsumption) {
        this.waterСonsumption = waterСonsumption;
    }
/*
    public PotColor getMyColor() {
        return myColor;
    }

    public void setMyColor(PotColor myColor) {
        this.myColor = myColor;
    }*/
}

