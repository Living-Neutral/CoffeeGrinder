package com.NuclearNode.CoffeeGrinder;


import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class StarbucksDrink 
{
	
    @Id
	private String name;
	private String description;
	private String type;
	private String category;
	private float sugar_content;
	private float serving_size;
	private float relative_sugar;
	private boolean dairy;
	private boolean soy;
	private boolean tree_nuts;
	private boolean espresso;
	private boolean wheat;
	private boolean sweetness;
	private boolean fruity;
	
	StarbucksDrink()
	{
	
	}
	
	StarbucksDrink(String n,String desc, String t, String cat, float sug_con, float serv_s, 
			float rel_sug, boolean dry,boolean sy, boolean t_nuts, boolean esp, boolean wht, boolean swtnss, boolean frty)
	{
		name = n;
		description = desc;
		type = t;
		category = cat;
		sugar_content= sug_con;
		serving_size=serv_s;
		relative_sugar= rel_sug;
		dairy = dry ;
		soy = sy;
		tree_nuts = t_nuts;
		espresso = esp;
		wheat = wht;
		sweetness = swtnss;
		fruity = frty;
	}

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public float getSugar_content() {
		return sugar_content;
	}

	public void setSugar_content(float sugar_content) {
		this.sugar_content = sugar_content;
	}

	public float getServing_size() {
		return serving_size;
	}

	public void setServing_size(float serving_size) {
		this.serving_size = serving_size;
	}

	public float getRelative_sugar() {
		return relative_sugar;
	}

	public void setRelative_sugar(float relative_sugar) {
		this.relative_sugar = relative_sugar;
	}

	public boolean isDairy() {
		return dairy;
	}

	public void setDairy(boolean dairy) {
		this.dairy = dairy;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean isTree_nuts() {
		return tree_nuts;
	}

	public void setTree_nuts(boolean tree_nuts) {
		this.tree_nuts = tree_nuts;
	}

	public boolean isEspresso() {
		return espresso;
	}

	public void setEspresso(boolean espresso) {
		this.espresso = espresso;
	}

	public boolean isWheat() {
		return wheat;
	}

	public void setWheat(boolean wheat) {
		this.wheat = wheat;
	}

	public boolean isSweetness() {
		return sweetness;
	}

	public void setSweetness(boolean sweetness) {
		this.sweetness = sweetness;
	}

	public boolean isFruity() {
		return fruity;
	}

	public void setFruity(boolean fruity) {
		this.fruity = fruity;
	}
	
}
