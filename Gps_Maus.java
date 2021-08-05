/*
Autor:Lars Rose

 */


import com.fazecast.jSerialComm.SerialPort;
import com.fazecast.jSerialComm.SerialPortDataListener;
import com.fazecast.jSerialComm.SerialPortEvent;

import java.util.concurrent.TimeUnit;


public class Gps_Maus {
    

    static SerialPort comPort;
    static String stringBuffer;
    static String ausgabe = "";
    static String koordinaten;
    static double breitenGrad;
    static double laengenGrad;
    static int i = 0;

    private static final class DataListener implements SerialPortDataListener {
        @Override
        public int getListeningEvents() {
            return SerialPort.LISTENING_EVENT_DATA_AVAILABLE;
        }

        @Override
        public void serialEvent(SerialPortEvent event) {

            //Event für Datenübertragung erstellen
            if (event.getEventType() != SerialPort.LISTENING_EVENT_DATA_AVAILABLE)
                return;
            byte[] newData = new byte[comPort.bytesAvailable()];
            int numRead = comPort.readBytes(newData, newData.length);
            stringBuffer = new String(newData, 0, numRead);
            //Daten aus stringBuffer in ausgabe schreiben
            ausgabe += stringBuffer;
            //System.out.println(stringBuffer);

        }
    }

    static void koordinateAuslesen() throws InterruptedException {
        //Port mit GpsMaus aus Array von allen angeschlossenen Ports öffnen
        // 2 Manuell eingetragen da das Port an dritter Stelle der Com Ports ist(kommt auf die Stelle im eigenen Pc an)
        comPort = SerialPort.getCommPorts()[2];
        comPort.openPort();
        //Name des Ports und vom Gerät
        System.out.println("COM port open: " + comPort.getDescriptivePortName());


        //Datalistener Instanz erstellen und öffnen um Daten zu empfangen
        DataListener listener = new DataListener();
        comPort.addDataListener(listener);
        System.out.println("Event Listener open.");

        //Warten bis Daten ausgelesen wurden, um dann den Port wieder zu schließen
        TimeUnit.SECONDS.sleep(1);
        comPort.closePort();

        //ausgabe nach dem Passenden NMEA-Datensatz filtern
        //System.out.println("ausgabe: " + ausgabe);
        int index = ausgabe.indexOf("GNGGA");
        //System.out.println(index);

        //Auf Basis der Index-Position Substring von dem ausgabe erstellen
        koordinaten = ausgabe.substring(index, index + 76);
        //System.out.println("FilterString: " + koordinaten);

        //Substring bei den Kommas spliten um so die einzelnen Teile verwenden zu können
        String[] sentenceParts = koordinaten.split(",");

        //Überprüfung des Splits
        /*
        for (int i = 0; i < sentenceParts.length; i++) {
            System.out.println(sentenceParts[i]);
        }
        */

        //Breiten- und LaengenGrad von String nach Double parsen und /100 rechnen um so die Dezimalgrad darstellung
        //von den koordinaten zu haben
        breitenGrad = Double.parseDouble(sentenceParts[2]) / 100;
        laengenGrad = Double.parseDouble(sentenceParts[4]) / 100;
        //Breiten- und Laengengrad der aktuellen Position ausgeben
        System.out.println("Breitengrad: " + breitenGrad + "\nLängenGrad: " + laengenGrad);
        //Uhrzeit von der Gps-abfrage
        System.out.println(sentenceParts[1].substring(0, 2) + ":" + sentenceParts[1].substring(2, 4) + ":" + sentenceParts[1].substring(4, 6) + " UTC");

    }

    static public void main(String[] args) throws InterruptedException {

        koordinateAuslesen();

    }
}