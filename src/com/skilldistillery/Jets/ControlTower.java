package com.skilldistillery.Jets;
import java.util.Scanner;

public class ControlTower {
	
Scanner input = new Scanner(System.in);
Airfield airfield = new Airfield();


	public void run() {
		for (int i = 0; i < airfield.airstrip.length; i++) {
			toString();
		}
		menuOfOptions();
		
	}
	
	public void menuOfOptions() {
		int choice = 0;
		System.out.println("YOUR SECURITY CREDENTIALS HAVE BEEN VERIFIED. YOU MAY NOW USE CONTROL TOWER FUNCTIONALITY TO MANAGE AIRFIELD JETS.");
		while(choice !=8) {
			System.out.println("WHAT WOULD YOU LIKE TO DO?");
			System.out.println("1: LIST FLEET\n2: DEPLOY THE FLEET\n3: VIEW FASTEST JET\n4: VIEW JET WITH LONGEST RANGE\n5: ADD JET\n6: LOAD CARGO\n7: DOGFIGHT\n8: QUIT");
			choice = input.nextInt();
			
			switch (choice) {
			case 1:
				Jet[]fullArray = airfield.getJetArray();
				for (int i = 0; i < fullArray.length; i++) {
					if (fullArray[i] == null) {
						break;
					}
					fullArray[i].toString();
				}
				
//				airfield.listFleet(fullAirfield);
				break;
			case 2:
				flyAllTheJets(airfield.getJetArray());
				break;
				
			case 3:
				Jet[] tempArraySpeed = airfield.getJetArray();
				int fastest = airfield.findFastestSpeed();
				System.out.println("HERE IS INFORMATION ABOUT THE JET WITH THE FASTEST SPEED:\n" + tempArraySpeed[fastest].toString()); 
//				+ tempArraySpeed[airfield.findFastestSpeed()].getModel() + "\nJet Speed in MPH: " + tempArraySpeed[airfield.findFastestSpeed()].getSpeed() + "\nJet Range in Miles: ");
				break;
				
			case 4:
				Jet[] tempArrayRange = airfield.getJetArray();
				int longest = airfield.findLongestRange();
				System.out.println("HERE IS INFORMATION ABOUT THE JET WITH THE LONGEST RANGE:\n" + tempArrayRange[longest].toString());
//				+ tempArrayRange[airfield.findLongestRange()].getModel());
				break;
				
			case 5:
				Jet newJet = makeAJet();
				if(newJet !=null) {
					airfield.addJet(newJet);
				}
				break;
				
			case 6:
				break;
				
			case 7:
				break;
				
			case 8:
				System.out.println("POWERING DOWN. GOOD BYE.");
				System.exit(0);
				break;
				
			default:
				System.out.println("PLEASE SELECT AN OPTION FROM 1-8");
				
			}
		}
	}
	
	public Jet makeAJet() {
		Jet[] airField = airfield.getJetArray();
		int j = 0;
		for (int i = 0; i < airField.length; i++) {
			if(airField[i] == null) {
				j++;
			}
		}
		
		if(j > 0) {
		System.out.println("THERE IS SPACE FOR " + j  +" MORE JETS IN THE AIRFIELD.");
		System.out.print("ENTER A JET NAME: ");
		String model = input.nextLine();
		System.out.println();
		System.out.print("ENTER THE JET'S SPEED IN MPH: ");
		double speed = input.nextDouble();
		System.out.println();
		System.out.print("ENTER THE JET's RANGE IN MILES (NO DECIMALS): ");
		int range = input.nextInt();
		System.out.println();
		System.out.print("ENTER THE JET'S PRICE: ");
		double price = input.nextDouble();
		System.out.println();
		JetImpl newJet = new JetImpl(model, speed, range, price);
		System.out.println("NEW JET SUCCESSFULLY CREATED");
		return newJet;
		}
		else {
			System.out.println("THERE IS NO MORE ROOM IN THE AIRFIELD FOR MORE JETS. PLEASE WIN A LUCRITIVE GOVERNMENT DEFENSE CONTRACT OR CHOOSE ANOTHER OPTION.");
			return null;
		}
	}
	
	public void flyAllTheJets(Jet[] allJets) {
		for (int i = 0; i < allJets.length; i++) {
			if (allJets[i] != null) {
				allJets[i].fly();
			}
		}
	}
	
}
