class Main {
    public static void main(String[] args) {

        /** Auf statische Variablen und Methoden können mit mit dem
         * Namen der Klasse zugreifen und benötigen kein Objekt dafür.
         */
        System.out.println("Der aktuelle Zinzsatz ist "+Konto.zinssatz+"%.");

        System.out.println("Es gibt "+Konto.getAnzahlKonten()+" Konten.");

        Konto konto1 = new Konto();

        System.out.println("Es gibt "+Konto.getAnzahlKonten()+" Konten.");

        Konto konto2 = new Konto();

        System.out.println("Es gibt "+Konto.getAnzahlKonten()+" Konten.");

        Konto.resetAnzahlKonten();

        System.out.println("Es gibt "+Konto.getAnzahlKonten()+" Konten.");

        System.out.println("Das Konto hat die Kontonummer "+konto2.getKontonummer()+".");
    }
}
