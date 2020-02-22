package com.epam.myApp;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Location lc=new Location();
    	System.out.print("1.L.B.Nagar\n2.Dilsuknagar\n3.Kukatpally\n");
    	System.out.print("Select your location:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:lc.lbnagar();
		       break;
		case 2:lc.dil();
		       break;
		case 3:lc.kphb();
		       break;
		default:
			System.out.println("Wrong choice");
		}
    }
}
