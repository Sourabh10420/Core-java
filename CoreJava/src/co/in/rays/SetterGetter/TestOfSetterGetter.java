package co.in.rays.SetterGetter;
public class TestOfSetterGetter{

	public static void main(String[] args){
	System.out.println("you are enter in Animal class\n");
	Animal a=new Animal();

	a.setNameOfAnimal("cow");
	a.setColour("white");
	a.setWeight(150);
	a.setHeight(6.000);
	
	String name=a.getNameOfAnimal();
	String colour =a.getColour();
	int weight=a.getWeight();
	double h=a.getHeight();
	
	System.out.println(name);
	System.out.println(colour);
	System.out.println(weight);
	System.out.println(h) ;
	
	System.out.println("you are enter in Country class\n");
	Country c=new Country();
	
	c.setNameOfCountry("India");
	c.setNationalLanguage("Hindi");
	c.setArea(3287263);
	c.setPopulation(1400000000);
	c.setCapital("New Delhi");
	
	String name1=c.getNameOfCountry();
	String language=c.getNationalLanguage();
	double area=c.getArea();
	long population=c.getPopulation();
	String capital=c.getCapital();
	
	System.out.println(name1);
	System.out.println(language);
	System.out.println(area);
	System.out.println(population) ;
	System.out.println(capital);
	
	System.out.println("you are enter in Bike class\n");
	Bike b=new Bike();
	b.setNameOfBike("Royal Enfiled");
	b.setCategry("classic");
	b.setModel(2014);
	b.setAverage(35.5);
	b.setStrocks(5);
	
	String name2=b.getNameOfBike();
	String categry=b.getCategry();
	int model=b.getModel();
	double average=b.getAverage();
	int strocks=b.getStrocks();

	System.out.println(name2);
	System.out.println(categry);
	System.out.println(model);
	System.out.println(average) ;
	System.out.println(strocks);
	
	System.out.println("you are enter in Car class\n");
	Car c1=new Car();
	c1.setBrand("toyota");
	c1.setModel(2018);
	c1.setName("fortunre");
	c1.setPrice(1800000);
	c1.setSitting(7);

	String brand=c1.getBrand();
	int model1=c1.getModel();
	String name3=c1.getName();
	long price=c1.getPrice();
	int sitting=c1.getSitting();
	
	System.out.println(brand);
	System.out.println(model1);
	System.out.println(name3);
	System.out.println(price);
	System.out.println(sitting);
	}		
}