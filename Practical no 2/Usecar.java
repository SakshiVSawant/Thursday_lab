

//3. Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
//Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type".
//Create an object of the Car class and call both the "drive" and "type" methods. 


class vechicle
{
String brand;
String model;
int year;

	 vechicle(String brand, String model, int year)
	{
	this.brand=brand;
	this.model=model;
	this.year=year;
	}
	
	public void drive()
	{
	 System.out.println("Driving"+ " " + brand + " " + model + " " + year);
	}
}

class Car extends vechicle
{
private String color="BLACK";

public Car(String brand,String model, int year)
{
super(brand, model, year);
this.color=color;
}

	public void type()
	{
	 System.out.println("Type: Car"+ brand +"  "+ model+ " " + year + " "+ color);
	}
}

public class Usecar
{
 public static void main(String args[])
 {
 Car c1=new Car("Nano","MH17",2020);
 c1.drive();
 c1.type();
 }
}