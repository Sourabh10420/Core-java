package co.in.rays.SetterGetter;
public class Bike{

	private String nameOfBike=null;
	private String categry=null;
	private int model=0;
	private double average=0.0;
	private int strocks=0;

	public void setNameOfBike(String nameOfBike){
	this.nameOfBike=nameOfBike;
	}
	public String getNameOfBike(){
	return nameOfBike;
	}
	public void setCategry(String categry){
	this.categry=categry;
	}
	public String getCategry(){
	return categry;
	}
	public void setModel(int model){
	this.model=model;
	}
	public int getModel(){
	return model;
	}
	public void setAverage(double average){
	this.average=average;
	}
	public double getAverage(){
	return average;
	}
	public void setStrocks(int strocks){
	this.strocks=strocks;
	}
	public int getStrocks(){
	return strocks;
	}
	
}