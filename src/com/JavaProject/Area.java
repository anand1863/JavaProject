package com.JavaProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area 
{
	public static void main(String args[])throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
	}
	
	public int sqarea(int a)
	{
		return a*a;
	}
	
	public int rectarea(int a, int b)
	{
		return a*b;
	}
	
	public double triarea(int a, int b, int c)
	{
		double s = (a+b+c)/2;
		double res = s*(s-a)*(s-b)*(s-c);
		return Math.sqrt(res);
	}
}
