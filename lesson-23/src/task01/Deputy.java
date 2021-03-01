package task01;

import java.util.Scanner;

public class Deputy extends Person {

	private String surname;
	private String name;
	private int age;
	private boolean grafter;

	public Deputy(double weight, double growth, String surname, String name, int age) {
		super(weight, growth);
		this.surname = surname;
		this.name = name;
		this.age = age;
	}

	private int amountOfBribe = 0;

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return grafter;
	}

	public void setGrafter(boolean grafter) {
		this.grafter = grafter;
	}

	public int getAmountOfBribe() {
		return amountOfBribe;
	}

	public void setAmountOfBribe(int amountOfBribe) {
		this.amountOfBribe = amountOfBribe;
	}

	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", age=" + age + ", grafter=" + grafter + "]";
	}

	public void giveBribe() {
		Scanner scanner = new Scanner(System.in);
		if (!grafter) {
			System.out.println("This deputy does not take bribes");
		} else {
			System.out.println("Enter the amount of the bribe as an integer:");
		}

		while (true) {

			int sumOfBribe = 0;

			if (sumOfBribe > 5000) {
				System.out.println("The police will imprison the deputy");

				break;

			} else if (sumOfBribe <= 5000) {
				this.amountOfBribe = sumOfBribe;

				break;

			}
		}

	}

}