package task01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fraction {

	private String name;
	private List<Deputy> list = new ArrayList<Deputy>();

	public Fraction(String name, List<Deputy> list) {
		super();
		this.name = name;
		this.list = list;
	}

	public Fraction(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Deputy> getList() {
		return list;
	}

	public void setList(List<Deputy> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return name + ", list=" + list + "]";
	}

	public void addDeputy() {
		String surname = "";
		String name = "";
		int age = 0;
		int weight = 0;
		int growth = 0;
		boolean grafter = false;
		int amountOfBribe = 0;

		Scanner scanner;

		System.out.println("We add the deputy to fraction:");

		System.out.println("Enter surname:");
		scanner = new Scanner(System.in);

		if (scanner.hasNext()) {
			surname = scanner.next();
		}

		System.out.println("Enter name:");
		scanner = new Scanner(System.in);

		if (scanner.hasNext()) {
			name = scanner.next();
		}

		System.out.println("Enter age:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			age = scanner.nextInt();
		}

		System.out.println("Enter weight:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			weight = scanner.nextInt();
		}

		System.out.println("Enter growth:");
		scanner = new Scanner(System.in);

		if (scanner.hasNextInt()) {
			growth = scanner.nextInt();
		}

		System.out.println("Is the deputy a bribe-taker? (yes/no):");
		scanner = new Scanner(System.in);
		String string = "yes";

		if (scanner.hasNext()) {

			if (scanner.equals(string)) {
				System.out.println("This deputy is a bribe-taker;");
			} else {
				System.out.println("This deputy is not a bribe-taker;");
			}

			Deputy deputy = new Deputy(amountOfBribe, amountOfBribe, name, name, amountOfBribe);
			list.add(deputy);

		}
	}

	public void deleteDeputy() {
		String surname = "";
		String name = "";
		Scanner scanner;

		System.out.println("We delete the deputy from fraction:");

		while (true) {
			System.out.println("Enter surname of deputy:");
			scanner = new Scanner(System.in);

			if (scanner.hasNext()) {
				surname = scanner.next();

				break;

			}
		}

		while (true) {
			System.out.println("Enter name of deputy:");
			scanner = new Scanner(System.in);

			if (scanner.hasNext()) {
				name = scanner.next();

				break;

			}

			final String surname1 = surname;
			final String name1 = name;

			list.removeIf(deputy -> deputy.getSurname().equalsIgnoreCase(surname1)
					&& deputy.getName().equalsIgnoreCase(name1));
			System.out.println("Deputy" + surname1 + " " + name1 + "was deleted;");
		}

	}

	public void showAllBribeTakers() {
		System.out.println("Bribe-takers in the fraction:");

		list.stream().filter(Deputy::isGrafter).forEach(System.out::println);
	}

	public void showTheBiggestBribetaker() {
		System.out.println("The biggest bribe-takers in the fraction:");
		Deputy max;
		max = list.stream().reduce((left, right) -> left.getAmountOfBribe() > right.getAmountOfBribe() ? left : right)
				.get();

		System.out.println(max.toString());
	}

	public void showAllDeputies() {
		System.out.println("All deputies in the fraction:");

		list.stream().forEach(System.out::println);
	}

	public void clearFraction() {
		list.clear();
	}

}