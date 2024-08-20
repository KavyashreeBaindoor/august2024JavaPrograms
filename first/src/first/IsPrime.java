package first;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int no=in.nextInt();
		//IsPrime(no);   Fails bcs i was checking only divisible by 2
		//have to check from 2 to number-1
		PrimeNumber(no);
		PNoneToHundred();

	}
	public static void IsPrime(int no) {
		if(no==1) {
			System.out.println("1 is not a Prime Number");
		}
		if(no==2) {
			System.out.println("it is Prime");
		}
		
		if(no!=1 & no!=2) {
			
			if(no%1==0 & no%no==0 & no%2!=0) {
				System.out.println("it is Prime");
			}else {
				System.out.println("not prime");
			}
			
		}
		
		
	}
	public static void PrimeNumber(int no) {
		if(no==1) {
			System.out.println("1 is not a Prime Number");
		}
		if(no==2) {
			System.out.println("it is Prime Number");
		}
		
		int temp=0;
		
		if(no!=1 & no!=2) {
		for(int i=2;i<=no-1;i++) {
			if(no%i==0)
				temp+=1;
			}
		if(temp==0) {
			System.out.println("it is Prime Number");
		}else
			System.out.println("it is not PrimeNumber");
		
	}}
	
	public static void PNoneToHundred() {
	
		int count=0;
		int temp=0;
		
	for(int i=2;i<100;i++) {
		for(int j=2;j<=i-1;j++) {
			if(i%j==0) {
				
				temp+=1;
				}}
		
			if(temp==0) {
				System.out.println(i);
				count++;
				}
				else
				{
					temp=0;
				}
			
	
	}
	System.out.println(count);
}}
