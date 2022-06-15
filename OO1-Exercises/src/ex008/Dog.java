package ex008;

public class Dog {
	String name;
	String breed;
	int weight;
	
	public Dog(String n, String b, int w) {
		this.name = n;
		this.breed = b;
		this.weight = w;
	}
	public Dog(String n, int w) {
		this.name = n;
		this.breed = "Mutt";
		this.weight = w;
	}
}
