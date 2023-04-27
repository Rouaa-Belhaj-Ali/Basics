import java.util.Scanner;

public class Fondue {
   
   public static void main(String[] args) {
      final int BASE = 4;     // nombre de personnes pour la recette de base
      
      // Pour faire une fondue fribourgeoise pour 4 personnes il faut : 
      
      double fromage = 800;    // 800gr de Vacherin fribourgeois
      double eau = 2;         // 2dl d'eau
      double ail = 2;         // 2 gousses d'ail
      double pain = 400;        // 400 gr de pain
      
      /* On supposera pour cet exercice que l'utilisateur ne saisit que des
       * valeurs strictement positives, mais nous pourrons faire mieux dès
       * la semaine prochaine
       */
      System.out.print("Entrez le nombre de personne(s) conviée(s) à la fondue : ");
	  Scanner clavier = new Scanner(System.in);
	  
      int nbConvives = clavier.nextInt();
      
      // Mise à jour des quantités en fonction du nombre de convives :
      double ratio = nbConvives;  // .. Notez le 'double' indispensable
                                  // pour éviter la division entière
      ratio /= BASE;
      fromage *= ratio;
      eau    *= ratio;
      ail    *= ratio;
      pain    *= ratio;

      System.out.println();
      System.out.print("Pour faire une fondue fribourgeoise pour " + nbConvives + " personne(s), ");
      System.out.println("il vous faut : ");
      System.out.println(" - " + fromage + " gr de Vacherin fribourgeois");
      System.out.println(" - " + eau + " dl d'eau");
      System.out.println(" - " + ail + " gousse(s) d'ail");
      System.out.println(" - " + pain + " gr de pain");
      System.out.println(" - du poivre à volonté");

	  clavier.close();
   }
   
}

