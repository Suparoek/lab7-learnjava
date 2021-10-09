package com.Labeee.lab7Leanjava;
import java.util.*;
public class Lab7Learnjava {
	public static void main(String[] arges) {
		//sort();
		Inputnumber();
	}
	public static void sort() {
		int i=20;
		do{
			System.out.print(i+">");
			i--;
		}while(i>=0); 
	}
	public static void Inputnumber() {
		int sum;
		Scanner sc = new Scanner(System.in);
		do {
			int num = sc.nextInt();
			if(num %2==1) {
				System.out.println("จำนวนคี่");
				break;
			}else if(num % 2 ==0) {
				sum = num % 2;
				System.out.println("จำนวนคู่");
			}
		}while(true);
		System.out.println("จบการทำงาน");
	}
}
