package com.skilldistillery.Jets;

public class FighterJet extends Jet implements Combat{
	
	
	public FighterJet() {
		
	}
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(super.getModel() + " taking off! NNNNEEEERRRRRGGGGGGGG!!!! *TOPGUN MONTAGE*");
		System.out.println(super.getModel() + " can fly for " + range/speed + " hours.");
		System.out.println("______________________________________________________________");
	}

	@Override
	public void fireMissle() {
		System.out.println("The " + super.getModel() + " is firing its missle! KERPLOW BABOOM!");
	}
	
	


}
