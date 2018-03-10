package com.skilldistillery.Jets;

public class Airfield {

		Jet[] airstrip = new Jet[10];
		
	public Airfield() {
		Jet firstJet = new FighterJet("F-22 Raptor", 1400.100, 344, 50_000_000.00);
		Jet secondJet = new FighterJet("Tomcat", 1309.78, 323, 35_000_000.00);
		Jet thirdJet = new PassengerJet("Boeing 747", 833.33, 1300, 20_000_000);
		Jet fourthJet = new PassengerJet("Airbus", 789.66, 1325, 25_500_000);
		Jet fifthJet = new CargoJet("C-5 Galaxy", 900.42, 2025, 30_000_000);
		Jet sixthJet = new CargoJet("Volga-Dneper", 925.42, 2290, 29_000_000);		
		airstrip[0] = firstJet;
		airstrip[1] = secondJet;
		airstrip[2] = thirdJet;
		airstrip[3] = fourthJet;
		airstrip[4] = fifthJet;
		airstrip[5] = sixthJet;
		}

	public void addJet(Jet newJet) {
		Jet[] fullArray = getJetArray();
		for (int i = 0; i < fullArray.length; i++) {
			if (fullArray[i] == null) {
				fullArray[i] = newJet;
				setJetArray(this.airstrip);
				break;
			}
		}
		System.out.println("JET SUCCESSFULLY ADDED TO AIRFIELD.");
	}
	
	public void listFleet(Jet[] jets) {
		for (int i = 0; i < jets.length; i++) {
			if(jets[i] != null) {
			System.out.println("Jet Name: " + jets[i].getModel());
			System.out.println("Jet Speed in MPH: " + jets[i].getSpeed());
			System.out.println("Jet Speed in Mach: " + jets[i].getSpeedInMach());
			System.out.println("Jet Range in Miles: " + jets[i].getRange());
			System.out.println("Jet Price in Dollars: " + jets[i].getPrice());
			System.out.println("______________________________________________________________________");
			}
		}
	}
	
	public int findLongestRange() {
		int hrangeFinal = 0;
		int jetRangeInfo = 0;
		for (int i = 0; i < airstrip.length; i++) {
			if(airstrip[i] == null) {
				break;
			}
			int hrange = airstrip[i].getRange();
			if(hrangeFinal <  hrange) {
				hrangeFinal = hrange;
				jetRangeInfo = i;
			}
			
		}
		return jetRangeInfo;
	}
	public int findFastestSpeed() {
		double hrangeFinal = 0;
		int jetRangeInfo = 0;
		for (int i = 0; i < airstrip.length; i++) {
			if(airstrip[i] == null) {
				break;
			}
			double hrange = airstrip[i].getSpeed();
			if(hrangeFinal <  hrange) {
				hrangeFinal = hrange;
				jetRangeInfo = i;
			}
			
		}
		return jetRangeInfo;
	}
	
	public Jet[] getJetArray(){
		return airstrip;
	}
	public void setJetArray(Jet[] newArray) {
		this.airstrip = newArray;
	}
	
}
