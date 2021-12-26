
public class Dog {
	String name;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		
		Dog[] dog = new Dog[3];
		dog[0] = new Dog();
		dog[1] = new Dog();
		dog[2] = dog1;
		
		
		dog[0].name = "leo";
		dog[1].name = "nardo";
		
		
		System.out.print("Last dog name was");
		System.out.println(dog[2].name);
		
		
		int x = 0;
		
		
		while(x < dog.length) {
			
			System.out.println(dog[x].name + "says ruff");
			x++;
		}
						
		
	}
	
	
	public void bark() {
		System.out.println(name + "says ruff");
		
	}

}
