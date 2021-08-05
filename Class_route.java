import java.util.ArrayList;

/**
 * 
 */

/**
 * @author timof
 *
 */// Dient dazu direkt mit den ArrayList zu rechnen und mehrere Koordinaten zu
	// verarbeiten
public class Class_route {
	private ArrayList<Class_GpsKoordinate> arrayList_route = new ArrayList<Class_GpsKoordinate>();

	// Konstruktor
	public Class_route(ArrayList<Class_GpsKoordinate> arrayList_route) {

		this.arrayList_route = arrayList_route;

	}

	// Diese Methode errechnet die Entfernung zwischen Koordinaten sortiert nach dem
	// Indize und speichert die Distanzen in einer Double Array List
	public ArrayList<Double> method_errechneDistanz() {
		// Class_GpsRechner wird instanziert
		Class_GpsRechner Class_GpsRechner_rechner = new Class_GpsRechner();
		ArrayList<Double> doubels_ergebnis = new ArrayList<Double>();
		// Die Entfernungen werden berechnet und übergeben. Hierzu wird die Methode
		// method_distanz aus der Klasse Class_GpsRechner benutzt
		for (int zaehler = 0; zaehler < arrayList_route.size() - 1; zaehler++) {
			doubels_ergebnis
					.add(Class_GpsRechner_rechner.method_distanz(arrayList_route.get(zaehler).getDouble_breitenGrad(),
							arrayList_route.get(zaehler).getDouble_laengenGrad(),
							arrayList_route.get(zaehler + 1).getDouble_breitenGrad(),
							arrayList_route.get(zaehler + 1).getDouble_laengenGrad()));
		}
		// Die Entfernungen werden returnt
		return doubels_ergebnis;
	}

	// Diese Methode errechnet die Peilung in Grad zwischen zwei Koordinaten
	// sortiert nach dem Indize und speichert die Distanzen in einer Double Array
	// List
	public ArrayList<Double> method_errechnePeilung() {
		Class_GpsRechner Class_GpsRechner_rechner = new Class_GpsRechner();
		ArrayList<Double> doubels_ergebnis = new ArrayList<Double>();
		// Die Peilungen werden berechnet und übergeben. Hierzu wird die Methode
		// method_peilungKoordinaten aus der Klasse Class_GpsRechner benutzt
		for (int zaehler = 0; zaehler < arrayList_route.size() - 1; zaehler++) {
			doubels_ergebnis.add(Class_GpsRechner_rechner.method_peilungKoordinaten(
					arrayList_route.get(zaehler).getDouble_breitenGrad(),
					arrayList_route.get(zaehler).getDouble_laengenGrad(),
					arrayList_route.get(zaehler + 1).getDouble_breitenGrad(),
					arrayList_route.get(zaehler + 1).getDouble_laengenGrad()));
			// Die Peilungen werden returnt
		}
		return doubels_ergebnis;
	}

	// Diese Methode errechnet die Himmelsrichtung in zwischen zwei Koordinaten
	// sortiert nach dem Indize und speichert die Distanzen in einer String Array
	// List
	public ArrayList<String> method_errechneHimmelsRichtung(ArrayList<Double> errechneHimmelsRichtung) {
		Class_GpsRechner Class_GpsRechner_rechner = new Class_GpsRechner();
		ArrayList<String> ergebnis = new ArrayList<String>();
		// Die Himmelsrichtungen werden ermittelt und übergeben. Hierzu wird die Methode
		// method_himmelsRichtung aus der Klasse Class_GpsRechner benutzt
		for (int zaehler = 0; zaehler < arrayList_route.size() - 1; zaehler++) {
			ergebnis.add(Class_GpsRechner_rechner.method_himmelsRichtung(errechneHimmelsRichtung.get(zaehler)));
			// Die Himmelsrichtungen werden returnt
		}
		return ergebnis;
	}

}
