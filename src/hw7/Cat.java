package hw7;

import java.io.Serializable;

public class Cat implements Animal,Serializable {
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	@Override
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
