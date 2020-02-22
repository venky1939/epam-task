package com.epam.myApp;

import java.util.ArrayList;
import java.util.Scanner;

public class Ticket {
	Timing tn=new Timing();
   void seats(){
	   System.out.print("Show timings\n1.11:00 AM\n2.1:30 PM\n 3.6:00 PM\n 4.9:30 PM\n");
	   System.out.print("Select your timing:");
	   Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		switch(t) {
		case 1:tn.time1();
		       break;
		case 2:tn.time2();
		       break;
		case 3:tn.time3();
		       break;
		case 4:tn.time4();
		       break;
		default:
			System.out.println("Wrong choice");
		}
	   System.out.println("Each ticket costs Rs.100\n");
	System.out.print("Enter number of seats:");
	//Scanner sc=new Scanner(System.in);
	int s=sc.nextInt();
	
	
	
	System.out.println("Total price:"+s*100);
	
	
	ArrayList<String> al=new ArrayList<String>();    
    al.add("A1");    
    al.add("A2");    
    al.add("A3");    
    al.add("A4");
    al.add("A5");    
    al.add("A6");    
    al.add("A7");    
    al.add("A8"); 
    al.add("A9");    
    al.add("A10");    
    al.add("A11");    
    al.add("A12"); 
    al.add("A13");    
    al.add("A14");    
    al.add("A15");    
    al.add("A16");
    al.add("A17");    
    al.add("A18");    
    al.add("A19");    
    al.add("A20"); 
    al.add("A21");    
    al.add("A22");  
    System.out.print("Allocated seats are:");
    for (int i = 0; i < s; i++)
    {
    	System.out.print(al.get(i));
    	System.out.print(" ");
    	
    }
    System.out.println("\nBooking Confirmed");
    
   }
}
