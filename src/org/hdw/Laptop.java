package org.hdw;

public class Laptop implements Hardware ,Software {

	public void laptopcode() {
			System.out.println("laptopcode is 2023");
	}
	public static void main(String[] args) {
			Laptop l = new Laptop();
			l.laptopcode();
			l.hardwareResources();
			l.softwareResource();
	}

	@Override
	public void softwareResource() {
		System.out.println("sftware is windows13");
	}

	@Override
	public void hardwareResources() {
		System.out.println("hardare is 8GBram 128GB");
	}
	
}
