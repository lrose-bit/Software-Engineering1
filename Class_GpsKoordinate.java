import java.util.Objects;

/**
 * 
 */

/**
 * @author timof
 *
 */
public class Class_GpsKoordinate {
	private double double_lon;
	private double double_lat;


	
	public Class_GpsKoordinate( double double_lon, double double_lat) {
		super();
		this.double_lon = double_lon;
		this.double_lat = double_lat;
	}
	

	
	
	public double getDouble_lon() {
		return double_lon;
	}
	
	public void setDouble_lon(double double_lon) {
		this.double_lon = double_lon;
	}
	
	public double getDouble_lat() {
		return double_lat;
	}
	
	public void setDouble_lat(double double_lat) {
		this.double_lat = double_lat;
	}
	
	public int hashCode() {
		return Objects.hash(double_lat, double_lon);
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Class_GpsKoordinate other = (Class_GpsKoordinate) obj;
		return Double.doubleToLongBits(double_lat) == Double.doubleToLongBits(other.double_lat)
				&& Double.doubleToLongBits(double_lon) == Double.doubleToLongBits(other.double_lon);
	}
	
	public String toString() {
		return "class_GpsCoordinate [double_lon=" + double_lon + ", double_lat=" + double_lat + "]";
	}

	

}
