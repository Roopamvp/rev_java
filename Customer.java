package com.assignment.day2;

public class Customer {
    int customer_id;
	String name;
	int no_of_items;
	static int shopNo = 10;
	private static final long buisness_id=123343;
	
	Customer(int c_id ){
		customer_id=c_id;
		System.out.println("id " + customer_id);
	}
	Customer(int c_id,String name_1 ){
		customer_id=c_id;
		name=name_1;
		System.out.println("id "+ customer_id +"Name " + name);
	}
	void input(int n_items )
	{
		no_of_items=n_items;
	}
	int bill(int x,int y) {
		return x+y;
	}
	int bill(int x,int y, int z) {
		return(x+y+z);
	}
void display() {
	System.out.println("Customer number "+customer_id+"Name" + name);
}
}
