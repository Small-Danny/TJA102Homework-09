package hw7;

import java.io.Serializable;

public class Dog implements Animal,Serializable{
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	@Override
	public void speak() {
		System.out.println("This is Dog " + name + " speaking.");
	}
}
