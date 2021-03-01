package task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Parliament {

	private static Parliament instance;

	private Parliament() {

	}

	public static Parliament getinstance() {
		if (instance == null) {
			instance = new Parliament();
		}
		return instance;
	}

	List<Fraction> list = new ArrayList<Fraction>();

	private Fraction checkFraction() {
		Fraction fractionDefault = new Fraction(null);
		boolean flag = false;
		showAllFractions();

		while (true) {
			Scanner scanner = new Scanner(System.in);
			String fractionName = "";
			if (scanner.hasNext()) {
				fractionName = scanner.next();
			}

			final String fractionName1 = fractionName;

			if (list.size() > 0) {
				fractionDefault = list.stream().filter(f -> f.getName().toString().equalsIgnoreCase(fractionName1))
						.findFirst().get();
				flag = true;
			}

			else if (list.size() == 0) {
				System.out.println("Fractions are absent;");
				break;
			}
			if (!flag) {
				System.out.println("Fraction with that name is absent;");
			} else {
				break;
			}
		}

		return fractionDefault;
	}

	public void addFraction() {
		System.out.println("Enter the name of the fraction:");
		Scanner scanner = new Scanner(System.in);
		String fractionName = "";

		if (scanner.hasNext()) {
			fractionName = scanner.next();
		}

		Fraction fraction = new Fraction(fractionName);
		list.add(fraction);

		System.out.println("Fraction " + fraction.toString() + " now in parliament;");
	}

	public void deleteFraction() {

		System.out.println("Enter the name of present fraction from list below:");
		showAllFractions();

		while (true) {
			System.out.println("Enter name of fraction:");
			Scanner scanner = new Scanner(System.in);
			String name = "";
			boolean flag = false;

			if (scanner.hasNext()) {
				name = scanner.next();

			}

			if (list.size() > 0) {
				final String fractionName = name;
				Predicate<Fraction> isPres = f -> f.getName().toString().equalsIgnoreCase(fractionName);
				if (list.removeIf(isPres)) {
					System.out.println("Fraction " + fractionName + " has been deleted from Parliament;");
					flag = true;
				}

			} else if (list.size() == 0) {
				System.out.println("There are no fractions in parliament;");
				break;
			}
			if (!flag) {
				System.out.println("There is no fractions with this name;");
			} else {

				break;
			}
		}
	}

	public void showAllFractions() {
		System.out.println("All fractions in the parliament:");
		list.stream().forEach(f -> System.out.println(f.getName().toString()));
	}

	public void showSpecificFraction() {
		System.out.println("Specific fraction in the parliament:");

		Fraction fraction = checkFraction();
		System.out.println(fraction.getName().toString() + " present in the parliament;");
	}

	public void addDeputyToFraction() {
		System.out.println("Add deputy to a specific fraction:");

		Fraction fraction = checkFraction();
		fraction.addDeputy();
	}

	public void deleteDeputyFromFraction() {
		System.out.println("Delete deputy from a specific fraction:");

		Fraction fraction = checkFraction();
		fraction.deleteDeputy();
	}

	public void showAllBribeTakersInFraction() {
		System.out.println("All bribe-takers in fraction:");
		Fraction fraction = checkFraction();
		fraction.showAllBribeTakers();
	}

	public void showTheBiggestBribetakerInFraction() {
		System.out.println("The biggest bribe-takers in the fraction:");
		Fraction fraction = checkFraction();
		fraction.showTheBiggestBribetaker();
	}

	public void showAllDeputiesInFraction() {
		System.out.println("All deputies in the fraction:");
		Fraction fraction = checkFraction();
		fraction.showAllDeputies();
	}

	public void clearFraction() {
		Fraction fraction = checkFraction();
		fraction.clearFraction();
	}

}