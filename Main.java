import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo!");
		System.out.println("Bom dia!");
		
		System.out.printf("%n");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("EXEMPLO EM int ");
		System.out.println("Gostaria de informar que conheci uma Juliana, de " + y + " Anos ");
		System.out.println(y + " Anos?");
		
		System.out.printf("%n");
		
		System.out.println("EXEMPLO EM double: ");
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.printf("%n");
		
		Locale.setDefault(Locale.US);// Altera virgula para, ponto.
		System.out.printf("%.4f%n", x);
		
		System.out.printf("%n");
		
		System.out.println("EXEMPLO COM 2 e 4 DECIOMAIS");
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("RESULTADO = %.4f METROS%n", x);
		
		System.out.printf("%n");
		
		System.out.println("Regras geral para PRINTF");
		String nome = "Juliana";
		int idade = 32;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		// %.2f = ponto flutuante (DOUBLE)
		// %d = inteiro (INT)
		// %s = texto (STRING)
		// %n = quebras de linha
		
		System.out.printf("%n");
		
		String product1 = "Computer";
		String product2 = "Office desk";
		byte age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		
		
		
	}

}
