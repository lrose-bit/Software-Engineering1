import java.util.ArrayList;

/**
 * 
 */

/**
 * @author timof
 *
 */
public class test_main {
	/*
		*//**
			 * @param args
			 */
	public static void main(String[] args) {
		//Eingabe
		Double double_breitenGrad = Math.toRadians(51.152565);
		Double double_laengengrad = Math.toRadians(11.809919);
		Double double_laengengrad2 = Math.toRadians(13.38886);
		Double double_breitenGrad2 = Math.toRadians(52.517037);
		double double_dist;
		double double_peilung;
		String string_himmelsrichtung;
		ArrayList<Class_GpsKoordinate> arrayList_route = new ArrayList<Class_GpsKoordinate>();
		Class_GpsRechner rechner = new Class_GpsRechner();
		//Verarbeitung
		Class_GpsKoordinate koordinate1 = new Class_GpsKoordinate(double_laengengrad, double_breitenGrad);
		Class_GpsKoordinate koordinate2 = new Class_GpsKoordinate(double_laengengrad2, double_breitenGrad2);
		arrayList_route.add(koordinate1);
		arrayList_route.add(koordinate2);

		double_dist = rechner.method_distanz(koordinate1.getDouble_breitenGrad(), koordinate1.getDouble_laengenGrad(),
				koordinate2.getDouble_breitenGrad(), koordinate2.getDouble_laengenGrad());

		double_peilung = rechner.method_PeilungKoordinaten(koordinate1.getDouble_breitenGrad(),
				koordinate1.getDouble_laengenGrad(), koordinate2.getDouble_breitenGrad(),
				koordinate2.getDouble_laengenGrad());

		string_himmelsrichtung = rechner.method_himmelsRichtung(double_peilung);
		
		//Ausgabe
		System.out.println("Die Entfernung der Punkte beträgt: " + Math.round(double_dist) + " Km Luftlinie "
				+ ",die Peilung von der ersten Koordinate zu zweiten beträgt: " + Math.round(double_peilung) + " Grad "
				+ string_himmelsrichtung);

	}
}
