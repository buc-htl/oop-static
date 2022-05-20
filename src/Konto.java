public class Konto {

    /**
     * Bei Attributen besitzt jedes Objekt seine eigene Kopie.
     * Jedes Objekt der Klasse Konto besitzt also seinen eigenen kontostand,* seinen eigenen Inhaber und seine eigene Kontonummer.
     */
    private double kontostand;
    private String inhaber;
    private int kontonummer;

    /**
     * Was wenn wir jetzt jedem Konto einfach eine fortlaufende Nummer
     * geben wollen? Diese fortlaufende Nummer ist keine Eigenschaft
     * eines spezifischen Objekts, sondern eine Eigenschaft aller Konten.
     *
     * Wollen wir, dass eine Variable nur einmal und auch ohne Objekt zur
     * Verfügung steht, schreiben wir "static" davor
     */
    private static int anzahlKonten;

    /**
     * "static" wird z.B. auch für Konstanten gerne verwendet.
     * final erzeugt eine Konstante (hat prinzipiell nichts mit static zu tun, kann mit oder ohne static verwendet werden)
     **/
    public static final float zinssatz = 0.25f;


    public Konto(){
        kontonummer = anzahlKonten; //jedes Konto bekommt eine fortlaufende Nummer;
        anzahlKonten++;
    }

    /**
     Es gibt auch statische Methoden. Diese können aufgerufen werden, ohne dass ein Objekt benötigt wird. Daher können sie auch nur auf statische Variablen zugreifen und andere statische Methoden aufrufen.
     */
    public static int getAnzahlKonten() {
        return anzahlKonten;
    }

    public static void resetAnzahlKonten() {
        anzahlKonten = 0;

        //folgende Zeile geht nicht, weil ich in statischen Methoden nicht
        // auf nicht-statische Variablen/Methoden zugreifen kann.
        //kontostand = 0;
    }

    /*
     Diese Methode greift auf (nicht statische) Attribute zu, ist also eine nicht-statische Methode und
     benötigt ein Objekt um aufgerufen werden zu können.
    */
    public int getKontonummer(){
        return kontonummer;
    }

}