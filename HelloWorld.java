
public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World Lab 1");
   		
   		int year;
   		double distance;
   		char letter;
   		boolean state;

   		//Code for what's my age? 
   		int currentYear;
   		int yearOfBirth;
   		int age;

   		currentYear = 2020;
   		yearOfBirth = 2000;
   		age = currentYear - yearOfBirth;
   		System.out.println("Your age is "+ age + " years old");

   		//Code for Next Year and Current Year
   		int nextYear;
   		year = 2020;
   		nextYear = year + 1;
   		System.out.println("The current year is "+ year);
   		System.out.println("The next year will be " + nextYear);
   		distance = 2.3;
   		letter = 'a';
   		state = true;

   		//Distance Code
   		double meters;
   		double meterToFeet;
   		final double factor = 3.28084;
		meters = 10;
   		meterToFeet = meters * factor;
   		System.out.println ("The distance of meters walked is " + meters);
   		System.out.println ("The distance from meters to feet is " +meterToFeet);

   		//Converting Money Code
   		int cad;
   		double usd;
   		double eur;

   		cad = 1000;
   		eur = (cad * 0.68);
   		usd = (cad * 0.75);

   		System.out.println ("You currently have " + cad + " Canadian dollars");
   		System.out.println ("When converted to American money, you will have " + usd);
   		System.out.println ("When converted to European money, you will have " + eur);





    }

}
