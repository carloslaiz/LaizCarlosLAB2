package com.companycars;

public class MainTester {

	public static void main(String[] args) {
		


		Vehicle vroom[] = new Vehicle[3];
			vroom[0] = new Car("Audi R8","v10",4,"4wd");
			vroom[1] = new Truck ("Big Boi","v8 Hemi + Charger", 16, "AWD", 16000, 398361);
			vroom[2] = new Car ("Brz", "Boxer Engine", 4, "RWD");

			int price = 100000;
			int price2 = 2340000;
			int tax = 3982;

		System.out.println("total price tag:" + total(price, price2));
		System.out.println("total w/ tax: " + total(price, price2, tax));

			for (Vehicle vehicle: vroom) {
				System.out.println();
				vehicle.print();
			}

		}

		private static int total(int a, int b) {
			return a + b;
		}

		private static int total(int a, int b, int c) {
			return a + b + c;
		}

	}


