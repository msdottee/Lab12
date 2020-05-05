package lab12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {

		System.out.print("Welcome to the GC Car terminal admin page!\n");
		
		addCar();
		listCars();
	}

	public static void addCar() {
		Car car = new Car();

		System.out.print("How many cars are you entering? ");
		int numCars = scnr.nextInt();
		for (int i = 0; i < numCars; i++) {
			System.out.print("Enter Car #" + (i + 1) + " Make: ");
			car.setMake(scnr.next());

			System.out.print("Enter Car #" + (i + 1) + " Model: ");
			car.setModel(scnr.next());

			System.out.print("Enter Car #" + (i + 1) + " Year: ");
			car.setYear(scnr.nextInt());

			System.out.print("Enter Car #" + (i + 1) + " Price: ");
			car.setPrice(scnr.nextDouble());
			
			cars.add(car);
		}
		scnr.nextLine();
	}

	public static void listCars() {
		System.out.println();
		System.out.println("Current Inventory:");
		
		for (Car c : cars) {
			System.out.printf("%-10s %-10s %-10d $%,.2f\n", c.getMake(), c.getModel(), c.getYear(), c.getPrice());
		}
	}

}
