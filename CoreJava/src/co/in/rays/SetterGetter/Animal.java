package co.in.rays.SetterGetter;
public class Animal{

	private String name="";
	private String colour="";
	private int weight=0;
	private double height=0.0;

	public void setNameOfAnimal(String name){
	this.name=name;
	}
	public String getNameOfAnimal(){
	return name;
	}
	public void setColour(String colour){
	this.colour=colour;
	}
	public String getColour(){
	return colour;
	}
	public void setWeight(int weight){
	this.weight=weight;
	}
	public int getWeight(){
	return weight;
	}
	public void setHeight(double weight){
	this.height=height;
	}
	public double getHeight(){
	return height;
	}
}