package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarAppPartTwo {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("Subaru", "Impreza", 2018, 24000.00));
		cars.add(new Car("Chevy", "Bolt", 2020, 45000.00));
		cars.add(new Car("Mitsubishi", "Lancer", 2019, 20000.00));
		cars.add(new UsedCar("Toyota", "Rav4", 2009, 5000.00, 19000.00));
		cars.add(new UsedCar("Nissan", "Cube", 2000, 150.00, 300.00));
		cars.add(new UsedCar("Subaru", "Crossover", 1999, 6000.00, 13000.00));
	}

	public static void main(String[] args) {
		whileLoop();

	}

	public static void listCars() {
		int count = 1;

		for (Car c : cars) {
			System.out.printf((count) + "." + "%-15s %-15s %4d $%,.2f", c.getMake(), c.getModel(), c.getYear(), c.getPrice());
			count++;
			if (c instanceof UsedCar) {
				UsedCar usedCar = (UsedCar)c;
				System.out.printf(" (Used) %,.1f miles", usedCar.getMileage());
			}
			System.out.println();
		} 
		System.out.println((cars.size() + 1) + ".Quit");
	}

	public static void whileLoop() {
		boolean buyCar = true;
		while (buyCar) {
			listCars();
			System.out.println();
			System.out.print("Which car would you like? ");
			int numCar = scnr.nextInt();
			if (numCar >= cars.size()) {
				buyCar = false;
				System.out.println("Have a great day!");
			} else {
				System.out.println(cars.get(numCar));
				System.out.println("Would you like to buy this car?");
				String answer = scnr.next();
				if (answer.equals("y")) {
					buyCar(numCar);
					System.out.println("Excellent! Our fiance department will be in touch shortly.");
				} 
			}
		}
	}

	public static void showCarById(int id) {
		System.out.println(cars.get(id - 1));
	}

	public static void buyCar(int id) {
		cars.remove(id - 1);
	}

}
