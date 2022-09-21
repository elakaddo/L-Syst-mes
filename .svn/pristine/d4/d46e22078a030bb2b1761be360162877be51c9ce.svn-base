package demoPackage;

/**
* Classe Demo : Donne à l'utilisateur le droit de saisir les paramétres de L-Systèmes
* (Nombre de règles, l'axiom, l'angle, nombre d'itération)
 * @author Mohamed Akaddar
 * Date 05/02/2022
 *
 *
 * */
import moteurPackage.reecriturePack.*;
import moteurPackage.graphiquePack.Interpreteur;
import java.util.ArrayList;
import java.util.Scanner;



 public class Demo  {
	 public static double angle;
	/** Méthode permet de personnaliser l'arbre à dessiner
	 * @return chaine chaine de caracteres
	 * */
	public static String arbre()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nCombien de régles : ");
		int n = sc.nextInt();
		while (n<=0)
		{
			System.out.println("Nombre de règles doit être un nombre > à 0 \nReéssayer :");
			 n = sc.nextInt();
		}

		ArrayList<Regles> r = new ArrayList<Regles>();
		for(int i=1 ; i<=n;i++)
		{
			System.out.print("\nDonner regles "+i+".a : ");
			String sa = sc.next();

			System.out.print("\nDonner regles "+i+".b : ");
			String sb = sc.next();

			r.add(new Regles(sa, sb));
		}
		System.out.print("\nDonner l'axiom : ");
		LSysteme ls = new LSysteme(sc.next(),r);

		System.out.print("\nDonner l'angle (Attention au séparateur ',' en FR ou '.' ENG): ");
		angle = sc.nextDouble();

		System.out.print("\nDonner le nombre d'itérations : ");
		int i = sc.nextInt();
		String chaine = ls.generer(i);

		sc.close();
		return chaine;
	}

	public static void main(String[] args)
	{
		String arbre = Demo.arbre();
		Interpreteur i = new  Interpreteur(10,angle);
		i.visualiser2D(arbre);
	}

}
