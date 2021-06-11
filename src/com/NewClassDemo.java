package com;

public class NewClassDemo {

	public void m1()
	{
		String str="deepti";
		if(str.equalsIgnoreCase("deepti"))
		{
			System.out.println("success");
		}
		else
		{
		
		System.out.println("fail");
		}

	}
	
	
	public static void main(String[] args) {
		
		NewClassDemo np=new NewClassDemo();
		{
			np.m1();
		}


	}

}
