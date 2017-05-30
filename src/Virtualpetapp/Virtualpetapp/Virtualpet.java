package Virtualpetapp.Virtualpetapp;

import week2loops.oop.dogs.Dog;

public class Dog {
	public static final Dog[] myOtherDog = null;
	String name;//  defaults to null ( because a string is an object)
	int numberOfLegs= 4;// setting a default for the number of legs
	
	void rename (String newName){
	// could have done this:
	// name= newName
		
		this.name= newName;
	}
	void speak() {
		bark();
		System.out.println ("Hello My name is "+ name);
	}
	void bark () {
		System.out.println("Wrffff");
	}
	
	}
