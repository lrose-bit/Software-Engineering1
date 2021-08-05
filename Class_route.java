import java.util.ArrayList;
import java.util.Iterator;

import javax.tools.Tool;

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
	
	public ArrayList<Double> method_getDistances() {
		Class_GpsRechner tool = new Class_GpsRechner();
		ArrayList<Double> doubels_ergebniss= new ArrayList<Double>();
		for (int counter = 0; counter <arrayList_route.size()-1; counter++) {
			doubels_ergebniss.add(tool.method_distance(arrayList_route.get(counter).getDouble_lat(), arrayList_route.get(counter).getDouble_lon(), arrayList_route.get(counter+1).getDouble_lat(), arrayList_route.get(counter+1).getDouble_lon()));
		}
		
		
		
		
		
		return doubels_ergebniss;
		
	}

	
}
