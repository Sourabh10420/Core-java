package co.in.rays.SetterGetter;
public class Car{

	private String brand=null;
	private int model=0;
	private String name=null;
	private long price=0;
	private int sitting=0;
	
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setModel(int model){
		this.model=model;
	}
	public int getModel(){
		return model;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(long price){
		this.price=price;
	}
	public long getPrice(){
		return price;
	}
	public void setSitting(int sitting){
		this.sitting=sitting;
	}
	public int getSitting(){
		return sitting;
	}
}