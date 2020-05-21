package com.test.inheritance;


public class inheritance {
int x=10;
void test()
{
	
System.out.println("this is parent class or base class");
}
 
	
}
class singleinheritance extends inheritance{

	public static void main(String[] args) {
		singleinheritance s=new singleinheritance();
		s.test();
	}
	
}