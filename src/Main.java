public class Main {

	public static void main(String[] args) {

		// Object creation
		// "new" is a java keyword which creates an object
		Calculator calculator = new Calculator();
		// Must include parenthesis because of object declaration
		// Calculator is the data type
		// calculator is the variable
		// new Calculator() is the object
		
		System.out.println(calculator.add(2, 6));

		System.out.println("The difference of 10 and 6 is " + calculator.subtract(10, 6) + ".");
		
	}

}
