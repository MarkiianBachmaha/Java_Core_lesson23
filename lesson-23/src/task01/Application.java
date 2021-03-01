package task01;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Натисніть 1, щоб додати фракцію;");
		System.out.println("Натисніть 2, щоб видалити конкретну фракцію;");
		System.out.println("Натисніть 3, щоб вивести усі фракції;");
		System.out.println("Натисніть 4, щоб очистити конкретну фракцію;");
		System.out.println("Натисніть 5, щоб вивести конкретну фракцію;");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.next()) {

			case "1": {
				Parliament.getinstance().addFraction();

				break;
			}
			case "2": {
				Parliament.getinstance().deleteFraction();

				break;
			}
			case "3": {
				Parliament.getinstance().showAllFractions();

				break;
			}
			case "4": {
				Parliament.getinstance().clearFraction();

				break;
			}
			case "5": {
				Parliament.getinstance().showSpecificFraction();

				break;
			}

			}

		}

	}
}