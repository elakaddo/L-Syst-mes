package moteurPackage.reecriturePack;

/**
* Class LSysteme est un systeme de reecriture
 * @author Akaddar Mohamed
 * Date 24/01/2022
 *
 */


import java.util.ArrayList;


public class LSysteme {

	private String axiome;
	private ArrayList<Regles> regles;

	//Constructeur
	public LSysteme(String axiome, ArrayList<Regles> regles)
	{
		this.axiome = axiome;
		this.regles = regles;
	}

	/**
	 * @nbI nombre d'iterations
	 * @return la chaine de caracteres generee
	 * */
	public String generer(int nbI)
	{
		String axiom = this.axiome;

		for(int i=0 ; i<nbI ; i++) {
			String chaine = "";

			for(int j=0 ; j<axiom.length() ; j++)
			{
				boolean estTransformer = false;
				for(Regles r : this.regles)
				{
					if(r.estAppliquee(axiom.charAt(j)))
					{
						estTransformer = true;
						chaine += r.getLettreT();
						break;
					}
				}
				if(!estTransformer)
				{
					chaine += axiom.charAt(j);
				}
			}
			axiom = chaine;
		}
		return axiom;
	}


}
