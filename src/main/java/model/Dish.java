package model;

/**
 * Created by Yaroslav on 23.01.2016.
 */
public class Dish {

    private String image;
    private String name;
    private String descriptions;
    private Double cost;
    private Category category;

    public Dish() {
    }

    public Dish(String name, String descriptions, Double cost, Category category) {
        this.name = name;
        this.descriptions = descriptions;
        this.cost = cost;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }


    public Category getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setCategory(Category category) {
        this.category = category;
    }


}
