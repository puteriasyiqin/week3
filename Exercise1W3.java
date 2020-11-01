import java.util.Scanner;

public class Exercise1W3{
	public static void main(String [] nilaiTerima){
		int noInt = 10,x;

		//if (noInt == 10)
		//	System.out.println("sama");
		//else
		//	System.out.println("tak sama");

		System.out.println(noInt == 10 ? "sama" : "taksama");


		if (noInt == 10)
			x =3;
		else
			x = 19;

		//ternary operator
		x = noInt == 10 ? 3 : 19;
		System.out.println("x is " + x);


		//String name;
		//int nombor;
		//double noDouble;

		//Scanner input = new Scanner(System.in);

		//System.out.println("Enter a name: ");
		//name = input.nextLine();     //or input.nextline()
		//System.out.println("Name is " + name);


		//System.out.println("Enter a number: ");
		//nombor = input.nextInt();
		//System.out.println("Number is " + nombor);

		//input.nextLine();


		//System.out.println("Enter a double: ");
		//noDouble = input.nextDouble();
		//System.out.println("Number is " + noDouble);

		

		//int [] tataInt = {10, 20, 30, 40};

		//ordinary for
		//for (int i=0; i<tataInt.length; i++) {
		//	System.out.println(tataInt[i]);
		//}

		//for=each or advanced for
		//for ( int t : tataInt ) {
		//	System.out.println("for each: " + t);
		//}


		//int noInt='10';

		//char charSaya = 28;
		//System.out.println("Char " + charSaya);

		//final adalah constant variable
		//final char CHARSAYA = 28;   //asci code
		//System.out.println("Char " + CHARSAYA);
		//CHARSAYA = 100;
		//System.out.println("Char " + CHARSAYA);

		//int [] tataInt = new int[4];

		//for (int i=0; i<tataInt.length; i++) {
		//	System.out.println(tataInt[i]);
		//}




		//int noInt = 123;
		//int noInt2 = 248;
		//double noDouble = 24.122;

		//System.out.format("%6d %4d", noInt, noInt2);
		//System.out.format("RM%7.2f", noDouble);
		//System.out.printf();


		//System.out.println("Nilai 1: " + nilaiTerima[0]);
		//System.out.println("Nilai 2: " + nilaiTerima[1]);
		//System.out.println("Nilai 3: " + nilaiTerima[2]);

		//int sum = 0;

		//for (int i=0; i<nilaiTerima.length; i++)
		//	System.out.println("Nilai: " + nilaiTerima[i]);
		//	sum += Integer.parseInt(nilaiTerima[i]);  //covert guna wrapper class
		//	System.out.println("Nilai sum: " + sum);

	}
}