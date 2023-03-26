//Write a program to take 3 numbers and find the greatest of all the 3 numbers

class greatest 
{
	public static void main(String[] args) 
	{
		int a=30,b=45,c=60;//initializing the variables

		if (a>b && a>c)//condition
		{
			System.out.println("a is greater: "+a); //printing output
		}
			else if (b>c)
			{
				System.out.println("b is greater: "+b);//printing output
			}
		else
		{
			System.out.println("c is greater: "+c);//printing output
		}
	
	}
}

