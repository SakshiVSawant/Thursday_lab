/*1. Write a program in java showing overloading and Add method with 2 and 3 parameters
In the user passes 2 values method with 2 parameters should be called if he passes 3 values method with 3 parameters should be called
*/

class add
{

	void Add(int a , int b)	//creating method with 2 para
	{
		System.out.println("This  is a method with 2 parameters"+ a +"  "+b);
	}


	void Add(int a , int b, int c)	//creating method with 3 para
	{
		System.out.println("This  is a method with to parameters"+ a +" "+b +" "+c);
	}
}


class Useadd
{
	public static void main(String args [])
	{
		add a1 = new add();	//creating an object
		a1.Add(10,20);
		a1.Add(20,30,40);
	}
}