package com.skilldistillery.Jets;

public class PassengerJet extends Jet implements Passengers{
	
	
	public PassengerJet() {
		
	}
	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	public void fly() {
		System.out.println(super.getModel() + " taking off! PLEASE STOW ALL CARRYON ITEMS AND SET YOUR SEAT TO THE UPRIGHT POSITION!");
		System.out.println(super.getModel() + " can fly for " + range/speed + " hours.");
		System.out.println("______________________________________________________________");
	}
	@Override
	public void loadPassengers() {
		System.out.println("Please check your ticket and queue in an orderly fashion! " + super.getModel() + " is now boarding!");
		
	}
	
	
}
