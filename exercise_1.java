import java.util.Locale;

public class exercise_1 {

	public static void main(String[] args) {
		
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender ='F';
	int x;
	double y;
	
	x = 5;
	y = 2 * x;
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	System.out.println("Products:");
	System.out.printf("%s, which price is $ %.2f%n", product1, price1);
	System.out.printf("%s, which price is $ %.2f%n", product2, price2);
	System.out.println();
	System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
	System.out.println();
	System.out.printf("Measue with eight deciomal places: %.8f%n", measure);
	System.out.printf("Rouded (three decimal places): %.3f%n", measure);
	Locale.setDefault(Locale.US);
	System.out.printf("US decimal point: %.3f%n", measure);
	System.out.println();
	System.out.println(x);
	System.out.println(y);
	System.out.println();
	
	double b, B, h, area;
	b = 6.0;
	B = 8.0;
	h = 5.0;
	area = (b + B) / 2.0 * h;
	System.out.println(area);

	System.out.println();
	
	int a, c;
	double resultado;
	a = 5;
	c = 2;
	resultado = (double) a / c;
	System.out.println(resultado);

	}

}
