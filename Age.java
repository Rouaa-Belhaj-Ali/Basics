
import java.util.Scanner;

class Age {

	public static void main(String[] args) {
		// on fera mieux plus tard !
		final int ANNEE_COURANTE = 2016;

		System.out.println("Donnez votre age : ");

		Scanner input = new Scanner(System.in);

		int age = input.nextInt();

		int annee = ANNEE_COURANTE - age;

		// A partir de la semaine prochaine on pourra
		// tester si l'utilisateur ne nous dit pas de bêtise sur son âge !

		System.out.println("Votre annee de naissance est : " + annee);
	}
}
