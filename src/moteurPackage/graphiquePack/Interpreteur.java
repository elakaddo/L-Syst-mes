package moteurPackage.graphiquePack;

import java.util.Stack;

/**
	* Class Interpreteur nous permet d'interpreter un arbre en String vers
	* une visualisation graphique.
  * @author Akaddar Mohamed
  * Date 24/01/2022
  */

public class Interpreteur {

	private int x;
	private double alpha;
	private Turtle tortue;

	/**
	 * interpretaion de F, +, -, [ and ].
	 * @param x distance a avancer
	 * @param alpha l'angle de tourner soit + ou -
	 * */
	public Interpreteur(int x,double alpha)
	{
		this.x=x;
		this.alpha=alpha;

		this.tortue = new Turtle();
		this.tortue.up();
		this.tortue.setPosition(0, -400, 90);
		this.tortue.down();
		this.tortue.speed(0);
		this.tortue.penColor("oliverdrab");
		this.tortue.hide();


	}

	/**
	 * Visualisation de l'arbre interpeter d'apres lSystem
	 * @param chaine a visualiser
	 * */
	public void visualiser2D(String chaine)
	{
		//Creation de la pile :
		Stack<TortueEtat> etats = new Stack<TortueEtat>();

		for(int i=0 ; i<chaine.length(); i++)
		{
			char c = chaine.charAt(i);
			switch (c)
			{
			case 'F' :
				this.tortue.forward(this.x);
				break;
			case '+' :

				this.tortue.left(this.alpha);
				break;
			case '-' :
				this.tortue.right(this.alpha);
				break;
			case '[' :
				TortueEtat etat = new TortueEtat(this.tortue.getX(),this.tortue.getY(),this.tortue.getDirection());
				etats.push(etat);
				break;
			case ']' :
				if(!etats.isEmpty())
				{
					TortueEtat nvE = etats.pop();
					this.tortue.up();
					this.tortue.setPosition(nvE.getX(), nvE.getY(),nvE.getAngle());
					this.tortue.down();
				}
				break;
			default :
					break;
			}
		}
	}
	public void visualiser3D(String chaine)
	{
		//Creation de la pile :
		Stack<TortueEtat> etats = new Stack<TortueEtat>();

		for(int i=0 ; i<chaine.length(); i++)
		{
			char c = chaine.charAt(i);
			switch (c)
			{
			case 'F' :
				this.tortue.forward(this.x);
				break;
			case '+' :

				this.tortue.right(this.alpha);
				break;
			case '-' :
				this.tortue.left(this.alpha);
				break;
			case '[' :
				TortueEtat etat = new TortueEtat(this.tortue.getX(),this.tortue.getY(),this.tortue.getDirection());
				etats.push(etat);
				break;
			case ']' :
				if(!etats.isEmpty())
				{
					TortueEtat nvE = etats.pop();
					this.tortue.up();
					this.tortue.setPosition(nvE.getX(), nvE.getY(),nvE.getAngle());
					this.tortue.down();
				}
				break;
			case '&' :
				break;
			case '^' :
				break;
			case '/' :
				break;
			case '\\':
				break;
			case '|' :
				this.tortue.left(180);
				break;
			default :
					break;
			}
		}
	}

	}
