package co.in.rays.SetterGetter;
public class Country{

	private String nameOfCountry=null;
	private String nationalLanguage=null;
	private double area=0.0;
	private long population=0;
	private String capital=null;

	public void setNameOfCountry(String nameOfCountry){
		this.nameOfCountry=nameOfCountry;
	}
	public String getNameOfCountry(){
		return nameOfCountry;
	}
	public void setNationalLanguage(String nationalLanguage){
		this.nationalLanguage=nationalLanguage;
	}
	public String getNationalLanguage(){
		return nationalLanguage;
	}
	public void setArea(double area){
		this.area=area;
	}
	public double getArea(){
		return area;
	}
	public void setPopulation(long population){
		this.population=population;
	}
	public long getPopulation(){
		return population;
	}
	public void setCapital(String capital){
		this.capital=capital;
	}
	public String getCapital(){
		return capital;
	}
}