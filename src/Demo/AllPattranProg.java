package Demo;

import java.util.Scanner;

public class AllPattranProg {

	public static void main(String[] args)
	{
//	   *
//	   **
//	   ***
//	   int star=1,space=2;
//	   for(int row=1;row<=3;row++)
//	   {
//		   for(int i=1;i<=star;i++)
//		   {
//			   System.out.print("*");
//		   }
//		   for(int j=1;j<=space;j++)
//		   {
//			   System.out.print(" ");
//		   }
//		   System.out.println();
//		   star++;
//		   space--;
//	   }

	   
//	     *
//	    **
//	   ***
//	   int star=1,space=29;
//	   for(int row=1;row<=30;row++)
//	   {
//		   for(int j=1;j<=space;j++)
//		   {
//			   System.out.print(" ");
//		   }
//		   for(int i=1;i<=star;i++)
//		   {
//			   System.out.print("*");
//		   }
//		   System.out.println();
//		   star++;
//		   space--;
//	   }
	   

//		   ***
//		   **
//		   *
//		   int star=3,space=0;
//		   for(int row=1;row<=3;row++)
//		   {
//			   for(int j=1;j<=space;j++)
//			   {
//				   System.out.print(" ");
//			   }
//			   for(int i=1;i<=star;i++)
//			   {
//				   System.out.print("*");
//			   }
//			   System.out.println();
//			   star--;
//			   space++;
//		   }		
			
//	   *
//	  ***	
//	 *****  	
//	  ***	
//	   *
//		int star=1,space=2,row;
//		for(row=1;row<=5;row++)
//		{
//			for(int i=1;i<=space;i++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			if(row<=2)
//			{
//			star=star+2;
//			space--;
//			}
//			else
//			{
//		    star=star-2;
//		    space++;
//			}
//		}
		
//		*****
//		 ***
//		  *
//		 *** 
//	    *****	 
		
//		int star=5,space=0,row;
//		for(row=1;row<=5;row++)
//		{
//			for(int i=1;i<=space;i++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=1;j<=star;j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//			if(row<=2) 
//			{
//			star=star-2;
//			space++;
//			}
//			else
//			{
//			star=star+2;
//			space--;
//			}
//		}
		
//		111
//		222
//		for(int row=1;row<=2;row++)
//		{
//			for(int i=1;i<=3;i++)
//			{
//				System.out.print(row);
//			}
//			System.out.println();
//		}
//		
//		123
//		123
		
//		for(int row=1;row<=2;row++)
//		{
//			for(int i=1;i<=3;i++)
//			{
//				System.out.print(i);
//			}
//			System.out.println();
//		}
		
//		*****
//	    ** **
//		*   *
		
		int star=3,space=0,star1=star-1,row;
		for(row =1;row<=3;row++)
		{
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star1;k++)
			{
				if(row==3 && k==1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
			star--;
			space++;
			}
		
		
		
		
	}
	}

