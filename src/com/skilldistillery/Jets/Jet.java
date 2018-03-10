package com.skilldistillery.Jets;

public abstract class Jet {

		String model;
		double speed;
		int range;
		double price;
	

		public Jet() {	
		}
		
		
		public Jet (String model, double speed, int range, double price) {
		}
		
		
		@Override
		public String toString() {
		return "Jet Model: " + model + "\nJet Speed: " + speed + "\nJet Range: " + range + "\nJet Price: " + price;
		}


		public void fly() {
		
		
		}
		
		public int getRange() {
			return range;
		}
		
		public double getSpeed() {
			return speed;
		}
		public double getSpeedInMach(){
			double machSpeed = speed*0.00130332;
			return speed;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public void setSpeed(double speed) {
			this.speed = speed;
		}

		public void setRange(int range) {
			this.range = range;
		}
		
}
	
	

