package com.skilldistillery.Jets;

public class JetImpl extends Jet {

	public JetImpl(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(super.getModel() + " taking off! VRRROOOMMMM!!!");
		System.out.println("The number of hours " + super.getModel() + " can fly for is " + String.format("%.3g%n", range/speed));
		System.out.println("______________________________________________________________");
	}
	
	
	
}
