package com.skilldistillery.Jets;

public class FighterJet extends Jet implements Combat{
	
	
	public FighterJet(String model, double speed, int range, double price) {
		super(model, speed, range, price);
	}
	
	public void fly() {
		System.out.println(super.getModel() + " taking off! NNNNEEEERRRRRGGGGGGGG!!!! *TOPGUN MONTAGE*");
		System.out.println(super.getModel() + " can fly for " + range/speed + " hours.");
	}

	@Override
	public void fireMissle() {
		System.out.println("I'm firing my missle! KERPLOW BABOOM!");
	}
	
	


}
