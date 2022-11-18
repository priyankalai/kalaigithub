package org.hdw;

public class Desktop implements Hardware ,Software {

	public void desktopModel() {
			System.out.println("Desktop mode is 2023");
	}
	public static void main(String[] args) {
			Desktop d = new Desktop();
			d.desktopModel();
			d.hardwareResources();
			d.softwareResource();
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
