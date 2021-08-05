
/**
 * 
 */

/**
 * @author timof
 *
 */

//Dient als Speicher für die Koordinaten
public class Class_GpsKoordinate {
	// parameter
	private double double_laengenGrad;
	private double double_breitenGrad;

	// Konstruktor
	public Class_GpsKoordinate(double double_leangenGrad, double double_breitenGrad) {
		super();
		this.double_laengenGrad = double_leangenGrad;
		this.double_breitenGrad = double_breitenGrad;
	}

	/**
	 * @return den double_laengenGrad
	 */
	public double getDouble_laengenGrad() {
		return double_laengenGrad;
	}

	/**
	 * @param double_laengenGrad um double_laengenGrad zu überschreiben
	 */
	public void setDouble_laengenGrad(double double_laengenGrad) {
		this.double_laengenGrad = double_laengenGrad;
	}

	/**
	 * @return den double_breitenGrad
	 */
	public double getDouble_breitenGrad() {
		return double_breitenGrad;
	}

	/**
	 * @param double_breitenGrad um double_breitenGrad zu überschreiben
	 */
	public void setDouble_breitenGrad(double double_breitenGrad) {
		this.double_breitenGrad = double_breitenGrad;
	}

	// Ermöglicht den vergleich von zwei Objekten dieser Klasse
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class_GpsKoordinate other = (Class_GpsKoordinate) obj;
		return Double.doubleToLongBits(double_breitenGrad) == Double.doubleToLongBits(other.double_breitenGrad)
				&& Double.doubleToLongBits(double_laengenGrad) == Double.doubleToLongBits(other.double_laengenGrad);
	}

	// Gibt die Werte des Objekts als String zurück
	public String toString() {
		return double_laengenGrad + "!" + double_breitenGrad;
	}
}
