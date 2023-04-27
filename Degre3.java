import java.util.Scanner;

class Degre3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez le coefficient a (int) : ");
		int a = scanner.nextInt();
		System.out.print("Entrez le coefficient b (int) : ");
		int b = scanner.nextInt();
		System.out.print("Entrez le coefficient c (int) : ");
		int c = scanner.nextInt();

		System.out.print("Entrez la valeur de la variable x (double) : ");
		double x = scanner.nextDouble();

		double xx = x * x;
		double aux = a + b;
		double valeur = aux/2 * x * xx + aux * aux * xx + aux +c;
		System.out.println("La valeur de l'expression est: " + valeur);

		scanner.close();
	}
}
