package com.sdet.Learning;

public class ExtractandSumNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "ramya12test30api5";
		int sum =0;
		String number ="";
		
		for (int i=0; i< str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				number+= str.charAt(i);				
				sum +=Integer.parseInt(number);
				number ="";
				System.out.println(sum);
			}
		}
		
		System.out.println("Sum is " + sum);
	}

}
