import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.JPanel;

public class GPS_GUI extends JFrame implements ActionListener {
  // Anfang Attribute
  JPanel karte = new JPanel();
  
  JButton okButton = new JButton("OK");
  JButton cancelButton = new JButton("Beenden");
  
  JTextField nfStartpunkt = new JTextField();
  JNumberField afStartpunkt = new JNumberField();
  JNumberField nfZielpunkt = new JNumberField();
  JNumberField afZielpunkt = new JNumberField();
  
  JLabel nfStartpunkt_Text = new JLabel("Start Breitengrad:");
  JLabel afStartpunkt_Text = new JLabel("Start Längengrad:");
  JLabel nfZielpunkt_Text = new JLabel("Ziel Breitengrad:");
  JLabel afZielpunkt_Text = new JLabel("Ziel Längengrad:");
  
  String text, text1, text2, text3;
  
  static int startLaengengrad;
  static int startBreitengrad;
  static int zielLaengengrad;
  static int zielBreitengrad;
  
  // Ende Attribute
  
  public GPS_GUI() { 
    // Frame-Initialisierung (Konstruktor)
    super();
    
    // setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        schliessen();
      }
    });
    
    // Einstellungen des Frames 
    int frameWidth = 588; 
    int frameHeight = 478;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Anzeigen der zurückgelegten Strecke");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    
    // Anfang Komponenten auf Frame
    
    // OK & Cancel Button: Position, Text, Mnemonic festlegen & Buttons dem Frame hinzufügen
    okButton.setBounds(57, 400, 85, 35);
    okButton.setMnemonic('O');
    okButton.setMargin(new Insets(2, 2, 2, 2));
    okButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        okButton_ActionPerformed(evt);
      }
    });
    cp.add(okButton);
    
    cancelButton.setBounds(223, 400, 85, 35);
    cancelButton.setMnemonic('B');
    cancelButton.setMargin(new Insets(2, 2, 2, 2));
    cancelButton.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        cancelButton_ActionPerformed(evt);
      }
    });
    cp.add(cancelButton);
    
    // Anmelden der Buttons beim ActionListener
    okButton.addActionListener(this);
    cancelButton.addActionListener(this);
    
    // Eingabefelder: Position festlegen & Felder dem Frame hinzufügen
    
    // Startfelder & Labels
    nfStartpunkt_Text.setBounds(435, 61, 110, 20);
    cp.add(nfStartpunkt_Text);
    
    nfStartpunkt.setBounds(435, 81, 123, 28);
    cp.add(nfStartpunkt);
    
    afStartpunkt_Text.setBounds(435, 121, 110, 20);
    cp.add(afStartpunkt_Text);
    
    afStartpunkt.setBounds(435, 141, 123, 28);
    cp.add(afStartpunkt);
    
    // Zielpunkte & Labels
    nfZielpunkt_Text.setBounds(435, 181, 110, 20);
    cp.add(nfZielpunkt_Text);
    
    nfZielpunkt.setBounds(435, 201, 123, 28);
    cp.add(nfZielpunkt);
    
    afZielpunkt_Text.setBounds(435, 241, 110, 20);
    cp.add(afZielpunkt_Text);
    
    afZielpunkt.setBounds(435, 261, 123, 28);
    cp.add(afZielpunkt);
    
    karte.setBounds(23, 11, 363, 364);
    cp.add(karte);
    
    cp.setBackground(new Color(0xC0C0C0));
    // Ende Komponenten auf Frame 
    
    setVisible(true);                        
  }
  
  /* Folgende Methode wird durch das Interface ActionListener
     deklariert und muss hier implementiert werden.
     Bewirkt, dass Start-und Zielpunkt nack Klicken des OK-Buttons angezeigt werden,
     nach Klicken des Cancel-Buttons wird GUI geschlossen.*/ 
  public void actionPerformed(ActionEvent evt) {
    if (evt.getSource() == okButton) {
      System.out.println("Startpunkt: " + nfStartpunkt.getText());
      text = nfStartpunkt.getText();
      startLaengengrad = Integer.parseInt (text);
      
      System.out.println("Startpunkt: " + afStartpunkt.getText());
      text1 = afStartpunkt.getText();
      startBreitengrad = Integer.parseInt (text1);
      
      System.out.println("Zielpunkt: " + nfZielpunkt.getText());
      text2 = nfZielpunkt.getText();
      zielLaengengrad = Integer.parseInt (text2);
      
      System.out.println("Startpunkt: " + afZielpunkt.getText());
      text3 = afZielpunkt.getText();
      zielBreitengrad = Integer.parseInt (text3);
    
    }
    if (evt.getSource() == cancelButton) {
      schliessen();
    }
  }
      
  // GUI-Fenster schließen
  void schliessen() {
    JFrame frame = new JFrame();
    String[] options = new String[2];
    options[0] = new String("Ja");
    options[1] = new String("Nein");

    int i = JOptionPane.showOptionDialog(frame.getContentPane(),"Möchten Sie wirklich aufhören?","Beenden", 0,
            JOptionPane.INFORMATION_MESSAGE,null,options,null);
    if (i == JOptionPane.YES_OPTION) {
      dispose();
      System.exit(0);
    }
  }  
    
  /* Methoden, um die Koordinaten einzugeben
     und zurückgelegte Strecke anzeigen zu lassen*/
  
  // Startpunkt kommt von der GPS_Maus
  /*public double getStartpunkt(Koordinaten startpunkt) {
  return startpunkt;
  }*/
  
  // Eingeben der Ziel-Koordinaten
  /*public double setZielpunkt(Koordinaten zielpunkt) {
  return zielpunkt;
  }*/
  
  // Anzeigen der zurückgelegten Strecke
  /*public void streckeDarstellen(Graphics g) {
    //g.drawLine(startpunkt, zielpunkt);
  }*/
  
  public void paint(Graphics g) {
    super.paint(g);
  }

    
  public static void main(String[]args) {
    GPS_GUI gui = new GPS_GUI();
  } 
  
  public void okButton_ActionPerformed(ActionEvent evt) {
    // ist schon in der Methode oben passiert, muss aber hier stehen bleiben! warum auch immer...
  } 
  public void cancelButton_ActionPerformed(ActionEvent evt) {
    // ist schon in der Methode oben passiert, muss aber hier stehen bleiben! warum auch immer...
  } 

  // Ende Methoden
}
