package com.skilldistillery.Jets;

import java.util.Scanner;

public class ControlTower {

	Scanner input = new Scanner(System.in);
	Airfield airfield = new Airfield();
//	FighterJet fighter;
//	PassengerJet passenger;
//	CargoJet cargo;
//	JetImpl other;
	

	public void run() {
		menuOfOptions();

	}

	public void menuOfOptions() {
		int choice = 0;
		System.out.println(
				"YOUR SECURITY CREDENTIALS HAVE BEEN VERIFIED. YOU MAY NOW USE CONTROL TOWER FUNCTIONALITY TO MANAGE AIRFIELD JETS.");
		while (choice != 9) {
			System.out.println("WHAT WOULD YOU LIKE TO DO?");
			System.out.println();
			System.out.println(
					"1: LIST FLEET\n2: DEPLOY THE FLEET\n3: VIEW FASTEST JET\n4: VIEW JET WITH LONGEST RANGE\n5: ADD JET\n6: LOAD CARGO\n7: DOGFIGHT\n8: BOARD PASSENGERS\n9: QUIT");
			choice = input.nextInt();

			switch (choice) {
			case 1:
				airfield.listFleet();
				break;
			case 2:
				flyAllTheJets();
				break;

			case 3:
				System.out.println("HERE IS INFORMATION ABOUT THE JET WITH THE FASTEST SPEED:\n");
				airfield.findFastestSpeed();
				break;

			case 4:
				System.out.println("HERE IS INFORMATION ABOUT THE JET WITH THE LONGEST RANGE:\n");
				airfield.findLongestRange();

				break;

			case 5:
				int select = selectJetType(); 
				Jet newJet = makeAJet(select);
				if (newJet != null) {
					airfield.addJet(newJet);
				}
				break;

			case 6:
				airfield.checkIfJetIsCargo();
				break;

			case 7:
				airfield.dogFight();
				break;

			case 8: 
				airfield.boardPassengers();
				break;
				
			case 9:
				System.out.println("POWERING DOWN. GOOD BYE.");
				System.exit(0);
				break;

			default:
				System.out.println("PLEASE SELECT AN OPTION FROM 1-8");

			}
		}
	}

	public Jet makeAJet(int select) {
		Jet[] airField = airfield.getJetArray();
		int j = 0;
		for (int i = 0; i < airField.length; i++) {
			if (airField[i] == null) {
				j++;
			}
		}

		if (j > 0) {
			if(j == 1) {
				System.out.println("THERE IS SPACE FOR " + j + " MORE JET IN THE AIRFIELD.");
			}
			else {
				System.out.println("THERE IS SPACE FOR " + j + " MORE JETS IN THE AIRFIELD.");				
			}
			System.out.print("ENTER A JET MODEL: ");
			String modeln = input.next();
			System.out.println();
			System.out.print("ENTER THE JET'S SPEED IN MPH: ");
			double speedn = input.nextDouble();
			System.out.println();
			System.out.print("ENTER THE JET'S RANGE IN MILES (NO DECIMALS): ");
			int rangen = input.nextInt();
			System.out.println();
			System.out.print("ENTER THE JET'S PRICE IN DOLLARS: ");
			long pricen = input.nextLong();
			System.out.println();

			if(select == 1) {
				Jet newJet = new FighterJet(modeln, speedn, rangen, pricen);	
				newJet = (Jet)newJet;
				System.out.println("NEW JET SUCCESSFULLY CREATED");
				return newJet;
			}
			if(select == 2) {
				Jet newJet = new CargoJet(modeln, speedn, rangen, pricen);
				newJet = (Jet)newJet;
				System.out.println("NEW JET SUCCESSFULLY CREATED");
				return newJet;
			}
			if(select == 3) {
				Jet newJet = new PassengerJet(modeln, speedn, rangen, pricen);
				newJet = (Jet)newJet;
				System.out.println("NEW JET SUCCESSFULLY CREATED");
				return newJet;
			}
			if(select == 4) {
				Jet newJet = new JetImpl(modeln, speedn, rangen, pricen);
				newJet = (Jet)newJet;
				System.out.println("NEW JET SUCCESSFULLY CREATED");
				return newJet;
			}
			
		} else {
			System.out.println(
					"THERE IS NO ROOM IN THE AIRFIELD FOR MORE JETS. PLEASE WIN A LUCRITIVE GOVERNMENT DEFENSE CONTRACT OR CHOOSE ANOTHER OPTION.");
			return null;
		}
		return null;
	}

	private int selectJetType() {
		System.out.println("SELECT A JET TYPE TO ADD:");
		while(true) {
			System.out.println("1: FighterJet");
			System.out.println("2: Cargo Jet");
			System.out.println("3: Passenger Jet");
			System.out.println("4: Other Jet");
			int choice = input.nextInt();
			if (choice >0 && choice <5) {
				return choice;
			}
			else {
				System.out.println("PLEASE MAKE A VALID SELECTION");
			}
		}
	}
		
	

	public void flyAllTheJets() {
		for (int i = 0; i < airfield.airstrip.length; i++) {
			if (airfield.airstrip[i] != null) {
				airfield.airstrip[i].fly();
			}
		}
	}
	
	}
		

