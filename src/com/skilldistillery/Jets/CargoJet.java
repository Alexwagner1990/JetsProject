package com.skilldistillery.Jets;

public class CargoJet extends Jet implements CargoLoad {


	public CargoJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}
	public void fly() {
		System.out.println(super.getModel() + " is taking off! OH NO WE FORGOT TO SECURE THE CARGO!");
		System.out.println(super.getModel() + " can fly for " + range/speed + " hours.");
	}
	@Override
	public void loadCargo() {
		System.out.println("The cargo is loaded!");
		
	}


}