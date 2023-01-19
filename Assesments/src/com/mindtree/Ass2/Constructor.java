package com.mindtree.Ass2;
/*
 * 28/11/2022- Assesment-2
 * Saravanan
 */
public class Constructor {

	String name;
	static String dob;
	Constructor()
	{
		this("Mindtree");
		System.out.println("Const1----");
	}
	Constructor(String name)
	{
		
		this("LNTM","2002-01-01");
		System.out.println("Const2----"+name);
	}
	Constructor(String name,String dob)
	{
		System.out.println("Const3----"+name);
	}
	
	public static void main(String args[])
	{
		
		Constructor constru1= new Constructor();
	}
}
