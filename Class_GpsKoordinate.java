import java.util.Objects;

/**
 * 
 */

/**
 * @author timof
 *
 */
public class Class_GpsKoordinate {
	private double double_laengenGrad;
	private double double_breitenGrad;


	
	public Class_GpsKoordinate( double double_leangenGrad, double double_breitenGrad) {
		super();
		this.double_laengenGrad = double_leangenGrad;
		this.double_breitenGrad = double_breitenGrad;
	}



	/**
	 * @return the double_laengenGrad
	 */
	public double getDouble_laengenGrad() {
		return double_laengenGrad;
	}



	/**
	 * @param double_laengenGrad the double_laengenGrad to set
	 */
	public void setDouble_laengenGrad(double double_laengenGrad) {
		this.double_laengenGrad = double_laengenGrad;
	}



	/**
	 * @return the double_breitenGrad
	 */
	public double getDouble_breitenGrad() {
		return double_breitenGrad;
	}



	/**
	 * @param double_breitenGrad the double_breitenGrad to set
	 */
	public void setDouble_breitenGrad(double double_breitenGrad) {
		this.double_breitenGrad = double_breitenGrad;
	}



	@Override
	public int hashCode() {
		return Objects.hash(double_breitenGrad, double_laengenGrad);
	}



	@Override
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



	@Override
	public String toString() {
		return  double_laengenGrad+"!"+double_breitenGrad;
	}}
	

	
	