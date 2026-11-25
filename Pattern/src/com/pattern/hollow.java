package com.pattern;
//* * * *   for triangle use logic i=5 j=1 and i==j
//*     *
//*     *
//* * * *
public class hollow {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 ||j==1 ||i==5 ||j==5)
				{
					System.out.print("*");
				}


				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
