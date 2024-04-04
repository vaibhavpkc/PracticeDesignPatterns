package Creational.AbstractFactory.Example2;

import Creational.AbstractFactory.Example2.BaseClasses.*;

public abstract class Pizza {
	public String name;

	public Dough dough;
	public Sauce sauce;
	public Veggies veggies[];
	public Cheese cheese;
	public Pepperoni pepperoni;
	public Clams clam;

	/**
	 * Making the prepare method as abstract
	 */
	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}

	public  void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		StringBuffer strResult = new StringBuffer();
		strResult.append("--------"+ name +"-----------\n");
		if(dough!=null){
			strResult.append(dough);
			strResult.append("\n");
		}
		if(sauce!=null){
			strResult.append(sauce);
			strResult.append("\n");
		}
		if (cheese != null) {
			strResult.append(cheese);
			strResult.append("\n");
		}
		if(veggies!=null){
			for(int i=0;i<veggies.length;i++){
				strResult.append(veggies[i]);
				if(i< veggies.length-1){
					strResult.append(",");
				}
			}
			strResult.append("\n");
		}
		if (clam != null) {
			strResult.append(clam);
			strResult.append("\n");
		}
		if (pepperoni != null) {
			strResult.append(pepperoni);
			strResult.append("\n");
		}
		return strResult.toString();
	}
}
