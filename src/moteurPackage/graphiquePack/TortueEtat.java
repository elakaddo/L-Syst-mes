package moteurPackage.graphiquePack;

/**
*Class TortueEtat est tres utile pour sauvegarder la posistion de la Tortue.
 * @author Akaddar Mohamed
 * @date 24/01/2022
 */

public class TortueEtat {

	private double x;
	private double y;
	private double angle;

	public TortueEtat()
	{}
	/**
	 * @param x position x de la tortue
	 * @param y position y de la tortue
	 * @param angle l'angle de direction de la tortue
	 * */
	public TortueEtat(double x, double y, double angle) {
		    this.x = x;
	      this.y = y;
	      this.angle = angle;
	}

	/**
	 * @return position X
	 * */
	public double getX()
	{
		return this.x;
	}

	/**
	 * @return position Y
	 * */
	public double getY()
	{
		return this.y;
	}

	/**
	 * @return l'angle
	 * */
	public double getAngle()
	{
		return this.angle;
	}

}
