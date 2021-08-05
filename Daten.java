import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;

public class Daten {
	
	//ArrayList der Koordinaten
	private ArrayList<String> position = new ArrayList<String>();
	
	//Konstruktor
		Daten(ArrayList<String> position){
			this.position = position;
		}
	
	//Methode zum Speichern der Positionen in eine .csv Datei
	public void  positionSpeichern() {
		
		try {	

			File daten = new File("daten.csv"); //Datei aufrufen
			daten.delete(); //Lösche Datei "Daten" falls vorhanden
			daten.createNewFile(); //Datei erstellen falls nicht vorhanden
			
			//Übergebe alle Positionen aus der ArrayList in Daten.csv
			PrintWriter pw = new PrintWriter(new FileWriter(daten));
			for(String a : position) {
				pw.println(a);
			}
			
			pw.flush(); //Schreibe und speicher String's in die Datei
			pw.close(); //Schließe PrintWriter
			
		}catch(Exception e) {
				e.printStackTrace(); //Fehlerbeschreibung
		}
		
	}
	
	//Methode .csv lesen
	public  ArrayList<Class_GpsCoordinate> positionLesen() {

		// Einlesen des Files und spliten
		FileReader daten = null;
		BufferedReader buff = null;
		String zeile;
		ArrayList<String> zeilen = new ArrayList<String>();
		
		try {
			daten = new FileReader("daten.csv"); //Greife auf Daten.csv zu
			buff = new BufferedReader(daten); //Lese Daten.csv aus
			
			//Schleife die solange alle Werte in ein Array speichert bis keine mehr Vorhanden sind
			while ((zeile = buff.readLine()) != null) {
				//System.out.println(zeile); // Kontrolle was eingelesen wurde
				
				zeilen.add(zeile);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
	

		//ArrayList für die Zurückgabe eines im passenden Datenformat (ArrayList mit Objekten vom Datentyp Double)
		ArrayList<Class_GpsCoordinate> gpsKoordinate = new ArrayList<Class_GpsCoordinate>();  
	
		//Splite die ArrayList position in längengrad und breitengrad		
		for(String grad : zeilen ) {
			String[] gra = grad.split("!");
		
			//Umwandelung von String in Double
			double lengthDegree = Double.parseDouble(gra[0]);
			double widthDegree = Double.parseDouble(gra[1]);
			System.out.println(lengthDegree);
			System.out.println(widthDegree);
		
			//Erstelle neues Objekt vom Typ 
			Class_GpsCoordinate koordinateEins = new Class_GpsCoordinate(lengthDegree, widthDegree);
			gpsKoordinate.add(koordinateEins);
			
			System.out.println(gpsKoordinate.get(1).getDouble_lat());
			System.out.println(gpsKoordinate.get(1).getDouble_lon());
			
			}
			
			//Gebe gpsKoordinate zurück
			return gpsKoordinate;		
		
	}
		
}

