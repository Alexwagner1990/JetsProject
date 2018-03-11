package com.skilldistillery.Jets;

public class Airfield {

	Jet[] airstrip = new Jet[10];

	public Airfield() {
		Jet firstJet = new FighterJet("F-22 Raptor", 1400.100, 344, 50_000_000);
		Jet secondJet = new FighterJet("Tomcat", 1309.78, 323, 35_000_000);
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
		for (int i = 0; i < airstrip.length; i++) {
			if (airstrip[i] == null) {
				airstrip[i] = newJet;
				setJetArray(this.airstrip);
				break;
			}
		}
		System.out.println("JET SUCCESSFULLY ADDED TO AIRFIELD.");
	}

	public void listFleet() {
		for (int i = 0; i < airstrip.length; i++) {
			if (airstrip[i] != null) {
				System.out.println("Jet Model: " + airstrip[i].getModel());
				System.out.println("Jet Speed in MPH: " + airstrip[i].getSpeed());
				System.out.println("Jet Speed in Mach: " + airstrip[i].getSpeedInMach());
				System.out.println("Jet Range in Miles: " + airstrip[i].getRange());
				System.out.println("Jet Price in Dollars: " + airstrip[i].getPrice());
				System.out.println("______________________________________________________________________");
				System.out.println();
			}
		}
	}

	public void findLongestRange() {
		int hrangeFinal = 0;
		int jetRangeInfo = 0;
		for (int i = 0; i < airstrip.length; i++) {
			if (airstrip[i] == null) {
				break;
			}
			int hrange = airstrip[i].getRange();
			if (hrangeFinal < hrange) {
				hrangeFinal = hrange;
				jetRangeInfo = i;
			}

		}
		System.out.println("Jet Model: " + airstrip[jetRangeInfo].getModel());
		System.out.println("Jet Speed in MPH: " + airstrip[jetRangeInfo].getSpeed());
		System.out.println("Jet Speed in Mach: " + airstrip[jetRangeInfo].getSpeedInMach());
		System.out.println("Jet Range in Miles: " + airstrip[jetRangeInfo].getRange());
		System.out.println("Jet Price in Dollars: " + airstrip[jetRangeInfo].getPrice());
		System.out.println("______________________________________________________________________");
		System.out.println();
	}

	public void findFastestSpeed() {
		double hrangeFinal = 0;
		int jetSpeedInfo = 0;
		for (int i = 0; i < airstrip.length; i++) {
			if (airstrip[i] == null) {
				break;
			}
			double hrange = airstrip[i].getSpeed();
			if (hrangeFinal < hrange) {
				hrangeFinal = hrange;
				jetSpeedInfo = i;
			}
		}
		System.out.println("Jet Model: " + airstrip[jetSpeedInfo].getModel());
		System.out.println("Jet Speed in MPH: " + airstrip[jetSpeedInfo].getSpeed());
		System.out.println("Jet Speed in Mach: " + airstrip[jetSpeedInfo].getSpeedInMach());
		System.out.println("Jet Range in Miles: " + airstrip[jetSpeedInfo].getRange());
		System.out.println("Jet Price in Dollars: " + airstrip[jetSpeedInfo].getPrice());
		System.out.println("______________________________________________________________________");
		System.out.println();
	}

	public Jet[] getJetArray() {
		return airstrip;
	}

	public void setJetArray(Jet[] newArray) {
		this.airstrip = newArray;
	}
	
	public void checkIfJetIsCargo() {
		CargoJet cargo = new CargoJet();
		for (int i = 0; i < airstrip.length; i++) {
			if(airstrip[i] ==null) {
				break;
			}
			airstrip[i].getClass();
			if(airstrip[i].getClass() == CargoJet.class) {
				cargo = (CargoJet) airstrip[i];
				cargo.loadCargo();
			}
		}
	}
	public void dogFight() {
		FighterJet fighter = new FighterJet();
		for (int i = 0; i < airstrip.length; i++) {
			if(airstrip[i] ==null) {
				break;
			}
			airstrip[i].getClass();
			if(airstrip[i].getClass() == FighterJet.class) {
				fighter = (FighterJet) airstrip[i];
				fighter.fireMissle();
			}
		}
	}
	public void boardPassengers() {
		PassengerJet passenger = new PassengerJet();
		for (int i = 0; i < airstrip.length; i++) {
			if(airstrip[i] ==null) {
				break;
			}
			airstrip[i].getClass();
			if(airstrip[i].getClass() == PassengerJet.class) {
				passenger = (PassengerJet) airstrip[i];
				passenger.loadPassengers();
			}
		}
	}

}
