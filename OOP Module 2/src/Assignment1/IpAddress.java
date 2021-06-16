/*****************************************
 * OOP Module 2
 * Assignment 1
 * By Karolina Szulczyk
 * 
 * This program Dissects an IP Address 
 ******************************************/
package Assignment1;

public class IpAddress 
{
	private int firstOctet, secondOctet, thirdOctet, fourthOctet;
	public IpAddress(String a)
	{
		int loc0,loc1;
	loc1=a.indexOf('.');
	firstOctet=Integer.parseInt(a.substring(0,loc1));
	loc0=a.indexOf('.',loc1+1);
	secondOctet=Integer.parseInt(a.substring(loc1+1,loc0));
	loc1=a.indexOf('.',loc0+1);
	thirdOctet=Integer.parseInt(a.substring(loc0+1,loc1));
	fourthOctet=Integer.parseInt(a.substring(loc1+1));
	}
	public String getDottedDecimal()
	{
	String a="",num;
	num=Integer.toString(firstOctet);
	a=a+num;
	a=a+'.';
	num=Integer.toString(secondOctet);
	a=a+num;
	a=a+'.';
	num=Integer.toString(thirdOctet);
	a=a+num;
	a=a+'.';
	num=Integer.toString(fourthOctet);
	a=a+num;
	return a;
	}
	public int getOctet(int pos)
	{
		switch(pos)
	    {
		case 1: return firstOctet;
		case 2: return secondOctet;
		case 3: return thirdOctet;
	    }
	    return fourthOctet;
	}// end main
}// end class IP Address