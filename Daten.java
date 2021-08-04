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
		
			PrintWriter pw = new PrintWriter(new FileWriter(daten));
			for(String a : position) {
				pw.println(a);
			}
			
			pw.flush(); //Schreibe String's in die Datei
			pw.close(); //Schließe PrintWriter
			
		}catch(Exception e) {
				e.printStackTrace(); //Fehlerbeschreibung
		}
		
	}
	
	//Methode .csv lesen
	public void positionLesen() {

		// Einlesen des Files und spliten
		FileReader daten = null;
		BufferedReader buff = null;
		String zeile;
		ArrayList<String> zeilen = new ArrayList<String>();

		try {
			daten = new FileReader("daten.csv");
			buff = new BufferedReader(daten);
			
			while ((zeile = buff.readLine()) != null) {
				//System.out.println(zeile); // Kontrolle was eingelesen wurde

				zeilen.add(zeile);
		
			}
		} catch (Exception e) {
			e.printStackTrace();
	}
		
	//System.out.println(zeilen);
		
	}
		
}

