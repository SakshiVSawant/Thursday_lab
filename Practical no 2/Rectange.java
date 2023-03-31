/*
11, 12 and 14 
Lab assignment of 30-03-03-2023
1. Write a program in java showing overloading and Add method with 2 and 3 parameters
In the user passes 2 values method with 2 parameters should be called if he passes 3 values method with 3 parameters should be called

2. Create a class name rectange with two data members 'length' and 'breadth' and two method to print the area and perimeter of the rectangle respectively 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle
Print the area and perimeter of the reactangle

3. Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type".
Create an object of the Car class and call both the "drive" and "type" methods. 

Not completed: ANP-C4589

*/

/*
2. Create a class name rectange with two data members 'length' and 'breadth' and two method to print the area and perimeter of the rectangle respectively 
Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle
Print the area and perimeter of the reactangle

 */
class rectangle
{
	int length;	//data members
	int breadth;

	rectangle(int l, int b)	//constructor
	{
		this.length=l;
		this.breadth=b;
		System.out.println();
		
		//System.out.println("");	
	}

void area()		//methods
	{
		double area;
		area=length*breadth;
		System.out.println("Area of rectangle: "+area);
	}

	void perimeter()
	{
		double peri;
		peri=2*(length+breadth);
		System.out.println("Perimeter: "+peri);
		
	}
}
public class Rectange
{
	public static void main(String[] args) 
	{
		rectangle r1= new rectangle(10,20);
		r1.area();
		r1.perimeter();
		//System.out.println("Hello World!");
	}
}