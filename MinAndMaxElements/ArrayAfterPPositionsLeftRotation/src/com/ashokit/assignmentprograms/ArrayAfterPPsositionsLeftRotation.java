package com.ashokit.assignmentprograms;

import java.util.Scanner;

public class ArrayAfterPPsositionsLeftRotation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i,j,p, count=0,temp=0;
		int a[]=new int[20],b[]=new int[20];
    Scanner s=new Scanner(System.in);
    System.out.println("Enter  the number of elements");
     n=s.nextInt();
    System.out.println("Enter the array numbers");
   
    
    
    for(i=0;i<n;i++){
    	a[i]=s.nextInt();
    }
    System.out.println("Enter the number of positions you want to rotate ");
    p=s.nextInt();     
 System.out.println("The Given array after left rotation  is :");  
 
   
    for(i=p,j=0;i<n;i++,j++) {
    	b[j]=a[i];    	
    	    }  
    
    for(i=0,j=n-p;i<p;i++,j++) {
    	b[j]=a[i];
    	
    	    } 
    
    for(i=0;i<n;i++) {
    	 System.out.print(b[i] + " ");
    }
   

	}

}


