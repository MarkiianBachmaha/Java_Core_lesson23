package task01;

public class Person {

	private double weight;
	private double growth;

	public Person(double weight, double growth) {
		super();
		this.weight = weight;
		this.growth = growth;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getGrowth() {
		return growth;
	}

	public void setGrowth(double growth) {
		this.growth = growth;
	}

	@Override
	public String toString() {
		return "Person [weight=" + weight + ", growth=" + growth + "]";
	}

}