import java.util.ArrayList;

/**
 * 
 */

/**
 * @author timof
 *
 */
public class Class_route {
	private ArrayList<Class_GpsKoordinate> arrayList_route= new ArrayList<Class_GpsKoordinate>();

	/**
	 * @param name
	 */
	public Class_route(ArrayList<Class_GpsKoordinate> arrayList_route) {
		super();
		this.arrayList_route = arrayList_route;
		
	}
	
	public ArrayList<Double> method_errechneDistanz() {
		Class_GpsRechner Class_GpsRechner_rechner= new Class_GpsRechner();
		ArrayList<Double> doubels_ergebnis= new ArrayList<Double>();
		for (int zaehler = 0; zaehler <arrayList_route.size()-1; zaehler++) {
			doubels_ergebnis.add(Class_GpsRechner_rechner.method_distanz(arrayList_route.get(zaehler).getDouble_breitenGrad(), arrayList_route.get(zaehler).getDouble_laengenGrad(), arrayList_route.get(zaehler+1).getDouble_breitenGrad(), arrayList_route.get(zaehler+1).getDouble_laengenGrad()));
		}
		
		
		
		
		
		return doubels_ergebnis;
		
	}

	
}
