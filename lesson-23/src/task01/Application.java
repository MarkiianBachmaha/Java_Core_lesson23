package task01;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("�������� 1, ��� ������ �������;");
		System.out.println("�������� 2, ��� �������� ��������� �������;");
		System.out.println("�������� 3, ��� ������� �� �������;");
		System.out.println("�������� 4, ��� �������� ��������� �������;");
		System.out.println("�������� 5, ��� ������� ��������� �������;");
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