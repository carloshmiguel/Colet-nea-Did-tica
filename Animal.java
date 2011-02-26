/**

Código mostrando como chamar um construtor a partir de outro
com sorteio de nomes

autor: Carlos Henrique Miguel

ano: ano 2010

*/

public class Animal {
	String name;
	String lastName;
	Animal(String name, String lastName){
		this.name = name;
		this.lastName = lastName;
	}
	Animal() {
		this(makeRandomName(), makeRandomLastName());
	}
	static String makeRandomName() {
	int x = (int)(Math.random() * 5 );
	String name = new String[] {"Fluffy", "Fido", "Rover", "Spike", "Gigi"}[x];
	return name;
	}
	static String makeRandomLastName() {
		int x = (int)(Math.random() * 2 );
		String lastName = new String[] {"Miguel", "Silva"}[x];
		return lastName;
	}
	public static void main (String [] args) {
		Animal a = new Animal();
		System.out.println(a.name+" "+a.lastName);
		Animal b = new Animal("Zeus","O Grego");
		System.out.println(b.name+" "+b.lastName);
	}
}
