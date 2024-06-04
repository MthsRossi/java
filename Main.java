import java.util.Locale;

public class Main {

	public static void main(String[] args) {
	
	  int y = 32;
	  double x = 10.35784;
	  String nome = "Matheus";
	  int idade = 18;
	  double renda = 5000.0;
	  
	  System.out.println(y);
	  System.out.println(x);
	  System.out.printf("%.2f%n", x);
	  System.out.printf("%.4f%n", x);
	  System.out.println("Olá mundo! Meu nome é Matheus.");  
	  System.out.println("Bom dia!");
	  
	  Locale.setDefault(Locale.US);
	  
	  System.out.printf("%.4f%n", x);
	  System.out.println ("RESULTADO = " + x + " METROS");
	  System.out.printf("RESULTADO = %.2f metros%n", x);
	  System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
	  
	}

}
