import java.util.ArrayList;
import java.util.Objects;

public class TestMain {
	
	public TestMain(double laengenGrad, double breitenGrad) {
		
	}

	public static void main(String[] args){
		
			//ArrayList zum speichern der Koordinaten
			ArrayList<String> position = new ArrayList<String>();
			String pos1 = "51.152565!11.809919";
			String pos2 = "52.152565!12.809919";
			
			//Position zur ArrayList hinzufügen
			position.add(pos1);
			position.add(pos2);

			//Methode positionSpeichern aufrufen
			Daten daten = new Daten(position);
			daten.positionSpeichern();
			
			//Methode positionSpeichern ausführen
			System.out.println(daten.positionLesen());
				
		.
	}

}
