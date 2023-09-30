package Demo;

import java.util.Arrays;

import org.checkerframework.checker.units.qual.Length;

public class AllLogicalProg2 {

	public static void main(String[] args) 
	{
//		Check Wethear the string is contain the duplicate value or not 
		
//		String lang[] = {"java","python","c", "c++","c2"};
//		int count = 0;
//		for(int i=0;i<lang.length;i++)
//		{
//			for(int j=i+1;j<lang.length;j++)
//			{
//				if(lang[i].equals(lang[j]))
//				{
//					count++;
//					break;
//				}
//			}
//		}
//		if(count == 1) 
//		{
//			System.out.println("Duplicate value is exist");
//		}
//		else
//		{
//			System.out.println("Duplicate value is not exist");
//		}
//		
//		Counting the duplicate charcter in the given String
//		String str = "abcedanfkojjsfddef";
//		int duplicatecount = 0;
//		for(int i=0;i<str.length();i++)
//		{
//			for(int j=i+1;j<str.length();j++)
//			{
//				if(str.charAt(i)==str.charAt(j))
//				{
//					duplicatecount++;
//					System.out.print(str.charAt(j));
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("\nTotal duplicte charcter in the given String = " + duplicatecount );
		
//	    Counting the upper case and lower cases.
		
		String str = "VaibhavAdamane";  //Capital=2,small=12;
		int length1 = str.length();
		System.out.println(length1);
		String str1 = str.replaceAll("[^A-Z]", "");
		System.out.println(str1);
		int length2 = str1.length();
		System.out.println(length2);
		int length3 = length1 - length2;
		int length4 = length1 - length3;
		System.out.println("number of total letter in string = "+length1);
		System.out.println("number of lower letter in string = "+length3);
		System.out.println("number of upper letter in string = "+length4);

//		Counting the even and odd digist in given number
		
//		int num= 1948748;
//		String str = Integer.toString(num);
//		int evencount = 0;
//		int oddcount=0;
//		for(int i=0;i<str.length();i++)
//		{
//			if(i%2==0)
//			{
//				evencount++;
//			}
//			else
//			{
//				oddcount++;
//			}
//		}
//		System.out.println("Even Number = " + evencount);
//		System.out.println("Odd Number = " + oddcount);
		
//		Arrange the Leteer and Numbers
//		String str = "ABC123ABC";
//		Output = ABCABC
//				 123
//		String letter = str.replaceAll("[^A-Za-z]","");
//		String num = str.replaceAll("[^0-9]","");
//		System.out.println(letter);
//		System.out.println(num);
		
//	count the vovels and constant of given sentances
		
//	String sent = "My Name is Vaibhav Adamane";	
//	sent.toLowerCase();
//	int vovelscount=0;
//	int constantcount=0;
//	for(int i=0;i<sent.length();i++)
//		
//	{
//		if(sent.charAt(i)=='a' || sent.charAt(i)=='e' || sent.charAt(i)=='i' || sent.charAt(i)=='o' || sent.charAt(i)=='u')
//		{
//			vovelscount++;
//		}
//	    else
//     	{
//		constantcount++;
//	    }
//		
//	}	
//		System.out.println("Total no of Vovels = " + vovelscount);
//		System.out.println("Total no of Constants = " + constantcount);
		
//		Count the character persent in String
		
//		String str = "Jay Shree Ram";
//		int chcount=0;
//		int spacecount=0;
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)==' ')
//			{
//				spacecount++;
//			}
//			else
//			{
//				chcount++;
//			}
//		}
//		System.out.println("Total no of Space = " + spacecount);
//	    System.out.println("Total no of charater = " + chcount);
		
//		Java Program to count the total number of punctuation characters exists in a String
//		punctuation marks (!, . , ' , - , " , ? , ; )
//		String str = "He said, 'The mailman loves you.' I heard ! it with my own ears ?."; 
//		int count=0;
//		for(int i=0;i<str.length();i++)
//		{
//			if(str.charAt(i)=='!' || str.charAt(i)==',' || str.charAt(i)==';' || str.charAt(i)=='.' || str.charAt(i)=='?' )
//			{
//				count++;
//			}
//		}
//		System.out.println("Total no of punctuation = " + count);
		
//		Java Program to determine whether two strings are the anagram
//		Two Strings are called the anagram if they contain the same characters.
//		However, the order or sequence of the characters can be different.	
		
//		 String str1="Brag";  
//	     String str2="Grab";  
//	  
////	     Converting both the string to lower case.  
//	     str1 = str1.toLowerCase();  
//	     str2 = str2.toLowerCase();  
//	  
////         Checking for the length of strings  
//	     if (str1.length() != str2.length()) 
//          {  
//	       System.out.println("Both the strings are not anagram");  
//	      }  
//	      else
//	      {  
////	      Converting both the arrays to character array  
//	      char[] string1 = str1.toCharArray();  
//	      char[] string2 = str2.toCharArray();  
//	  
////        Sorting the arrays using in-built function sort ()  
//	      Arrays.sort(string1);  
//	      Arrays.sort(string2);  
//	 
////	      Comparing both the arrays using in-built function equals ()  
//	      if(Arrays.equals(string1, string2) == true) 
//	      {  
//	            System.out.println("Both the strings are anagram");  
//	      }  
//	      else 
//	      {  
//	            System.out.println("Both the strings are not anagram");  
//	      }  
//	      
//	      }  
	    
	   
		//Java Program to find all subsets of a string
//         String str = "FUN";
//         int legnth = str.length();
//         System.out.println(legnth);
//         int temp = 0;
//         
//		String arr[] = new String[legnth*(legnth+1)/2];
//		for(int i=0;i<legnth;i++)
//		{
//			for(int j=i;j<legnth;j++)
//			{
//				arr[temp] = str.substring(i, j+1);
//				temp++;
//			}
//		}
//		for(int i=0;i<arr.length;i++)
//		{
//		System.out.println(arr[i]);
//		}
		
//		Remove the all space form given String 
		
//		String str = "I am Vaibhav Adamane";
//		String str1 = str.replaceAll("\\s","");
//		System.out.println("Replace all white space of the given String = " + str1);
		
//		Java progrmae where we can change the lower case to uppercase and viceversa
//	    String str = "Automation Testing";
//	    StringBuffer str1 = new StringBuffer(str);
//	    for(int i=0;i<str.length();i++)
//	    {
//	    	if(Character.isLowerCase(str.charAt(i)))
//	    	{
//	    		str1.setCharAt(i,Character.toUpperCase(str.charAt(i)));;
//	    	}
//	    	else
//	    	{
//	    		str1.setCharAt(i, Character.toLowerCase(str.charAt(i)));
//	    	}
//	    }
//		System.out.println("New Sting = " + str1);
		
		
//		Replace white space by speaial character
		
//		String str = "28 9 2020";
//		char ch = '-';
//	    String str1 = str.replace(' ', ch);
//		System.out.println("New Sting = " + str1);
		
//		Java progrme which confirm that str2 is rotaion of the str1
//		String str1 = "vaibhav";
//		String str2 = "ibhavva";
//		
//		if(str1.length() != str2.length())
//		{
//			System.out.println("The str2 is not a rotaion of the str1");
//		}
//		else
//		{
//			str1 =str1.concat(str1);
//			if(str1.indexOf(str2) != -1)
//			{
//				System.out.println("The secound string is an rotation of the string first");
//			}
//			else
//			{
//				System.out.println("The secound string is not a rotation of th sting first");
//			}
//		}
		
		
	}
	
}