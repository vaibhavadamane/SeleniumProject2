package Demo;

import java.util.Scanner;

public class AllLogicalProg1 
{
public static void main(String[] args) 
{
	//Add a num
//	int num = 100131, sum=0;
//	while(num>0)
//	{
//		int temp = num%10;
//		num = num/10;
//		sum =sum + temp;
//	}
//	System.out.println("Sum of num = " + sum);
	
//	Aramstrong Number 0,1,153,370,371,407
//	int num =153;
//	int sum=0;
//	int num1 =num;
//    while(num>0)
//    {
//    	int temp = num%10;
//    	num = num/10;
//    	sum = sum + (temp*temp*temp);
//    }
//    System.out.println(sum);
//    if(num1==sum)
//    {
//    	System.out.println("This is Armstrong Number");
//    }
//    else
//    {
//    	System.out.println("this is not a Armstrong Number");
//    }
	
//	Even Odd number
//	int num=1934088;
//	if(num%2==0)
//	{
//		System.out.println(num + " Is Even Number");
//	}
//	else
//	{
//		System.out.println(num + " Is Odd Number");
//	}
	

//	Factorial Number 10!
//	int fact=1;
//	for(int i=1;i<=5;i++)
//	{
//		fact = fact * i;
//	}
//	System.out.println("Value of 10! = " + fact);
		
//Palindrome Number/Reverse Number
//	int num =10001;
//	char c;
//	String str1 = "";
//	String str = Integer.toString(num);
//	for(int i=str.length()-1;i>=0;i--)
//	{
//		c = str.charAt(i);
//		str1 = str1 + c;
//	}
//	System.out.println("Reverse String = " + str1);		
//	System.out.println(str);
//	if(str.equals(str1))//Imp thing
//	{
//		System.out.println("Palindrom Number");
//	}
//	else
//	{
//		System.out.println("Not Palindrome Number");
//	}
	
//	prime Number
//	int num=13,count=0;
//	for(int i=2;i<13;i++)
//	{
//		if(num%i==0)
//		{
//			count++;
//			break;
//		}
//	}
//	if(count==1)
//	{
//	System.out.println(num + " is not prime number");
//	}
//	else
//	{
//		System.out.println(num + " is prime number");
//	}
	
//	Fibonacci Series
//	In fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 
//	13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.   
	
// int num1 =0,num2=1,num3;int count=10;
// System.out.print("Fibonacci Series = " + num1 + " " + num2);
// for(int i=1;i<count;i++)
// {
//	 num3 = num1 + num2;
//	 System.out.print(" " + num3);
//	 num1=num2;
//	 num2=num3;
// }
// 
//	Perfect Number:- A number whose sum of factors (excluding the number itself) is equal to the number 
//	is called a perfect number.examples 6,28,128,496
	
//	System.out.println("Pleses insert the Number");
//	Scanner s = new Scanner(System.in);
//	int num = s.nextInt();
//	int sum=0;
//	int i=1;
//	while(i<=num/2)
//	{
//		if(num%i==0)
//		{
//			sum=sum+i;
//			System.out.println("Factor of num = " + i + " ");
//		}
//		i++;
//	}
//	if(num==sum)
//	{
//		System.out.println(num + " is Perfect Number");
//	}
//	else
//	{
//		System.out.println(num + " is not Perfect Number");
//	}
//}

//	Reverse String/Palindrome String
//	String str = "MadaM";
//	String str1 = "";
//	char c;
//	for(int i=str.length()-1;i>=0;i--)
//	{
//		c = str.charAt(i);
//		str1 = str1 + c;
//	}
//	System.out.println(str1);
//	if(str.equals(str1))
//	{
//		System.out.println(str1 + " Palindrome String");
//	}
//	else
//	{
//		System.out.println(str1 + " Not a Palindrome String");
//	}
//	
	String sent = "My Name is Vaibhav Adamane";
	String spilt[] = sent.split(" ");
	System.out.println(sent.length());
	System.out.println(spilt.length);
	System.out.print("Original String spilt By spilt method = ");
	for(String value:spilt)
	{
		System.out.print(value + " ");
	}
	System.out.print("\nReverse the Sentances = ");

	for(int i=spilt.length-1;i>=0;i--)
	{
		System.out.print(spilt[i] + " ");
		
	}
	System.out.print("\nRev each world in the sentances = ");
	String revsent[] = new String[5];
	char c ;
	String world ="";
	for(int i=0;i<spilt.length;i++)
	{
		world = "";
		for(int j=0;j<spilt[i].length();j++)
		{
			c = spilt[i].charAt(j);
			world = c + world;
		}
		revsent[i] = world;
	}
	for(String value:revsent)
	{
		System.out.print(value + " ");
	}
	
	
}

}