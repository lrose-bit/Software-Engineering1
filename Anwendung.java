import java.util.ArrayList;

public class Anwendung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Deklarationen in der Gui hier nur für das Beispiel aufgelistet
		ArrayList<Double> arrayListerg_ErgebnisseDistanz = new ArrayList<Double>();
		ArrayList<Double> arrayListerg_ErgebnissePeilung = new ArrayList<Double>();
		ArrayList<Double> arrayListerg_ErgebnisseHimmelsRichtung = new ArrayList<Double>();

		// Die Anwendung startet, die Gui öffnet sich
		// Es können Zwei Koordinaten eingegeben werden oder der aufgezeichnete Weg wird
		// abgebildet

		// Fall Eins:
		// Koordinaten werden eingegeben und dan mit drücken des Ok Buttons an die
		// Methoden übergeben

		// fiktive Eingabe
		Double double_breitenGrad = Math.toRadians(51.152565);
		Double double_laengenGrad = Math.toRadians(11.809919);
		Double double_laengenGrad2 = Math.toRadians(13.38886);
		Double double_breitenGrad2 = Math.toRadians(52.517037);

		// Verarbeitung in der Gui
		// GUI Variabeln
		double double_dist;
		double double_peilung;
		String string_himmelsrichtung;
		ArrayList<Class_GpsKoordinate> arrayList_route = new ArrayList<Class_GpsKoordinate>();
		Class_GpsRechner rechner = new Class_GpsRechner();

		double_dist = rechner.method_distanz(double_breitenGrad, double_laengenGrad, double_breitenGrad2,
				double_laengenGrad2);
		double_peilung = rechner.method_peilungKoordinaten(double_breitenGrad, double_laengenGrad, double_breitenGrad2,
				double_laengenGrad2);
		string_himmelsrichtung = rechner.method_himmelsRichtung(double_peilung);
		// Ausgabe der Ergebinisse in der GUI
		System.out.println("Die Entfernung der Punkte beträgt: " + Math.round(double_dist) + " Km Luftlinie "
				+ ",die Peilung von der ersten Koordinate zu zweiten beträgt: " + Math.round(double_peilung) + " Grad "
				+ string_himmelsrichtung);
		// Ausgabe der Ergebinisse in der GUI

		/*
		 * Fall 2
		 * 
		 * Aktuellen Standort durch Button in der Gui ermitteln mehrere Standorte können
		 * so ermittelt werden und werden in einer ArrayList gespeichert
		 *
		 * ArrayList<Class_GpsKoordinate> arrayList_routeZwischenspeichern= new
		 * ArrayList<Class_GpsKoordinate>();
		 * arrayList_routeZwischenspeichern.add(Gps_Maus.koordinateAuslesen());
		 * arrayList_routeZwischenspeichern.add(Gps_Maus.koordinateAuslesen());
		 * 
		 * ArrayList<String> arrayList_positionSpeichernArrayList =new
		 * ArrayList<String>(); for (int counter = 0; counter <
		 * positionSpeichernArrayList.size(); counter++) {
		 * positionSpeichernArrayList.add(arrayList_routeZwischenspeichern(counter).
		 * toString()); }
		 *
		 * Daten daten_positionen=new Daten(arrayList_positionSpeichernArrayList);
		 * /daten_positionen.positionSpeichern();
		 * 
		 * Wenn in der Gui die Ausgabe gewünscht wird erfolgt die Berechnung
		 *
		 * daten_positionen.positionLesen(); ArrayList<Class_GpsKoordinate>
		 * arrayList_routeGUI ; arrayList_routeGUI=daten_positionen.positionLesen();
		 * 
		 * Class_route Class_route_testroute= new Class_route(arrayList_routeGUI);
		 * arrayListerg_ErgebnisseDistanz=
		 * Class_route_testroute.method_errechneDistanz();
		 * arrayListerg_ErgebnissePeilung=
		 * Class_route_testroute.method_errechnePeilung();
		 * arrayListerg_ErgebnisseHimmelsRichtung=Class_route_testroute.
		 * method_errechneHimmelsRichtung(): Die Ergebnisse werden in der Gui
		 * dargestellt
		 */

		//In der Main wird eigentlich nur die Gui gestartet und dann wieder beendet
		
		
		
		
	}

}
