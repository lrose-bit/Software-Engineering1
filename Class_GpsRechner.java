
/**
 * 
 */

/**
 * @author timof
 *
 */// Berechnet die Entfernung, Peilung, Himmelsrichtung
public class Class_GpsRechner {

	public Class_GpsRechner() {

	}


	public double method_peilungKoordinaten(double double_breitenGrad1, double double_laengenGrad1,
			double double_breitenGrad2, double double_laengenGrad2) {

//Errechnet die Peilung einer Koordinate zur nächsten
		double double_peilung = (Math.toDegrees(Math.atan2(
				(Math.sin(double_laengenGrad2 - double_laengenGrad1) * Math.cos(double_breitenGrad2)),
				((Math.cos(double_breitenGrad1) * Math.sin(double_breitenGrad2)) - ((Math.sin(double_breitenGrad1)
						* Math.cos(double_breitenGrad2) * Math.cos(double_laengenGrad2 - double_laengenGrad1)))))));

		return double_peilung;
	}

	public double method_distanz(double double_breitenGrad1, double double_laengenGrad1, double double_breitenGrad2,
			double double_laengenGrad2) {

//Berechnet die Distanz in Kilometern	
		double double_dist = Math
				.acos(Math.sin(double_breitenGrad1) * Math.sin(double_breitenGrad2) + Math.cos(double_breitenGrad1)
						* Math.cos(double_breitenGrad2) * Math.cos(double_laengenGrad2 - double_laengenGrad1));
		double_dist = double_dist * 6371;// 6371 ist der Erdumfang
		return double_dist;

	}

	// Prüft die Gradzahl und vergleicht die Gradwerte mit der zugehörigen
	// Himmelsrichtung
	public String method_himmelsRichtung(double double_peilung) {
		String string_himmelsRichtung = null;
//N= Norden S= Suedem W= Westen O= Osten
		if (double_peilung > 0 && double_peilung < 22.5) {
			string_himmelsRichtung = "N";

		} else if (double_peilung > 22.5 && double_peilung < 45) {
			string_himmelsRichtung = "NNO";

		} else if (double_peilung > 45 && double_peilung < 67.5) {

			string_himmelsRichtung = "ONO";

		} else if (double_peilung > 67.5 && double_peilung < 90) {
			string_himmelsRichtung = "O";

		} else if (double_peilung > 90 && double_peilung < 112.5) {
			string_himmelsRichtung = "OSO";

		} else if (double_peilung > 112.5 && double_peilung < 135) {
			string_himmelsRichtung = "SO";

		} else if (double_peilung > 135 && double_peilung < 157.5) {
			string_himmelsRichtung = "SSO";
		} else if (double_peilung > 157.5 && double_peilung < 180) {
			string_himmelsRichtung = "S";
		} else if (double_peilung > 180 && double_peilung < 202.5) {
			string_himmelsRichtung = "SSW";
		} else if (double_peilung > 202.5 && double_peilung < 225) {
			string_himmelsRichtung = "SW";
		} else if (double_peilung > 225 && double_peilung < 247.5) {
			string_himmelsRichtung = "WSW";
		} else if (double_peilung > 247.5 && double_peilung < 270) {
			string_himmelsRichtung = "W";
		} else if (double_peilung > 270 && double_peilung < 292.5) {
			string_himmelsRichtung = "WNW";
		} else if (double_peilung > 292.5 && double_peilung < 315) {
			string_himmelsRichtung = "NW";
		} else if (double_peilung > 315 && double_peilung < 337.5) {
			string_himmelsRichtung = "NNW";
		} else if (double_peilung > 337.5) {
			string_himmelsRichtung = "N";
		} else {

		}
		return string_himmelsRichtung;
	}

}
