
//Testobjekt Koordinaten 
public class Koordinaten {
	private String breite;
	private String laenge;
	
	//Konstruktor
	Koordinaten(String breite, String laenge){
		this.breite = breite;
		this.laenge = laenge;
	}
	
	//Methode
	public String koordinate() {
		String position = breite + " " + laenge;
		return position;
//		System.out.println(position);
	}
	
}
