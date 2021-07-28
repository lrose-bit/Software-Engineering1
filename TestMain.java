import java.util.ArrayList;

public class TestMain {
	
	public static void main(String[] args){
		
			//ArrayList zum speichern der Koordinaten
			ArrayList<String> position = new ArrayList<String>();
		
			//TESTEN - Koordinaten (Breite = b / Länge = l) um die Klasse "Daten" unabhängig zu testen.
			String b1 = "51° 21' 59.0\" N";
			String l1 = "7° 29' 51.3\" O";
			String b2 = "51° 22' 6.0\" N";
			String l2 = "7° 41' 14.5\" O";
			String b3 = "51° 33' 42.8\" N";
			String l3 = "8° 6' 46.8\" O";
			String b4 = "51° 21' 42.5\" N";
			String l4 = "8° 17' 45.3\" O";
			
			//Array zum zwischenspeichern der Testdaten Breite
			String [] testB = {b1, b2, b3, b4};
			
			//Array zum zwischenspeichern der Testdaten Laenge
			String [] testL = {l1, l2, l3, l4};
			
			//For-Schleife: Zeilenindex => i, Spaltenindex => j
			for(int i = 0; i < testB.length; i++) {
				int j = i;
				
				//Array String zu Single String breite
				StringBuilder b = new StringBuilder();
				b.append(testB[i]);
				String breite = b.toString();
//				System.out.println(breite);
				
				//Array String zu Single String laenge
				StringBuilder l = new StringBuilder();
				l.append(testL[j]);
				String laenge = l.toString();
//				System.out.println(laenge);
				
				//Methode - Methode Koordinate aus Koordinaten aufrufen
				Koordinaten positionen = new Koordinaten(breite, laenge);
				
				//Rückgabewert von Methode Koordinate
				String resultPosition = positionen.koordinate();
//				System.out.println(resultPosition);
				
				//Schreibe Koordinate in ArrayList
				position.add(resultPosition);
				
				}
			
//			System.out.println(position);
			
			//Methode positionSpeichern aufrufen
			Daten positionTest = new Daten(position);
			positionTest.positionSpeichern();
				
		}

}

