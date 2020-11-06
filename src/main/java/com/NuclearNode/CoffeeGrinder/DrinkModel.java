package com.NuclearNode.CoffeeGrinder;


import javax.persistence.*;

@Entity
@Table(name = "starbucks_drinks")
public class DrinkModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @Column(name = "type")
    String type;

    @Column(name = "temperature")
    Boolean temp;

    @Column(name = "category")
    String category;

    @Column(name = "image")
    String image;

    @Column(name = "sugar content")
    Integer sugar_content;

    @Column(name = "serving size")
    Integer serving_size;

    @Column(name = "relative_sugar")
    Integer relative_sugar;

    @Column(name = "dairy")
    Boolean dairy;

    @Column(name = "soy")
    Boolean soy;

    @Column(name = "treenuts")
    Boolean treenuts;

    @Column(name = "espresso")
    Boolean espresso;

    @Column(name = "wheat")
    Boolean wheat;

    @Column(name = "sweetness")
    Boolean sweetness;

    @Column(name = "fruity")
    Boolean fruity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getTemp() {
        return temp;
    }

    public void setTemp(Boolean temp) {
        this.temp = temp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getSugar_content() {
        return sugar_content;
    }

    public void setSugar_content(Integer sugar_content) {
        this.sugar_content = sugar_content;
    }

    public Integer getServing_size() {
        return serving_size;
    }

    public void setServing_size(Integer serving_size) {
        this.serving_size = serving_size;
    }

    public Integer getRelative_sugar() {
        return relative_sugar;
    }

    public void setRelative_sugar(Integer relative_sugar) {
        this.relative_sugar = relative_sugar;
    }

    public Boolean getDairy() {
        return dairy;
    }

    public void setDairy(Boolean dairy) {
        this.dairy = dairy;
    }

    public Boolean getSoy() {
        return soy;
    }

    public void setSoy(Boolean soy) {
        this.soy = soy;
    }

    public Boolean getTreenuts() {
        return treenuts;
    }

    public void setTreenuts(Boolean treenuts) {
        this.treenuts = treenuts;
    }

    public Boolean getEspresso() {
        return espresso;
    }

    public void setEspresso(Boolean espresso) {
        this.espresso = espresso;
    }

    public Boolean getWheat() {
        return wheat;
    }

    public void setWheat(Boolean wheat) {
        this.wheat = wheat;
    }

    public Boolean getSweetness() {
        return sweetness;
    }

    public void setSweetness(Boolean sweetness) {
        this.sweetness = sweetness;
    }

    public Boolean getFruity() {
        return fruity;
    }

    public void setFruity(Boolean fruity) {
        this.fruity = fruity;
    }
}
