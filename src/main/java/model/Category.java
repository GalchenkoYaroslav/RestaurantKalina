package model;

/**
 * Created by Yaroslav on 24.01.2016.
 */
public class Category {
    public String getDrinks() {
        return drinks;
    }

    public Category() {
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getMeatDishes() {
        return meatDishes;
    }

    public void setMeatDishes(String meatDishes) {
        this.meatDishes = meatDishes;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    private String drinks;
    private String meat;
    private String meatDishes;
    private String dessert;
}
