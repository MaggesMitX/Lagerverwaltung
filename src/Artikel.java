/**
 * Erstellen der Variablen für den Artikel
 */
public class Artikel {

    private String name;

    private int anzahl;

    /**
     * Erstellen eines neuen Artikels
     * @param name Variable name für den Konstruktor.
     * @param anzahl Variable anzahl für den Konstruktor.
     */
    public Artikel(String name, int anzahl){
        this.name = name;
        this.anzahl = anzahl;
    }

    /**
     * Gibt den Namen als String zurück
     * @return Gibt den AKTUELLEN benutzen Namen in die Methode an.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Gibt die Anzahl als Int zurück
     * @return Gibt den AKTUELLEN Wert an anzahl in die Methode an.
     */
    public int getAmount(){
        return this.anzahl;
    }


    /**
     * Verringerung der Anzahl an Artikel im Lager
     * @param wert Mit dieser this Methode wird die Anzahl verringert.
     */
    public void verringerAnzahl(int wert){
        this.anzahl -= wert;
    }

}
