package com.skilldistillery.Jets;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(super.getModel() + " taking off! VRRROOOMMMM!!!");
	}
	
	
	
}
